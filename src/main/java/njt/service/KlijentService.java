/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.service;

import java.util.List;
import njt.entity.Klijent;

/**
 *
 * @author lizasapsaj
 */
public interface KlijentService {

    public Klijent saveOrUpdateKlijent(Klijent klijent);

    public List<Klijent> getAll();

    public void deleteKlijent(int idKlijent);

    public Klijent getOne(int idKljent);

}
