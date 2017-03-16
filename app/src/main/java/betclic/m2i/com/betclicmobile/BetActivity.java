package betclic.m2i.com.betclicmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import betclic.m2i.com.betclicmobile.api.BetclicApi;
import betclic.m2i.com.betclicmobile.api.BetclicApiService;
import betclic.m2i.com.betclicmobile.models.Meeting;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BetActivity extends AppCompatActivity {
    private static final String TAG = BetActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BetclicApi betclicApi = BetclicApiService.getInstance();
        betclicApi.getMeetings().enqueue(new Callback<List<Meeting>>() {
            @Override
            public void onResponse(Call<List<Meeting>> call, Response<List<Meeting>> response) {
                Log.d(TAG, String.format("body : %s", response.body()));
            }

            @Override
            public void onFailure(Call<List<Meeting>> call, Throwable t) {
                Log.d(TAG, String.format("erreur : %s", t.getMessage()));
            }
        });
    }
}
