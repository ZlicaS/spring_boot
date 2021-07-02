/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.sevice.impl;

import java.util.Optional;
import njt.entity.Zaposleni;
import njt.repository.ZaposleniRepository;
import njt.service.ZaposleniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lizasapsaj
 */
@Service
public class ZaposleniServiceImpl implements ZaposleniService {

    @Autowired
    private ZaposleniRepository zaposleniRepository;

    @Override
    public Zaposleni findZaposleni(int id_zaposleni) {
        Optional<Zaposleni> zaposleni = zaposleniRepository.findById(id_zaposleni);
        if (zaposleni.isPresent()) {
            return zaposleni.get();
        }
        return null;
    }

}
