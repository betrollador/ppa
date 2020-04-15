package com.bv.ppa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "tb_prmto_consulta_restritivo")
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@NamedQuery(name = "PrmtoConsultaRestritivo.findById", query = "select t from PrmtoConsultaRestritivo t where t.codigoPrmtoConsultaRestritivo = ?1")
public class PrmtoConsultaRestritivo {

    @Id
    @Column(name = "CD_PRMTO_CONSULTA_RESTRITIVO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoPrmtoConsultaRestritivo;

    @Column(name = "CD_TIPO_CONSULTA_CREDITO")
    private Integer codigoTipoConsultaCredito;

    @Column(name = "FL_CONSULTA_RESTRITIVO_BUREAU")
    private String consultaRestritivoBureau;

    @Column(name = "FL_BLOQUEIO_SIMULACAO_CREDITO")
    private String bloqueioSimulacaoCredito;

    @Column(name = "TP_ENTRADA_PRODUTO_PRE_ANALISE")
    private Integer tipoEntradaProdutoPreAnalise;

    public Integer getCodigoPrmtoConsultaRestritivo() {
        return codigoPrmtoConsultaRestritivo;
    }

    public void setCodigoPrmtoConsultaRestritivo(Integer codigoPrmtoConsultaRestritivo) {
        this.codigoPrmtoConsultaRestritivo = codigoPrmtoConsultaRestritivo;
    }

    public Integer getCodigoTipoConsultaCredito() {
        return codigoTipoConsultaCredito;
    }

    public void setCodigoTipoConsultaCredito(Integer codigoTipoConsultaCredito) {
        this.codigoTipoConsultaCredito = codigoTipoConsultaCredito;
    }

    public String getConsultaRestritivoBureau() {
        return consultaRestritivoBureau;
    }

    public void setConsultaRestritivoBureau(String consultaRestritivoBureau) {
        this.consultaRestritivoBureau = consultaRestritivoBureau;
    }

    public String getBloqueioSimulacaoCredito() {
        return bloqueioSimulacaoCredito;
    }

    public void setBloqueioSimulacaoCredito(String bloqueioSimulacaoCredito) {
        this.bloqueioSimulacaoCredito = bloqueioSimulacaoCredito;
    }

    public Integer getTipoEntradaProdutoPreAnalise() {
        return tipoEntradaProdutoPreAnalise;
    }

    public void setTipoEntradaProdutoPreAnalise(Integer tipoEntradaProdutoPreAnalise) {
        this.tipoEntradaProdutoPreAnalise = tipoEntradaProdutoPreAnalise;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PrmtoConsultaRestritivo{" +
                "codigoPrmtoConsultaRestritivo=" + codigoPrmtoConsultaRestritivo +
                ", codigoTipoConsultaCredito=" + codigoTipoConsultaCredito +
                ", consultaRestritivoBureau='" + consultaRestritivoBureau + '\'' +
                ", bloqueioSimulacaoCredito='" + bloqueioSimulacaoCredito + '\'' +
                ", tipoEntradaProdutoPreAnalise=" + tipoEntradaProdutoPreAnalise +
                '}';
    }
}