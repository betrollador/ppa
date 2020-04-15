package com.bv.ppa.repository;

import com.bv.ppa.model.TipoConsultaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrmtoConsultaRestritivoRepository extends JpaRepository<PrmtoConsultaRestritivo, Long> {
    public List<PrmtoConsultaRestritivo> findById(String id);
}