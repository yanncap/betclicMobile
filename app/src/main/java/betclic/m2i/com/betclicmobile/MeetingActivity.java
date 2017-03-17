package betclic.m2i.com.betclicmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import betclic.m2i.com.betclicmobile.models.Bet;
import betclic.m2i.com.betclicmobile.models.Meeting;
import betclic.m2i.com.betclicmobile.models.Status;
import butterknife.BindView;
import butterknife.ButterKnife;

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
        ArrayList<Bet> meetings = new ArrayList<Bet>();
        meetings.add(new Bet("Nico", Status.CLOSE));
        meetings.add(new Bet("Nico1", Status.CLOSE));
        meetings.add(new Bet("Nico2", Status.CLOSE));
        meetings.add(new Bet("Nico3", Status.IN_PROGRESS));
        meetings.add(new Bet("Nico4", Status.CLOSE));
        meetings.add(new Bet("Nico5", Status.WAIT));
    }
}
