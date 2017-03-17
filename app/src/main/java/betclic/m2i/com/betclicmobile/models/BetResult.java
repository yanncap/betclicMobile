package betclic.m2i.com.betclicmobile.models;

import java.math.BigDecimal;

/**
 * Created by formation on 16/03/17.
 */

public class BetResult {
    private long id;
    private StatusResult status;
    private BigDecimal montant;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StatusResult getStatus() {
        return status;
    }

    public void setStatus(StatusResult status) {
        this.status = status;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }
}
