package betclic.m2i.com.betclicmobile.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by formation on 16/03/17.
 */

class User {
    private String email;
    private String password;
    private String lastname;
    private String firstname;
    private Date birthDate;
    private List<DoBet> doBets;
    private BigDecimal solde;
    private String token;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<DoBet> getDoBets() {
        return doBets;
    }

    public void setDoBets(List<DoBet> doBets) {
        this.doBets = doBets;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
