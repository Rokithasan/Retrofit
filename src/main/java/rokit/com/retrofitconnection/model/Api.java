package rokit.com.retrofitconnection.model;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://reqres.in/";

    /**
     *
     * @return
     */
    @GET("https://reqres.in/api/users/2")

    Call<List<UserModel>> getUserCall();

}
