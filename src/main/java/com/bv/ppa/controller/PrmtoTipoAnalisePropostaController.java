package com.bv.ppa.controller;

import com.bv.ppa.model.TipoConsultaCredito;
import com.bv.ppa.repository.TipoConsultaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PrmtoTipoAnalisePropostaController {

    @Autowired
    PrmtoTipoAnalisePropostaRepository prmtoTipoAnalisePropostaRepository;

    // Get All Notes
    @GetMapping("/prmtotipoanaliseproposta")
    public List<PrmtoConsultaRestritivo> getAllPrmtoTipoAnaliseProposta() {
        return prmtoTipoAnalisePropostaRepository.findAll();
    }

    // Get a Single Note
    @GetMapping("/prmtotipoanaliseproposta/{codigoPrmtoTipoAnaliseProposta}")
    public List<PrmtoConsultaRestritivo> getUsuarioById(@PathVariable(value = "codigoPrmtoTipoAnaliseProposta") String id) {
        return prmtoTipoAnalisePropostaRepository.findById(id);
    }


}