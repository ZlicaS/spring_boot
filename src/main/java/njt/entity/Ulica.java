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
public class Ulica implements Serializable {

    @Id
    private int idUlice;
    private String naziv;
    private Broj broj;

    public Ulica() {
    }

    public Ulica(int idUlice, String naziv, Broj broj) {
        this.idUlice = idUlice;
        this.naziv = naziv;
        this.broj = broj;
    }

    public int getIdUlice() {
        return idUlice;
    }

    public String getNaziv() {
        return naziv;
    }

    public Broj getBroj() {
        return broj;
    }

    public void setIdUlice(int idUlice) {
        this.idUlice = idUlice;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
    }

    
}
