/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.sevice.impl;

import java.util.List;
import java.util.Optional;
import njt.entity.Klijent;
import njt.repository.KlijentRepository;
import njt.service.KlijentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lizasapsaj
 */
@Service
public class KlijentServiceImpl implements KlijentService {

    @Autowired
    private KlijentRepository klijentRepository;

    @Override
    public Klijent saveOrUpdateKlijent(Klijent klijent) {
        return klijentRepository.save(klijent);
    }

    @Override
    public List<Klijent> getAll() {
        return klijentRepository.findAll();
    }

    @Override
    public void deleteKlijent(int idKlijent) {

        klijentRepository.deleteById(idKlijent);
    }

    @Override
    public Klijent getOne(int idKljent) {
        Optional<Klijent> klijent = klijentRepository.findById(idKljent);
        if (klijent.isPresent()) {
            return klijent.get();
        }
        return null;
    }

}
