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
public class MestoDTO implements Serializable{
    private int postanskiBroj;
    private String naziv;
    private UlicaDTO ulica;

    public MestoDTO() {
    }

    public MestoDTO(int postanskiBroj, String naziv, UlicaDTO ulica) {
        this.postanskiBroj = postanskiBroj;
        this.naziv = naziv;
        this.ulica = ulica;
    }

    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(int postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public UlicaDTO getUlica() {
        return ulica;
    }

    public void setUlica(UlicaDTO ulica) {
        this.ulica = ulica;
    }
    
    
}
