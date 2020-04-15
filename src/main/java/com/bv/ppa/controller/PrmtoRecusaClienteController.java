package com.bv.ppa.controller;

import com.bv.ppa.model.PrmtoRecusaCliente;
import com.bv.ppa.repository.PrmtoRecusaClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PrmtoRecusaClienteController {

    @Autowired
    PrmtoRecusaClienteRepository prmtoRecusaClienteRepository;

    // Get All Notes
    @GetMapping("/prmtorecusacliente")
    public List<PrmtoRecusaCliente> getAllPrmtoRecusaCliente() {
        return prmtoRecusaClienteRepository.findAll();
    }


    // Get a Single Note
    @GetMapping("/prmtorecusacliente/{tipo}")
    public List<PrmtoRecusaCliente> getUsuarioByTipo(@PathVariable String tipo) {
        return prmtoRecusaClienteRepository.findByTipo(tipo,"9");
    }


}
