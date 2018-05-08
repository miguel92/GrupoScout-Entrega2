/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import com.softbox.gruposantoangel.entity.Evento;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Borja Delgado
 */
@Named(value = "eventosBB")
@SessionScoped
public class eventosBB implements Serializable{
    
    private Long sigIdEvento = Long.parseLong("1");   
    private List<Evento> eventos;
    private Evento evento = new Evento();

    /**
     * Creates a new instance of sociosBB
     */
    public eventosBB() {
        eventos = new ArrayList<Evento>();
        Evento evento1 = new Evento();
        evento1.setId_evento(sigIdEvento++);
        evento1.setNombre("Evento 1");
        evento1.setDescripcion("Es una pasada.");
        evento1.setLocalizacion("Extremadura");
        evento1.setPrecio(Float.parseFloat("56.99"));
        evento1.setFecha(Date.valueOf("2018-09-13"));

        
        eventos.add(evento1);
        
        Evento evento2 = new Evento();
        
        evento2.setId_evento(sigIdEvento++);
        evento2.setNombre("Evento 2");
        evento2.setDescripcion("Meh.");
        evento2.setLocalizacion("Malaga");
        evento2.setPrecio(Float.parseFloat("14.99"));
        evento2.setFecha(Date.valueOf("2018-07-09"));
        eventos.add(evento2);
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    //Accede a la vista de creación de eventos
    public String newEvento(){
        evento = new Evento();
        return "crearEvento.xhtml";
    }
    
    //Crea el evento con los datos proporcionado en la vista de creación
    public String createEvento(){
        evento.setId_evento(sigIdEvento++);        
        eventos.add(evento);
        return "listarEventos.xhtml";
    }
    
    public String updateEvento(Evento soc){
        evento = soc;
        return "modificarEvento.xhtml";
    }
    
    public String readEvento(Evento soc){
        evento = soc;
        return "consultarEvento.xhtml";
    }
    
    public String deleteEvento(Evento soc){
        boolean borrado = false;
        int i = 0;
        while(!borrado && i < eventos.size()){
            if(eventos.get(i).getId_evento().compareTo(soc.getId_evento())==0){
                eventos.remove(i);
                borrado=true;
            }
            i++;
        }
        return "listarEventos.xhtml";
    }
}
