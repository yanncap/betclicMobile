package betclic.m2i.com.betclicmobile.models;

import java.util.List;

/**
 * Created by formation on 16/03/17.
 */

public class Bet {
    private long id;
    private String name;
    private Status status;
    private BetType betType;
    private Meeting meeting;
    private List<Cote> cotes;
    private Cote coteWin;
    private List<DoBet> doBets;

    public Bet(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BetType getBetType() {
        return betType;
    }

    public void setBetType(BetType betType) {
        this.betType = betType;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public List<Cote> getCotes() {
        return cotes;
    }

    public void setCotes(List<Cote> cotes) {
        this.cotes = cotes;
    }

    public Cote getCoteWin() {
        return coteWin;
    }

    public void setCoteWin(Cote coteWin) {
        this.coteWin = coteWin;
    }

    public List<DoBet> getDoBets() {
        return doBets;
    }

    public void setDoBets(List<DoBet> doBets) {
        this.doBets = doBets;
    }
}
