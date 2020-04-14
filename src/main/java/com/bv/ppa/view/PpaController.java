package com.bv.ppa.view;

import com.bv.ppa.model.TipoConsultaCredito;
import com.bv.ppa.util.WsClient;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;





@Named
@SessionScoped
public class PpaController implements Serializable {



    private Integer tipoConsultaCreditoSelected;

    public Integer getTipoConsultaCreditoSelected() {
        return tipoConsultaCreditoSelected;
    }

    public void setTipoConsultaCreditoSelected(Integer tipoConsultaCreditoSelected) {
        this.tipoConsultaCreditoSelected = tipoConsultaCreditoSelected;
    }

    public String doLogin() {
        return "/demo/ppa.xhtml?faces-redirect=true";
    }

    public List<TipoConsultaCredito> buscaAutoCompleteTipoConsultaCredito(String busca) {
        WsClient ws = new WsClient();
        List<TipoConsultaCredito> ls = ws.doBuscaTipoConsultaCredito(busca);
        return ls;
    }

}
