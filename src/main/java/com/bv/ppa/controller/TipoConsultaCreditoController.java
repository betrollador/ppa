package com.bv.ppa.controller;

import com.bv.ppa.model.TipoConsultaCredito;
import com.bv.ppa.repository.TipoConsultaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoConsultaCreditoController {

    @Autowired
    TipoConsultaCreditoRepository tipoConsultaCreditoRepository;

    // Get All Notes
    @GetMapping("/tipoconsultacredito")
    public List<TipoConsultaCredito> getAllTipoConsultaCredito() {
        return tipoConsultaCreditoRepository.findAll();
    }

    // Get a Single Note
    @GetMapping("/tipoconsultacredito/{nome}")
    public List<TipoConsultaCredito> getTipoConsultaCreditoByNome(@PathVariable(value = "nome") String tipo) {
        return tipoConsultaCreditoRepository.findByTipo(tipo);
    }

}




