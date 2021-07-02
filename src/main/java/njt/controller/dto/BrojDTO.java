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
public class BrojDTO implements Serializable {
     private int brojAdrese;

    public BrojDTO() {
    }

    public BrojDTO(int brojAdrese) {
        this.brojAdrese = brojAdrese;
    }

    public int getBrojAdrese() {
        return brojAdrese;
    }

    public void setBrojAdrese(int brojAdrese) {
        this.brojAdrese = brojAdrese;
    }
     
     

}
