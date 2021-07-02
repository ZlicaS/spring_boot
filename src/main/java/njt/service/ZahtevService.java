/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.service;

import njt.entity.Zahtev;

/**
 *
 * @author lizasapsaj
 */
public interface ZahtevService {
    public Zahtev saveZahtev(Zahtev zahtev);

    public Zahtev findOne(int idZahtev);
    
    public Zahtev updateZahtev(Zahtev kd);

    public void deleteZahtev(int idZahteva);
    
}
