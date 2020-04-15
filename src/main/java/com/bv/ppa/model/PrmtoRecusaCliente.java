package com.bv.ppa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_prmto_recusa_cliente")
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@NamedQuery(name = "PrmtoRecusaCliente.findByTipo", query = "select t from PrmtoRecusaCliente t where t.codigoTipoConsultaCredito = ?1 AND tipoEntradaProdutoPreAnalise = ?2")
public class PrmtoRecusaCliente {

    @Id
    @Column(name = "CD_PRMTO_RECUSA_CLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoPrmtoRecusaCliente;

    @Column(name = "CD_TIPO_CONSULTA_CREDITO")
    private Integer codigoTipoConsultaCredito;

    @Column(name = "NU_INICIO_FAIXA_PESQUISA_CPF")
    private String nuInicioFaixaPesquisaCpf;

    @Column(name = "NU_FIM_FAIXA_PESQUISA_CPF")
    private String nuFimFaixaPesquisaCpf;

    @Column(name = "TP_ENTRADA_PRODUTO_PRE_ANALISE")
    private String tipoEntradaProdutoPreAnalise;

    @Column(name = "CD_RETORNO_RECUSA")
    private Integer codigoRetornoRecusa;

    @Column(name = "DS_RETORNO_RECUSA")
    private String descricaoRetornoRecusa;

    @Column(name = "QT_DIA_ATRASO")
    private Integer qtDiasAtraso;

    @Column(name = "DT_INICIO_VIGENCIA")
    @Temporal(TemporalType.DATE)
    private Date dtInicioVigencia;

    @Column(name = "DT_FIM_VIGENCIA")
    @Temporal(TemporalType.DATE)
    private Date dtFimVigencia;

    @Column(name = "DS_LOGIN")
    private String descricaoLogin;

    @Column(name = "QT_IMPEDIMENTO_CREDITO")
    private Integer qtImpedimentoCredito;

    @Column(name = "VR_TOTAL_IMPEDIMENTO_CREDITO")
    private Integer vrTotalImpedimentoCredito;

    @Column(name = "FL_CONSULTA_PARALELA")
    private String flConsultaParalela;

    public Integer getCodigoPrmtoRecusaCliente() {
        return codigoPrmtoRecusaCliente;
    }

    public void setCodigoPrmtoRecusaCliente(Integer codigoPrmtoRecusaCliente) {
        this.codigoPrmtoRecusaCliente = codigoPrmtoRecusaCliente;
    }

    public String getNuInicioFaixaPesquisaCpf() {
        return NuInicioFaixaPesquisaCpf;
    }

    public void setNuInicioFaixaPesquisaCpf(String nuInicioFaixaPesquisaCpf) {
        NuInicioFaixaPesquisaCpf = nuInicioFaixaPesquisaCpf;
    }

    public String getNuFimFaixaPesquisaCpf() {
        return NuFimFaixaPesquisaCpf;
    }

    public void setNuFimFaixaPesquisaCpf(String nuFimFaixaPesquisaCpf) {
        NuFimFaixaPesquisaCpf = nuFimFaixaPesquisaCpf;
    }

    public Integer getCodigoRetornoRecusa() {
        return codigoRetornoRecusa;
    }

    public void setCodigoRetornoRecusa(Integer codigoRetornoRecusa) {
        this.codigoRetornoRecusa = codigoRetornoRecusa;
    }

    public String getDescricaoRetornoRecusa() {
        return descricaoRetornoRecusa;
    }

    public void setDescricaoRetornoRecusa(String descricaoRetornoRecusa) {
        this.descricaoRetornoRecusa = descricaoRetornoRecusa;
    }

    public Integer getQtDiasAtraso() {
        return qtDiasAtraso;
    }

    public void setQtDiasAtraso(Integer qtDiasAtraso) {
        this.qtDiasAtraso = qtDiasAtraso;
    }

    public Date getDtInicioVigencia() {
        return dtInicioVigencia;
    }

    public void setDtInicioVigencia(Date dtInicioVigencia) {
        this.dtInicioVigencia = dtInicioVigencia;
    }

    public Date getDtFimVigencia() {
        return dtFimVigencia;
    }

    public void setDtFimVigencia(Date dtFimVigencia) {
        this.dtFimVigencia = dtFimVigencia;
    }

    public String getDescricaoLogin() {
        return descricaoLogin;
    }

    public void setDescricaoLogin(String descricaoLogin) {
        this.descricaoLogin = descricaoLogin;
    }

    public Integer getQtImpedimentoCredito() {
        return qtImpedimentoCredito;
    }

    public void setQtImpedimentoCredito(Integer qtImpedimentoCredito) {
        this.qtImpedimentoCredito = qtImpedimentoCredito;
    }

    public Integer getVrTotalImpedimentoCredito() {
        return vrTotalImpedimentoCredito;
    }

    public void setVrTotalImpedimentoCredito(Integer vrTotalImpedimentoCredito) {
        this.vrTotalImpedimentoCredito = vrTotalImpedimentoCredito;
    }

    public String getFlConsultaParalela() {
        return flConsultaParalela;
    }

    public void setFlConsultaParalela(String flConsultaParalela) {
        this.flConsultaParalela = flConsultaParalela;
    }

    public void setCodigoTipoConsultaCredito(Integer codigoTipoConsultaCredito) {
        this.codigoTipoConsultaCredito = codigoTipoConsultaCredito;
    }

    public void setTipoEntradaProdutoPreAnalise(String tipoEntradaProdutoPreAnalise) {
        this.tipoEntradaProdutoPreAnalise = tipoEntradaProdutoPreAnalise;
    }

    public Integer getCodigoTipoConsultaCredito() {
        return codigoTipoConsultaCredito;
    }

    public String getTipoEntradaProdutoPreAnalise() {
        return tipoEntradaProdutoPreAnalise;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PrmtoRecusaCliente{" +
                "codigoPrmtoRecusaCliente=" + codigoPrmtoRecusaCliente +
                ", codigoTipoConsultaCredito=" + codigoTipoConsultaCredito +
                ", NuInicioFaixaPesquisaCpf='" + NuInicioFaixaPesquisaCpf + '\'' +
                ", NuFimFaixaPesquisaCpf='" + NuFimFaixaPesquisaCpf + '\'' +
                ", tipoEntradaProdutoPreAnalise='" + tipoEntradaProdutoPreAnalise + '\'' +
                ", codigoRetornoRecusa=" + codigoRetornoRecusa +
                ", descricaoRetornoRecusa='" + descricaoRetornoRecusa + '\'' +
                ", qtDiasAtraso=" + qtDiasAtraso +
                ", dtInicioVigencia=" + dtInicioVigencia +
                ", dtFimVigencia=" + dtFimVigencia +
                ", descricaoLogin='" + descricaoLogin + '\'' +
                ", qtImpedimentoCredito=" + qtImpedimentoCredito +
                ", vrTotalImpedimentoCredito=" + vrTotalImpedimentoCredito +
                ", flConsultaParalela='" + flConsultaParalela + '\'' +
                '}';
    }
}