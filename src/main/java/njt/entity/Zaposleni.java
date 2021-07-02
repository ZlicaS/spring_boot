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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lizasapsaj
 */
@Entity
public class Zaposleni implements Serializable {

    @Id
    private int id_zaposleni;
    private String ime;
    private String prezime;
    @Temporal(TemporalType.DATE)
    private Date datum_rodjenja;
    @ManyToOne
    private Pozicija pozicija_id_poz;
    private String korisnicko_ime;
    private String korisnicka_sifra;

    public Zaposleni() {
    }

    public Zaposleni(int id_zaposleni, String ime, String prezime, Date datum_rodjenja, Pozicija pozicija_id_poz, String korisnicko_ime, String korisnicka_sifra) {
        this.id_zaposleni = id_zaposleni;
        this.ime = ime;
        this.prezime = prezime;
        this.datum_rodjenja = datum_rodjenja;
        this.pozicija_id_poz = pozicija_id_poz;
        this.korisnicko_ime = korisnicko_ime;
        this.korisnicka_sifra = korisnicka_sifra;
    }

    public int getId_zaposleni() {
        return id_zaposleni;
    }

    public void setId_zaposleni(int id_zaposleni) {
        this.id_zaposleni = id_zaposleni;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatum_rodjenja() {
        return datum_rodjenja;
    }

    public void setDatum_rodjenja(Date datum_rodjenja) {
        this.datum_rodjenja = datum_rodjenja;
    }

    public Pozicija getPozicija_id_poz() {
        return pozicija_id_poz;
    }

    public void setPozicija_id_poz(Pozicija pozicija_id_poz) {
        this.pozicija_id_poz = pozicija_id_poz;
    }

    

    public String getKorisnicko_ime() {
        return korisnicko_ime;
    }

    public void setKorisnicko_ime(String korisnicko_ime) {
        this.korisnicko_ime = korisnicko_ime;
    }

    public String getKorisnicka_sifra() {
        return korisnicka_sifra;
    }

    public void setKorisnicka_sifra(String korisnicka_sifra) {
        this.korisnicka_sifra = korisnicka_sifra;
    }

    
  
}
