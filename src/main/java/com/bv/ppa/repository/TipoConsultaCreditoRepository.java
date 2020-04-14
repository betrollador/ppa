package com.bv.ppa.repository;

import com.bv.ppa.model.TipoConsultaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoConsultaCreditoRepository extends JpaRepository<TipoConsultaCredito, Long> {
    public List<TipoConsultaCredito> findByTipo(String tipo);
}
