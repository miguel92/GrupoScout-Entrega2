/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author migue
 */
@Named(value = "seccionesBB")
@RequestScoped
public class seccionesBB {
    private String seccion;
    /**
     * Creates a new instance of seccionesBB
     */
    public seccionesBB() {
    }
    
    public String cargarLista(String seccion){
        this.seccion = seccion;
        return "eventos.xhtml";
    }
    
    public String getSeccion(){
        return seccion;
    }
}
