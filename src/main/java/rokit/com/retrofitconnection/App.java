package rokit.com.retrofitconnection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import retrofit2.converter.gson.GsonConverterFactory;
import rokit.com.retrofitconnection.model.Api;
import rokit.com.retrofitconnection.model.UserModel;

import java.io.IOException;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static String fname, lname;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        Api api = retrofit.create(Api.class);

        Call<List<UserModel>> call = api.getUserCall();
        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> rspns) {

                List<UserModel> user = rspns.body();

                for (UserModel u : user) {
                    fname = u.getFirstName();
                    lname = u.getLastName();

                }

                System.out.println(fname+" "+lname);
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable thrwbl) {

                System.out.println("This status On Failure");
            }
        });

    }

}
