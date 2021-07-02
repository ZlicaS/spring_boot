/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.controller;

import njt.controller.dto.ZahtevDTO;
import njt.entity.StavkaZahteva;
import njt.entity.Zahtev;
import njt.service.ZahtevService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lizasapsaj
 */
@RestController
@RequestMapping("/zahtev")
@CrossOrigin
public class ZahtevController {

    @Autowired
    private ZahtevService zahtevService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/{idZahteva}")
    public ZahtevDTO findOne(@PathVariable int idZahteva) {
        Zahtev zahtev = zahtevService.findOne(idZahteva);
        return modelMapper.map(zahtev, ZahtevDTO.class);
    }

    @PostMapping
    public Zahtev save(@RequestBody ZahtevDTO dto) {
        Zahtev zahtev = modelMapper.map(dto, Zahtev.class);
        for (int i = 0; i < zahtev.getStavkeZahteva().size(); i++) {
            zahtev.getStavkeZahteva().get(i).setRbr(dto.getStavkeZahteva().get(i).getRbr());
        }
        return zahtevService.saveZahtev(zahtev);
    }

    @PutMapping("/update")
    public Zahtev update(@RequestBody ZahtevDTO dto) {
        Zahtev zahtev = modelMapper.map(dto, Zahtev.class);
        for (int i = 0; i < zahtev.getStavkeZahteva().size(); i++) {
            zahtev.getStavkeZahteva().get(i).setRbr(dto.getStavkeZahteva().get(i).getRbr());
        }
        return zahtevService.saveZahtev(zahtev);
    }

    @DeleteMapping("/delete/{idZahteva}")
    public void delete(@PathVariable int idZahteva) {
        zahtevService.deleteZahtev(idZahteva);
    }

}
