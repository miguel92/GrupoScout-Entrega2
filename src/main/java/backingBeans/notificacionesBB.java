/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import com.softbox.gruposantoangel.entity.Evento;
import com.softbox.gruposantoangel.entity.Notificacion_Documento;
import com.softbox.gruposantoangel.entity.Notificacion_Evento;
import com.softbox.gruposantoangel.entity.Socio;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
    private Long sigIdNotificacion = Long.parseLong("1");
    private Long sigIdEvento = Long.parseLong("1");
    private Long sigIdSocio = Long.parseLong("1000");
    private List<Notificacion_Evento> notif_eventos;
    private Notificacion_Evento notificacion = new Notificacion_Evento();
    
    public notificacionesBB() {
        this.noLeidas = 2;
        notif_eventos = new ArrayList<Notificacion_Evento>();
        Notificacion_Evento notif1 = new Notificacion_Evento();
        Evento ev1 = new Evento();
        ev1.setId_evento(sigIdEvento++);
        ev1.setNombre("Visita a Antequera");
        ev1.setDescripcion("Se visitaran las cuevas y los bosques.");
        
        ev1.setFecha(Date.valueOf("2018-07-15"));
        Socio socio1 = new Socio();
        socio1.setId_Socio(sigIdSocio++);
        notif1.setId_not_evento(sigIdNotificacion++);
        notif1.setEvento(ev1);
        notif1.setId_not_evento(ev1.getId_evento());
        notif1.setSocio(socio1);
        notif1.setFechaNotificacion(Date.valueOf("2018-05-12"));
        notif1.setEstado("False");
        notif_eventos.add(notif1);
        
        Notificacion_Evento notif2 = new Notificacion_Evento();
        Evento ev2 = new Evento();
        ev2.setId_evento(sigIdEvento++);
        ev2.setNombre("Actividad en el campamento de Huelva");
        ev2.setDescripcion("Instancia de tres dias en el campamento");
        ev2.setFecha(Date.valueOf("2018-08-05"));
        Socio socio2 = new Socio();
        socio2.setId_Socio(sigIdSocio++);
        notif2.setId_not_evento(sigIdNotificacion++);
        notif2.setEvento(ev2);
        notif2.setId_not_evento(ev2.getId_evento());
        notif2.setSocio(socio2);
        notif2.setFechaNotificacion(Date.valueOf("2018-05-09"));
        notif2.setEstado("False");
        notif_eventos.add(notif2);
        
    }

    public int getNoLeidas() {
        return noLeidas;
    }

    public void setNoLeidas(int noLeidas) {
        this.noLeidas = noLeidas;
    }
    
    public List<Notificacion_Evento> getNotifEventos(){
        return notif_eventos;
    }
    
    public void setNotif_Eventos(List<Notificacion_Evento> notif){
        this.notif_eventos = notif;
    }
    
    public Notificacion_Evento getNotificacion_Evento(){
        return notificacion;
    }
    

    public void setNotificacion_Evento(Notificacion_Evento notif) {
        this.notificacion = notif;
    }
    
    //Accede a la vista de creación de socios
    
    
    //Crea el socio con los datos proporcionado en la vista de creación

}
