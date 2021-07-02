/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.controller;

import java.util.List;
import java.util.stream.Collectors;
import njt.controller.dto.KlijentDTO;
import njt.entity.Klijent;
import njt.service.KlijentService;
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
@RequestMapping("/klijent")
@CrossOrigin
public class KlijentController {

    @Autowired
    private KlijentService klijentService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/all")
    public List<KlijentDTO> getAll() {
        List<Klijent> klijenti = klijentService.getAll();

        return klijenti.stream()
                .map(ob -> modelMapper.map(ob, KlijentDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{idKlijenta}")
    public KlijentDTO getOne(@PathVariable int idKlijenta) {
        Klijent klijent = klijentService.getOne(idKlijenta);
        return modelMapper.map(klijent, KlijentDTO.class);
    }
//NIJE GOTOVO!

    @PostMapping
    public Klijent save(@RequestBody KlijentDTO dto) {

        Klijent klijent = modelMapper.map(dto, Klijent.class);
        return klijentService.saveOrUpdateKlijent(klijent);
    }

    @PutMapping("/update")
    public void update(@RequestBody KlijentDTO dto) {
        Klijent klijent = modelMapper.map(dto, Klijent.class);
        klijentService.saveOrUpdateKlijent(klijent);
    }

    @DeleteMapping("/delete/{idKlijenta}")
    public void delete(@PathVariable int idKlijenta) {
        klijentService.deleteKlijent(idKlijenta);
    }

}
