/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.entity;

import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author lizasapsaj
 */
@Entity
public class Klijent implements Serializable {

    @Id
    private int idKlijent;
    private String naziv;
    private String pib;
    private String telefon;
    private String webStrana;
    private int godinaOsnivanja;

    public Klijent() {
    }

    public Klijent(int idKlijent, String naziv, String pib, String telefon, String webStrana, int godinaOsnivanja) {
        this.idKlijent = idKlijent;
        this.naziv = naziv;
        this.pib = pib;
        this.telefon = telefon;
        this.webStrana = webStrana;
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public int getIdKlijent() {
        return idKlijent;
    }

    public void setIdKlijent(int idKlijent) {
        this.idKlijent = idKlijent;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWebStrana() {
        return webStrana;
    }

    public void setWebStrana(String webStrana) {
        this.webStrana = webStrana;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

}
