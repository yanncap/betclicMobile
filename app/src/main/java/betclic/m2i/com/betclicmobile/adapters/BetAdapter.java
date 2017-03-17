package betclic.m2i.com.betclicmobile.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import betclic.m2i.com.betclicmobile.R;
import betclic.m2i.com.betclicmobile.models.Bet;

/**
 * Created by formation on 17/03/17.
 */

public class BetAdapter extends RecyclerView.Adapter<BetAdapter.ViewHolder> {

    private List<Bet> bets;
    private Context context;

    public BetAdapter(List<Bet> bets){
        this.bets = bets;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.view_meeting_detail, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BetAdapter.ViewHolder holder, int position) {
        Bet bet = bets.get(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
