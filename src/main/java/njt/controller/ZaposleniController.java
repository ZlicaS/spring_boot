/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.controller;

import njt.controller.dto.ZaposleniDTO;
import njt.entity.Zaposleni;
import njt.service.ZaposleniService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lizasapsaj
 */
@RestController
@RequestMapping("/zaposleni")
@CrossOrigin
public class ZaposleniController {
    
     @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private ZaposleniService zaposleniService;
    
    @GetMapping("/{id_zaposleni}")
    public ZaposleniDTO findZaposleni(@PathVariable int id_zaposleni) {
        Zaposleni zaposleni = zaposleniService.findZaposleni(id_zaposleni);
        
        return modelMapper.map(zaposleni, ZaposleniDTO.class);
    }
    
    
}
