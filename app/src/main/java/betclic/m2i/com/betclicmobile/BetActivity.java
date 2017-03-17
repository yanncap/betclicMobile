package betclic.m2i.com.betclicmobile;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import betclic.m2i.com.betclicmobile.api.BetclicApi;
import betclic.m2i.com.betclicmobile.api.BetclicApiService;
import betclic.m2i.com.betclicmobile.adapters.MeetingAdapter;
import betclic.m2i.com.betclicmobile.models.Meeting;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BetActivity extends AppCompatActivity {
    private static final String TAG = BetActivity.class.getSimpleName();
    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigation;
    @BindView(R.id.meetingList)
    RecyclerView meetingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bet);
        ButterKnife.bind(this);

        BetclicApi betclicApi = BetclicApiService.getInstance(this);
        betclicApi.getMeetings().enqueue(new Callback<List<Meeting>>() {
            @Override
            public void onResponse(Call<List<Meeting>> call, Response<List<Meeting>> response) {
                Log.d(TAG, String.format("body : %s", response.body()));
                List<Meeting> meetings = response.body();

                meetingList.setLayoutManager(new LinearLayoutManager(BetActivity.this));
                meetingList.setAdapter(new MeetingAdapter(meetings));
            }

            @Override
            public void onFailure(Call<List<Meeting>> call, Throwable t) {
                Log.d(TAG, String.format("erreur : %s", t.getMessage()));
            }
        });
    }
}
