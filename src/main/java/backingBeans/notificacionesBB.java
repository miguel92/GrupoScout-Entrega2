/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author migue
 */
@Named(value = "notificacionesBB")
@SessionScoped
public class notificacionesBB implements Serializable{

    /**
     * Creates a new instance of notificacionesBB
     */
    private int noLeidas;
    
    public notificacionesBB() {
        noLeidas = 5;
    }

    public int getNoLeidas() {
        return noLeidas;
    }

    public void setNoLeidas(int noLeidas) {
        this.noLeidas = noLeidas;
    }
    
}
