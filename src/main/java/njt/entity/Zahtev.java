/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 *
 * @author lizasapsaj
 */
@Entity
public class Zahtev implements Serializable {

    @Id
    private int idZahteva;
    private Date datum;
    private String odobreno;
    @ManyToOne
    private Zaposleni zaposleni1;
    @ManyToOne
    private Zaposleni zaposleni2;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "zahtev", orphanRemoval = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @JsonManagedReference
    private List<StavkaZahteva> stavkeZahteva;

    public Zahtev() {
    }

    public Zahtev(int idZahteva, Date datum, String odobreno, Zaposleni zaposleni1, Zaposleni zaposleni2, List<StavkaZahteva> stavkeZahteva) {
        this.idZahteva = idZahteva;
        this.datum = datum;
        this.odobreno = odobreno;
        this.zaposleni1 = zaposleni1;
        this.zaposleni2 = zaposleni2;
        this.stavkeZahteva = stavkeZahteva;
    }

    public int getIdZahteva() {
        return idZahteva;
    }

    public void setIdZahteva(int idZahteva) {
        this.idZahteva = idZahteva;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getOdobreno() {
        return odobreno;
    }

    public void setOdobreno(String odobreno) {
        this.odobreno = odobreno;
    }

    public Zaposleni getZaposleni1() {
        return zaposleni1;
    }

    public void setZaposleni1(Zaposleni zaposleni1) {
        this.zaposleni1 = zaposleni1;
    }

    public Zaposleni getZaposleni2() {
        return zaposleni2;
    }

    public void setZaposleni2(Zaposleni zaposleni2) {
        this.zaposleni2 = zaposleni2;
    }

    public List<StavkaZahteva> getStavkeZahteva() {
        return stavkeZahteva;
    }

    public void setStavkeZahteva(List<StavkaZahteva> stavkeZahteva) {
        this.stavkeZahteva = stavkeZahteva;
    }

}
