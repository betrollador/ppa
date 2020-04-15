package com.bv.ppa.controller;

import com.bv.ppa.model.TipoConsultaCredito;
import com.bv.ppa.repository.TipoConsultaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PrmtoRecusaClienteController {

    @Autowired
    PrmtoRecusaClienteRepository prmtoRecusaClienteRepository;

    // Get All Notes
    @GetMapping("/prmtorecusacliente")
    public List<PrmtoRecusaCliente> getAllTipoConsultaCredito() {
        return prmtoRecusaClienteRepository.findAll();
    }

    // Get a Single Note
    @GetMapping("/prmtorecusacliente/{codigoTipoConsultaCredito}")
    public List<PrmtoRecusaCliente> getUsuarioById(@PathVariable(value = "codigoTipoConsultaCredito") String tipo) {
        return prmtoRecusaClienteRepository.findById(tipo);
    }

    // Get a Single Note
    @GetMapping("/prmtorecusacliente/{tipoEntradaProdutoPreAnalise}")
    public List<PrmtoRecusaCliente> getUsuarioByTipo(@PathVariable(value = "tipoEntradaProdutoPreAnalise") String tipo) {
        return prmtoRecusaClienteRepository.findByTipo(tipo);
    }


}