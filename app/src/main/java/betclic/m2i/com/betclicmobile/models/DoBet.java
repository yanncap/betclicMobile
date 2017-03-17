package betclic.m2i.com.betclicmobile.models;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by formation on 16/03/17.
 */

public class DoBet {
    private long id;
    private Date doBetDate;
    private User user;
    private Cote cote;
    private BigDecimal montant;
    private BetResult  result;

    public DoBet(User user, BigDecimal montant, BetResult result) {
        this.user = user;
        this.montant = montant;
        this.result = result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDoBetDate() {
        return doBetDate;
    }

    public void setDoBetDate(Date doBetDate) {
        this.doBetDate = doBetDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cote getCote() {
        return cote;
    }

    public void setCote(Cote cote) {
        this.cote = cote;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public BetResult getResult() {
        return result;
    }

    public void setResult(BetResult result) {
        this.result = result;
    }
}
