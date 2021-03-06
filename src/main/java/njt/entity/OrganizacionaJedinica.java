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
public class OrganizacionaJedinica implements Serializable {

    @Id
    private int idOrgJed;
    private String naziv;

    public OrganizacionaJedinica() {
    }

    public OrganizacionaJedinica(int idOrgJed, String naziv) {
        this.idOrgJed = idOrgJed;
        this.naziv = naziv;
    }

    public int getIdOrgJed() {
        return idOrgJed;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setIdOrgJed(int idOrgJed) {
        this.idOrgJed = idOrgJed;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

}
