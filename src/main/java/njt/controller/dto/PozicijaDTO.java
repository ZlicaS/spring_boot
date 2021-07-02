/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.controller.dto;

import java.io.Serializable;

/**
 *
 * @author lizasapsaj
 */
public class PozicijaDTO implements Serializable{
    private int idPoz;
    private String naziv;
    private OrganizacionaJedinicaDTO orgJed;
    private PozicijaDTO pozicija;

    public PozicijaDTO() {
    }

    public PozicijaDTO(int idPoz, String naziv, OrganizacionaJedinicaDTO orgJed, PozicijaDTO pozicija) {
        this.idPoz = idPoz;
        this.naziv = naziv;
        this.orgJed = orgJed;
        this.pozicija = pozicija;
    }

    public int getIdPoz() {
        return idPoz;
    }

    public void setIdPoz(int idPoz) {
        this.idPoz = idPoz;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public OrganizacionaJedinicaDTO getOrgJed() {
        return orgJed;
    }

    public void setOrgJed(OrganizacionaJedinicaDTO orgJed) {
        this.orgJed = orgJed;
    }

    public PozicijaDTO getPozicija() {
        return pozicija;
    }

    public void setPozicija(PozicijaDTO pozicija) {
        this.pozicija = pozicija;
    }
    
    
    
}
