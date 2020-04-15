package com.bv.ppa.repository;

import com.bv.ppa.model.TipoConsultaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntradaProdutoPreAnaliseRepository extends JpaRepository<EntradaProdutoPreAnalise, Long> {
    public List<EntradaProdutoPreAnalise> findByTipo(String tipo);
}