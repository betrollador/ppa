package com.bv.ppa.repository;

import com.bv.ppa.model.TipoConsultaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrmtoRecusaClienteRepository extends JpaRepository<PrmtoRecusaCliente, Long> {
    public List<PrmtoRecusaCliente> findById(String id);
    public List<PrmtoRecusaCliente> findByTipo(String tipo);
}