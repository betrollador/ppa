package com.bv.ppa.repository;

import com.bv.ppa.model.PrmtoTipoAnaliseProposta;
import com.bv.ppa.model.TipoConsultaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrmtoTipoAnalisePropostaRepository extends JpaRepository<PrmtoTipoAnaliseProposta, Long> {
    public List<PrmtoTipoAnaliseProposta> findById(String id);
}
