package com.bv.ppa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_prmto_tipo_analise_proposta")
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@NamedQuery(name = "PrmtoTipoAnaliseProposta.findById", query = "select t from PrmtoTipoAnaliseProposta t where t.codigoPrmtoTipoAnaliseProposta = ?1")
public class PrmtoTipoAnaliseProposta {

    @Id
    @Column(name = "CD_PRMTO_TIPO_ANALISE_PROPOSTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoPrmtoTipoAnaliseProposta;

    @Column(name = "FL_EXECUCAO_PRE_ANALISE")
    private String flExecucaoPreAnalise;

    @Column(name = "FL_EXECUCAO_ANALISE_RESTRICAO")
    private String flExecucaoAnaliseRestricao;

    @Column(name = "TP_ENTRADA_PRODUTO_PRE_ANALISE")
    private Integer tipoEntradaProdutoPreAnalise;

}