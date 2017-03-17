package betclic.m2i.com.betclicmobile.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import betclic.m2i.com.betclicmobile.R;
import betclic.m2i.com.betclicmobile.models.Bet;
import betclic.m2i.com.betclicmobile.models.DoBet;

/**
 * Created by formation on 17/03/17.
 */

public class BetAdapter extends RecyclerView.Adapter<BetAdapter.ViewHolder> {
    private List<Bet> bets;



    public BetAdapter(List<Bet> bets) {
        this.bets = bets;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.view_bet, parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Bet b = bets.get(position);
        holder.itemBetText.setText(b.getName());
        holder.itemBetStatus.setText(b.getStatus().toString());
        /*List<DoBet> doBets = new ArrayList<>();
            for (DoBet db: b.getDoBets()) {
                doBets.add(db);

            }*/
    }

    @Override
    public int getItemCount() {
        return bets.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemBetText;
        TextView itemBetStatus;

        ViewHolder(View view) {
            super(view);
            this.itemBetText = (TextView) view.findViewById(R.id.itemBetText);
            this.itemBetStatus = (TextView) view.findViewById(R.id.itemBetStatus);
        }
    }
}
