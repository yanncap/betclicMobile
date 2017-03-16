package betclic.m2i.com.betclicmobile.api;

import java.util.List;

import betclic.m2i.com.betclicmobile.models.Meeting;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by formation on 16/03/17.
 */

public interface BetclicApi {
    @GET("api/meetings")
    public Call<List<Meeting>> getMeetings();

    @POST("api/login")
    public Call<String> login(@Query("email") String email,@Query("password") String password);
}
