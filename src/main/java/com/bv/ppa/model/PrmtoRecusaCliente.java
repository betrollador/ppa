package com.bv.ppa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "tb_prmto_recusa_cliente")
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@NamedQuery(name = "PrmtoRecusaCliente.findByTipo", query = "select t from PrmtoRecusaCliente t where t.codigoTipoConsultaCredito = ? AND tipoEntradaProdutoPreAnalise = ?")
public class PrmtoRecusaCliente {

    @Id
    @Column(name = "CD_TIPO_CONSULTA_CREDITO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoTipoConsultaCredito ;

    @Column(name = "TP_ENTRADA_PRODUTO_PRE_ANALISE")
    private String tipoEntradaProdutoPreAnalise;

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
                "codigoTipoConsultaCredito=" + codigoTipoConsultaCredito +
                ", tipoEntradaProdutoPreAnalise='" + tipoEntradaProdutoPreAnalise + '\'' +
                '}';
    }
}