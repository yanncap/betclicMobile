package betclic.m2i.com.betclicmobile.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import betclic.m2i.com.betclicmobile.BetActivity;
import betclic.m2i.com.betclicmobile.MeetingActivity;
import betclic.m2i.com.betclicmobile.R;
import betclic.m2i.com.betclicmobile.models.Meeting;

/**
 * Created by formation on 16/03/17.
 */

public class MeetingAdapter extends RecyclerView.Adapter<MeetingAdapter.ViewHolder> {

    private List<Meeting> meetings;
    private Context context;

    public MeetingAdapter(List<Meeting> meetings){
        this.meetings = meetings;
    }

    @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.view_meetings, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Meeting meeting = meetings.get(position);

        holder.meetingName.setText(meeting.getName());
        holder.dateMeeting.setText(meeting.getDate().toString());

        holder.layoutMeetings.setOnClickListener(v->{
            Intent intent = new Intent(context, MeetingActivity.class);
            intent.putExtra("id", meeting.getId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return meetings.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView iconMeeting;
        public TextView meetingName, dateMeeting;
        public LinearLayout layoutMeetings;

        public ViewHolder(View itemView) {
            super(itemView);
            iconMeeting = (ImageView) itemView.findViewById(R.id.iconMeeting);
            meetingName = (TextView) itemView.findViewById(R.id.nameMeeting);
            dateMeeting = (TextView) itemView.findViewById(R.id.dateMeeting);
            layoutMeetings = (LinearLayout) itemView.findViewById(R.id.layoutMeetings);
        }
    }
}
