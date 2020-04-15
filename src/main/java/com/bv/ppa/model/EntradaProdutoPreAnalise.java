package com.bv.ppa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_entrada_produto_pre_analise")
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@NamedQuery(name = "EntradaProdutoPreAnalise.findByNome", query = "select e from EntradaProdutoPreAnalise e where e.nomeEntradaProdutoPreanalise LIKE CONCAT('%',?1,'%') order by e.codigoEntradaProdutoPreAnalise")
public class EntradaProdutoPreAnalise {

    @Id
    @Column(name = "CD_ENTRADA_PRODUTO_PRE_ANALISE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEntradaProdutoPreAnalise;

    @Column(name = "NM_ENTRADA_PRODUTO_PRE_ANALISE")
    private String nomeEntradaProdutoPreanalise;

    @Column(name = "DS_ENTRADA_PRODUTO_PRE_ANALISE")
    private String descricaoEntradaProdutoPreanalise;

    @Column(name = "DS_IDNTR_PROGRAMA_PRE_ANALISE")
    private String descricaoIndtrProgramaPreanalise;

    @Column(name = "CD_ENTRADA_PRDTO_PRE_ANLSE_RFN")
    private Integer codigoEntradaProdutoPreAnaliseRfn;

    @Column(name = "DS_LOGIN")
    private String descricaoLogin;

    @Column(name = "FL_ATIVO")
    private String flAtivo;

    @Column(name = "DT_INCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date dtInclusao;

    @Column(name = "DT_ALTERACAO")
    @Temporal(TemporalType.DATE)
    private Date dtAlteracao;

    public Integer getCodigoEntradaProdutoPreAnalise() {
        return codigoEntradaProdutoPreAnalise;
    }

    public void setCodigoEntradaProdutoPreAnalise(Integer codigoEntradaProdutoPreAnalise) {
        this.codigoEntradaProdutoPreAnalise = codigoEntradaProdutoPreAnalise;
    }

    public String getDescricaoLogin() {
        return descricaoLogin;
    }

    public void setDescricaoLogin(String descricaoLogin) {
        this.descricaoLogin = descricaoLogin;
    }

    public String getFlAtivo() {
        return flAtivo;
    }

    public void setFlAtivo(String flAtivo) {
        this.flAtivo = flAtivo;
    }

    public Date getDtInclusao() {
        return dtInclusao;
    }

    public void setDtInclusao(Date dtInclusao) {
        this.dtInclusao = dtInclusao;
    }

    public Date getDtAlteracao() {
        return dtAlteracao;
    }

    public void setDtAlteracao(Date dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }

    public String getNomeEntradaProdutoPreanalise() {
        return nomeEntradaProdutoPreanalise;
    }

    public void setNomeEntradaProdutoPreanalise(String nomeEntradaProdutoPreanalise) {
        this.nomeEntradaProdutoPreanalise = nomeEntradaProdutoPreanalise;
    }

    public String getDescricaoEntradaProdutoPreanalise() {
        return descricaoEntradaProdutoPreanalise;
    }

    public void setDescricaoEntradaProdutoPreanalise(String descricaoEntradaProdutoPreanalise) {
        this.descricaoEntradaProdutoPreanalise = descricaoEntradaProdutoPreanalise;
    }

    public String getDescricaoIndtrProgramaPreanalise() {
        return descricaoIndtrProgramaPreanalise;
    }

    public void setDescricaoIndtrProgramaPreanalise(String descricaoIndtrProgramaPreanalise) {
        this.descricaoIndtrProgramaPreanalise = descricaoIndtrProgramaPreanalise;
    }

    public Integer getCodigoEntradaProdutoPreAnaliseRfn() {
        return codigoEntradaProdutoPreAnaliseRfn;
    }

    public void setCodigoEntradaProdutoPreAnaliseRfn(Integer codigoEntradaProdutoPreAnaliseRfn) {
        this.codigoEntradaProdutoPreAnaliseRfn = codigoEntradaProdutoPreAnaliseRfn;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "EntradaProdutoPreAnalise{" +
                "codigoEntradaProdutoPreAnalise=" + codigoEntradaProdutoPreAnalise +
                ", nomeEntradaProdutoPreanalise='" + nomeEntradaProdutoPreanalise + '\'' +
                ", descricaoEntradaProdutoPreanalise='" + descricaoEntradaProdutoPreanalise + '\'' +
                ", descricaoIndtrProgramaPreanalise='" + descricaoIndtrProgramaPreanalise + '\'' +
                ", codigoEntradaProdutoPreAnalise=" + codigoEntradaProdutoPreAnalise +
                ", descricaoLogin='" + descricaoLogin + '\'' +
                ", flAtivo='" + flAtivo + '\'' +
                ", dtInclusao=" + dtInclusao +
                ", dtAlteracao=" + dtAlteracao +
                '}';
    }
}
