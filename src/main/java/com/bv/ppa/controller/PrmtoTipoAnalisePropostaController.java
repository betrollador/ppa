package com.bv.ppa.controller;

import com.bv.ppa.model.PrmtoTipoAnaliseProposta;
import com.bv.ppa.repository.PrmtoTipoAnalisePropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PrmtoTipoAnalisePropostaController {

    @Autowired
    PrmtoTipoAnalisePropostaRepository prmtoTipoAnalisePropostaRepository;

    // Get All Notes
    @GetMapping("/prmtotipoanaliseproposta")
    public List<PrmtoTipoAnaliseProposta> getAllPrmtoTipoAnaliseProposta() {
        return prmtoTipoAnalisePropostaRepository.findAll();
    }

    // Get a Single Note
    @GetMapping("/prmtotipoanaliseproposta/{codigoPrmtoTipoAnaliseProposta}")
    public List<PrmtoTipoAnaliseProposta> getUsuarioById(@PathVariable(value = "codigoPrmtoTipoAnaliseProposta") String id) {
        return prmtoTipoAnalisePropostaRepository.findById(id);
    }


}
