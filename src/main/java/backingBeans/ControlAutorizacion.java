/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import com.softbox.gruposantoangel.entity.Socio;
import com.softbox.gruposantoangel.entity.Usuario;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author migue
 */
@Named(value = "controlAutorizacion")
@RequestScoped
public class ControlAutorizacion implements Serializable{


    private Socio socio;

    public void setUsuario(Socio socio) {
        this.socio = socio;
    }

    public Socio getSocio() {
        return socio;
    }
    

    /*public String home() {
        // Implementar el método
        // Devuelve la página Home dependiendo del rol del usuario
        // Si no hay usuario debe devolver la página de login
        // Si el usuario es el administrador debe devolver la página admin.xhtml
        // Si el usuario es un usuario normal debe devolver la página normal.xhtml
        String cadena = null;
        if(usuario.getPerfil()==){
            cadena = "admin.xhtml";
        }else if(usuario.getRol() == Usuario.Rol.NORMAL){
            cadena = "normal.xhtml";
        }
        return cadena;
    }*/
    
    public String logout()
    {
        // Destruye la sesión (y con ello, el ámbito de este bean)
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.getExternalContext().invalidateSession();
        socio = null;
        return "index.xhtml";
    }

    /**
     * Creates a new instance of ControlAutorizacion
     */
    public ControlAutorizacion() {
    }
    
}
