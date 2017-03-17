package betclic.m2i.com.betclicmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import betclic.m2i.com.betclicmobile.adapter.BetAdapter;
import betclic.m2i.com.betclicmobile.api.BetclicApi;
import betclic.m2i.com.betclicmobile.api.BetclicApiService;
import betclic.m2i.com.betclicmobile.models.Bet;
import betclic.m2i.com.betclicmobile.models.DoBet;
import betclic.m2i.com.betclicmobile.models.Meeting;
import betclic.m2i.com.betclicmobile.models.Status;
import betclic.m2i.com.betclicmobile.models.User;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MeetingActivity extends AppCompatActivity {

    @BindView(R.id.meetingTitle)
    TextView meetingTitle;
    @BindView(R.id.recycleMeeting)
    RecyclerView recycleMeeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting);
        ButterKnife.bind(this);
        ArrayList<Bet> bets = new ArrayList<>();

        bets.add(new Bet("Nico", Status.CLOSE));
        bets.add(new Bet("Nico1", Status.CLOSE));
        bets.add(new Bet("Nico2", Status.CLOSE));
        bets.add(new Bet("Nico3", Status.IN_PROGRESS));
        bets.add(new Bet("Nico4", Status.CLOSE));
        bets.add(new Bet("Nico5", Status.WAIT));

        BetclicApi betclicApi = BetclicApiService.getInstance(this);
        betclicApi.getMeetingDetail(3).enqueue(new Callback<Meeting>() {
            @Override
            public void onResponse(Call<Meeting> call, Response<Meeting> response) {
                Meeting meeting = response.body();

                recycleMeeting.setLayoutManager(new LinearLayoutManager(MeetingActivity.this));

                recycleMeeting.setAdapter(new BetAdapter(meeting.getBets()));
            }

            @Override
            public void onFailure(Call<Meeting> call, Throwable t) {

            }
        });

//        recycleMeeting.setLayoutManager(new LinearLayoutManager(this));
//        recycleMeeting.setAdapter(new BetAdapter(bets));
    }
}
