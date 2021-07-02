/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.controller.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lizasapsaj
 */
public class ZahtevDTO implements Serializable{
    
     private int idZahteva;
    private Date datum;
    private String odobreno;

    private ZaposleniDTO zaposleni1;
    private ZaposleniDTO zaposleni2;

    private List<StavkaZahtevaDTO> stavkeZahteva;

    public ZahtevDTO() {
    }

    public ZahtevDTO(int idZahteva, Date datum, String odobreno, ZaposleniDTO zaposleni1, ZaposleniDTO zaposleni2, List<StavkaZahtevaDTO> stavkeZahteva) {
        this.idZahteva = idZahteva;
        this.datum = datum;
        this.odobreno = odobreno;
        this.zaposleni1 = zaposleni1;
        this.zaposleni2 = zaposleni2;
        this.stavkeZahteva = stavkeZahteva;
    }

    public int getIdZahteva() {
        return idZahteva;
    }

    public void setIdZahteva(int idZahteva) {
        this.idZahteva = idZahteva;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getOdobreno() {
        return odobreno;
    }

    public void setOdobreno(String odobreno) {
        this.odobreno = odobreno;
    }

    public ZaposleniDTO getZaposleni1() {
        return zaposleni1;
    }

    public void setZaposleni1(ZaposleniDTO zaposleni1) {
        this.zaposleni1 = zaposleni1;
    }

    public ZaposleniDTO getZaposleni2() {
        return zaposleni2;
    }

    public void setZaposleni2(ZaposleniDTO zaposleni2) {
        this.zaposleni2 = zaposleni2;
    }

    public List<StavkaZahtevaDTO> getStavkeZahteva() {
        return stavkeZahteva;
    }

    public void setStavkeZahteva(List<StavkaZahtevaDTO> stavkeZahteva) {
        this.stavkeZahteva = stavkeZahteva;
    }
    
    
    
}
