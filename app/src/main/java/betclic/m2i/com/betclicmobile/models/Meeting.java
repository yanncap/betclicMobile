package betclic.m2i.com.betclicmobile.models;

import java.util.Date;
import java.util.List;

/**
 * Created by formation on 16/03/17.
 */

public class Meeting {
    private String name ;
    private Date date;
    private Status status;
    private List<Bet> bets ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }
}
