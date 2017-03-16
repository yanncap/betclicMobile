package betclic.m2i.com.betclicmobile.models;

/**
 * Created by formation on 16/03/17.
 */

public class Cote {
    private String name;
    private double cote;
    private Bet bet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public Bet getBet() {
        return bet;
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }
}
