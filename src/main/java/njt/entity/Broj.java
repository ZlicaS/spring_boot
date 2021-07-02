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
public class Broj implements Serializable{
    @Id
    private int brojAdrese;

    public Broj(int brojAdrese) {
        this.brojAdrese = brojAdrese;
    }

    public Broj() {
    }

    public int getBrojAdrese() {
        return brojAdrese;
    }

    public void setBrojAdrese(int brojAdrese) {
        this.brojAdrese = brojAdrese;
    }
    
    
}
