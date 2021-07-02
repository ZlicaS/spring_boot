/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author lizasapsaj
 */
@Entity
public class Pozicija implements Serializable {

    @Id
    private int idPoz;
    private String naziv;
    private OrganizacionaJedinica orgJed;
    private Pozicija pozicija;

    public Pozicija() {
    }

    public Pozicija(int idPoz, String naziv, OrganizacionaJedinica orgJed, Pozicija pozicija) {
        this.idPoz = idPoz;
        this.naziv = naziv;
        this.orgJed = orgJed;
        this.pozicija = pozicija;
    }

    public int getIdPoz() {
        return idPoz;
    }

    public String getNaziv() {
        return naziv;
    }

    public OrganizacionaJedinica getOrgJed() {
        return orgJed;
    }

    public Pozicija getPozicija() {
        return pozicija;
    }

    public void setIdPoz(int idPoz) {
        this.idPoz = idPoz;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setOrgJed(OrganizacionaJedinica orgJed) {
        this.orgJed = orgJed;
    }

    public void setPozicija(Pozicija pozicija) {
        this.pozicija = pozicija;
    }

}
