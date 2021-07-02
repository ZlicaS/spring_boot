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
public class Delatnost implements Serializable {

    @Id
    private int sifraDelatnosti;
    private String naziv;

    public Delatnost() {
    }

    public Delatnost(int sifraDelatnosti, String naziv) {
        this.sifraDelatnosti = sifraDelatnosti;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getSifraDelatnosti() {
        return sifraDelatnosti;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setSifraDelatnosti(int sifraDelatnosti) {
        this.sifraDelatnosti = sifraDelatnosti;
    }
    
    
}
