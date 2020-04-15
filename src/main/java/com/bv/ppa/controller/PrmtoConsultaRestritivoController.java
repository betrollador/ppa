package com.bv.ppa.controller;

import com.bv.ppa.model.TipoConsultaCredito;
import com.bv.ppa.repository.TipoConsultaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PrmtoConsultaRestritivoController {

    @Autowired
    PrmtoConsultaRestritivoRepository prmtoConsultaRestritivoRepository;

    // Get All Notes
    @GetMapping("/prmtoconsultarestritivo")
    public List<PrmtoConsultaRestritivo> getAllPrmtoConsultaRestritivo() {
        return prmtoRecusaClienteRepository.findAll();
    }

    // Get a Single Note
    @GetMapping("/prmtoconsultarestritivo/{codigoPrmtoConsultaRestritivo}")
    public List<PrmtoConsultaRestritivo> getUsuarioById(@PathVariable(value = "codigoPrmtoConsultaRestritivo") String id) {
        return prmtoConsultaRestritivoRepository.findById(id);
    }


}