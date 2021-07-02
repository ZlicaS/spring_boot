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
public class KlijentDTO implements Serializable{
    
     private int idKlijent;
    private String naziv;
    private String pib;
    private String telefon;
    private String webStrana;
    private int godinaOsnivanja;
    private DelatnostDTO delatnost;
    private MestoDTO mesto;
    private PotencijalniKlijentDTO potencijalniKlijent;

    public KlijentDTO() {
    }

    public KlijentDTO(int idKlijent, String naziv, String pib, String telefon, String webStrana, int godinaOsnivanja, DelatnostDTO delatnost, MestoDTO mesto, PotencijalniKlijentDTO potencijalniKlijent) {
        this.idKlijent = idKlijent;
        this.naziv = naziv;
        this.pib = pib;
        this.telefon = telefon;
        this.webStrana = webStrana;
        this.godinaOsnivanja = godinaOsnivanja;
        this.delatnost = delatnost;
        this.mesto = mesto;
        this.potencijalniKlijent = potencijalniKlijent;
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

    public DelatnostDTO getDelatnost() {
        return delatnost;
    }

    public void setDelatnost(DelatnostDTO delatnost) {
        this.delatnost = delatnost;
    }

    public MestoDTO getMesto() {
        return mesto;
    }

    public void setMesto(MestoDTO mesto) {
        this.mesto = mesto;
    }

    public PotencijalniKlijentDTO getPotencijalniKlijent() {
        return potencijalniKlijent;
    }

    public void setPotencijalniKlijent(PotencijalniKlijentDTO potencijalniKlijent) {
        this.potencijalniKlijent = potencijalniKlijent;
    }
    
    
    
    
    
    
}
