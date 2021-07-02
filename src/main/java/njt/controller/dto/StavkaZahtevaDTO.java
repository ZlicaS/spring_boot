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
public class StavkaZahtevaDTO implements Serializable{
    private int rbr;
    private String opis;
    private ZahtevDTO zahtev;
    private int status;
    private int updateID;

    public StavkaZahtevaDTO() {
    }

    public StavkaZahtevaDTO(int rbr, String opis, ZahtevDTO zahtev, int status, int updateID) {
        this.rbr = rbr;
        this.opis = opis;
        this.zahtev = zahtev;
        this.status = status;
        this.updateID = updateID;
    }

    public int getRbr() {
        return rbr;
    }

    public void setRbr(int rbr) {
        this.rbr = rbr;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public ZahtevDTO getZahtev() {
        return zahtev;
    }

    public void setZahtev(ZahtevDTO zahtev) {
        this.zahtev = zahtev;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUpdateID() {
        return updateID;
    }

    public void setUpdateID(int updateID) {
        this.updateID = updateID;
    }
    
    
}
