/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.sevice.impl;

import java.util.Optional;
import njt.entity.StavkaZahteva;
import njt.entity.Zahtev;
import njt.repository.StavkaZahtevaRepository;
import njt.repository.ZahtevRepository;
import njt.service.ZahtevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lizasapsaj
 */
@Service
public class ZahtevServiceImpl implements ZahtevService {

    @Autowired
    private ZahtevRepository zahtevRepository;

    @Autowired
    private StavkaZahtevaRepository stavkaZahtevaRepository;

    @Override
    public Zahtev saveZahtev(Zahtev zahtev) {
        Optional<Zahtev> optionalKd = zahtevRepository.findById(zahtev.getIdZahteva());

        if (optionalKd.isPresent()) {
            stavkaZahtevaRepository.deleteByZahtevSifraZahteva(zahtev.getIdZahteva());
        }

        Zahtev savedZahtev = zahtevRepository.save(zahtev);

        if (zahtev.getStavkeZahteva() != null) {
            for (StavkaZahteva sz : zahtev.getStavkeZahteva()) {
                sz.setZahtev(savedZahtev);
            }
            stavkaZahtevaRepository.saveAll(zahtev.getStavkeZahteva());
        }
        return savedZahtev;
    }

    @Override
    public Zahtev findOne(int idZahtev) {
        Optional<Zahtev> zahtev = zahtevRepository.findById(idZahtev);
        if (zahtev.isPresent()) {
            return zahtev.get();
        }
        return null;
    }

    @Override
    public Zahtev updateZahtev(Zahtev kd) {
        stavkaZahtevaRepository.deleteByZahtevSifraZahteva(kd.getIdZahteva());
        return saveZahtev(kd);
    }

    @Override
    public void deleteZahtev(int idZahteva) {
        zahtevRepository.deleteById(idZahteva);
    }

}
