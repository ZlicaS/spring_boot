/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.controller.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author lizasapsaj
 */
public class PotencijalniKlijentDTO implements Serializable {

    private int idPotKlijenta;
    private Date datum;
    private String naziv;
    private String telefon;
    private String email;
    private ZaposleniDTO zaposleni1;
    private ZaposleniDTO zaposleni2;

    public PotencijalniKlijentDTO() {
    }

    public PotencijalniKlijentDTO(int idPotKlijenta, Date datum, String naziv, String telefon, String email, ZaposleniDTO zaposleni1, ZaposleniDTO zaposleni2) {
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

    public void setIdPotKlijenta(int idPotKlijenta) {
        this.idPotKlijenta = idPotKlijenta;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ZaposleniDTO getZaposleni1() {
        return zaposleni1;
    }

    public void setZaposleni1(ZaposleniDTO zaposleni1) {
        this.zaposleni1 = zaposleni1;
    }

    public ZaposleniDTO getZaposleni2() {
        return zaposleni2;
    }

    public void setZaposleni2(ZaposleniDTO zaposleni2) {
        this.zaposleni2 = zaposleni2;
    }

}
