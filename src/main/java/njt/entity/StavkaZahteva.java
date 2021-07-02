/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 *
 * @author lizasapsaj
 */
@Entity
public class StavkaZahteva implements Serializable {

    @Id
    private int rbr;
    private String opis;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idZahteva")
    @JoinColumn
    @JsonBackReference
    private Zahtev zahtev;

    public StavkaZahteva() {
    }

    public StavkaZahteva(int rbr, String opis, Zahtev zahtev) {
        this.rbr = rbr;
        this.opis = opis;
        this.zahtev = zahtev;

    }

    public int getRbr() {
        return rbr;
    }

    public String getOpis() {
        return opis;
    }

    public Zahtev getZahtev() {
        return zahtev;
    }

    public void setRbr(int rbr) {
        this.rbr = rbr;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setZahtev(Zahtev zahtev) {
        this.zahtev = zahtev;
    }

}
