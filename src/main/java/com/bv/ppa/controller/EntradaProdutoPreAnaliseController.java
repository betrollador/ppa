package com.bv.ppa.controller;

import com.bv.ppa.model.EntradaProdutoPreAnalise;
import com.bv.ppa.model.TipoConsultaCredito;
import com.bv.ppa.repository.EntradaProdutoPreAnaliseRepository;
import com.bv.ppa.repository.TipoConsultaCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EntradaProdutoPreAnaliseController {

    @Autowired
    EntradaProdutoPreAnaliseRepository entradaProdutoPreAnaliseRepository;

    // Get All Notes
    @GetMapping("/entradaprodutopreanalise")
    public List<EntradaProdutoPreAnalise> getAllEntradaProdutoPreAnalise() {
        return entradaProdutoPreAnaliseRepository.findAll();
    }

    // Get a Single Note
    @GetMapping("/entradaprodutopreanalise/{nome}")
    public List<EntradaProdutoPreAnalise> getUsuarioByNome(@PathVariable(value = "nome") String nome) {
        return entradaProdutoPreAnaliseRepository.findByNome(nome);
    }

}




