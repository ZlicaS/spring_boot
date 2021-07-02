/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lizasapsaj
 */
@Entity
public class PotencijalniKlijent implements Serializable {

    @Id
    private int idPotKlijenta;
    @Temporal(TemporalType.DATE)
    private Date datum;
    private String naziv;
    private String telefon;
    private String email;
    private Zaposleni zaposleni1;
    private Zaposleni zaposleni2;

    public PotencijalniKlijent() {
    }

    public PotencijalniKlijent(int idPotKlijenta, Date datum, String naziv, String telefon, String email, Zaposleni zaposleni1, Zaposleni zaposleni2) {
        this.idPotKlijenta = idPotKlijenta;
        this.datum = datum;
        this.naziv = naziv;
        this.telefon = telefon;
        this.email = email;
        this.zaposleni1 = zaposleni1;
        this.zaposleni2 = zaposleni2;
    }

    public int getIdPotKlijenta() {
        return idPotKlijenta;
    }

    public Date getDatum() {
        return datum;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public Zaposleni getZaposleni1() {
        return zaposleni1;
    }

    public Zaposleni getZaposleni2() {
        return zaposleni2;
    }

    public void setIdPotKlijenta(int idPotKlijenta) {
        this.idPotKlijenta = idPotKlijenta;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setZaposleni1(Zaposleni zaposleni1) {
        this.zaposleni1 = zaposleni1;
    }

    public void setZaposleni2(Zaposleni zaposleni2) {
        this.zaposleni2 = zaposleni2;
    }

}
