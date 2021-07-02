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
public class DelatnostDTO implements Serializable{
    private int sifraDelatnosti;
    private String naziv;

    public DelatnostDTO() {
    }

    public DelatnostDTO(int sifraDelatnosti, String naziv) {
        this.sifraDelatnosti = sifraDelatnosti;
        this.naziv = naziv;
    }

    public int getSifraDelatnosti() {
        return sifraDelatnosti;
    }

    public void setSifraDelatnosti(int sifraDelatnosti) {
        this.sifraDelatnosti = sifraDelatnosti;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    
}
