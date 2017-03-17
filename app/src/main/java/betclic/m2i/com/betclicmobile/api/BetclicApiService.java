package betclic.m2i.com.betclicmobile.api;

import android.content.Context;

import com.tientun.mockresponse.FakeInterceptor;

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

    public static BetclicApi getInstance(Context context){
        if(betclicApiInstance == null){

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            String url;
            if(BuildConfig.DEBUG){
//                HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//                logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//                httpClient.addInterceptor(logging);
                url = "http://mock.api";
                httpClient.addInterceptor(new FakeInterceptor(context));
            }
            else{
                url = "http://10.110.10.40:9000/";
            }

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();

            betclicApiInstance = retrofit.create(BetclicApi.class);

        }
        return betclicApiInstance;
    }

}
