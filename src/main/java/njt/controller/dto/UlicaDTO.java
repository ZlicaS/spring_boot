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
public class UlicaDTO implements Serializable{
    private int idUlice;
    private String naziv;
    private BrojDTO broj;

    public UlicaDTO() {
    }

    public UlicaDTO(int idUlice, String naziv, BrojDTO broj) {
        this.idUlice = idUlice;
        this.naziv = naziv;
        this.broj = broj;
    }

    public int getIdUlice() {
        return idUlice;
    }

    public void setIdUlice(int idUlice) {
        this.idUlice = idUlice;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BrojDTO getBroj() {
        return broj;
    }

    public void setBroj(BrojDTO broj) {
        this.broj = broj;
    }
    
    
}
