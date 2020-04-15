package com.bv.ppa.view;

import com.bv.ppa.model.PrmtoRecusaCliente;
import com.bv.ppa.model.TipoConsultaCredito;
import com.bv.ppa.util.WsClient;
import org.primefaces.event.RowEditEvent;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;





@Named
@SessionScoped
public class PpaController implements Serializable {

    private List<PrmtoRecusaCliente> listaPrmtoRecusaCliente;
    private Integer tipoConsultaCreditoSelected;

    public List<PrmtoRecusaCliente> getListaPrmtoRecusaCliente() {
        return listaPrmtoRecusaCliente;
    }

    public void setListaPrmtoRecusaCliente(List<PrmtoRecusaCliente> listaPrmtoRecusaCliente) {
        this.listaPrmtoRecusaCliente = listaPrmtoRecusaCliente;
    }

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

    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("PrmtoRecusaCliente Edited", event.getObject().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", event.getObject().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
