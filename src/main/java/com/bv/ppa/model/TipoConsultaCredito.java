package com.bv.ppa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "tb_tp_consulta_credito")
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@NamedQuery(name = "TipoConsultaCredito.findByTipo", query = "select t from TipoConsultaCredito t where t.tipoConsultaCredito LIKE CONCAT('%',?1,'%') order by t.tipoConsultaCredito")
public class TipoConsultaCredito { 

    @Id
    @Column(name = "CD_TIPO_CONSULTA_CREDITO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoTipoConsultaCredito ;

    @Column(name = "NM_TIPO_CONSULTA_CREDITO")
    private String tipoConsultaCredito;

    public Integer getCodigoTipoConsultaCredito() {
        return codigoTipoConsultaCredito;
    }

    public void setCodigoTipoConsultaCredito(Integer codigoTipoConsultaCredito) {
        this.codigoTipoConsultaCredito = codigoTipoConsultaCredito;
    }

    public String getTipoConsultaCredito() {
        return tipoConsultaCredito;
    }

    public void setTipoConsultaCredito(String tipoConsultaCredito) {
        this.tipoConsultaCredito = tipoConsultaCredito;
    }

    @Override
    public String toString() {
        return "TipoConsultaCredito{" +
                "codigoTipoConsultaCredito=" + codigoTipoConsultaCredito +
                ", tipoConsultaCredito='" + tipoConsultaCredito + '\'' +
                '}';
    }

}
