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
public class Mesto implements Serializable {

    @Id
    private int postanskiBroj;
    private String naziv;
    
    private Ulica ulica;

    public Mesto() {
    }

    public Mesto(int postanskiBroj, String naziv, Ulica ulica) {
        this.postanskiBroj = postanskiBroj;
        this.naziv = naziv;
        this.ulica = ulica;
    }

    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    public String getNaziv() {
        return naziv;
    }

    public Ulica getUlica() {
        return ulica;
    }

    public void setPostanskiBroj(int postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setUlica(Ulica ulica) {
        this.ulica = ulica;
    }

}
