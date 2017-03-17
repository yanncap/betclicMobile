package betclic.m2i.com.betclicmobile.api;

import betclic.m2i.com.betclicmobile.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by formation on 16/03/17.
 */

public class BetclicApiService {
    private static BetclicApi betclicApiInstance;

    public static BetclicApi getInstance(){
        if(betclicApiInstance == null){

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            if(BuildConfig.DEBUG){
                HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
                logging.setLevel(HttpLoggingInterceptor.Level.BODY);
                httpClient.addInterceptor(logging);
            }

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://10.110.10.40:9000/")
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            betclicApiInstance = retrofit.create(BetclicApi.class);

        }
        return betclicApiInstance;
    }

}
