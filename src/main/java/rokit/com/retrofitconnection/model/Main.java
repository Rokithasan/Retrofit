package rokit.com.retrofitconnection.model;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main {

    public static void main(String[] args) {
        
        // set api url to convert data into GSON file.
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        System.out.println(retrofit);

        // Call User Service to print our collected data
        UserService service = retrofit.create(UserService.class);
        Call<User> callSync = (Call<User>) service.getUser("eugenp");

        try {
            Response<User> response = callSync.execute();
            User user = response.body();
            System.out.println(user.toString());
        } catch (Exception ex) {
            System.out.println();
        }
        System.exit(0);
    }

}
