/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import com.softbox.gruposantoangel.entity.Evento;
import com.softbox.gruposantoangel.entity.Linea_Presupuesto_Evento;
import com.softbox.gruposantoangel.entity.Presupuesto_Evento;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Tilted-Shugar
 */
@Named(value = "presupuestosBB")
@SessionScoped
public class presupuestosBB implements Serializable{
    
    private Long sigId = Long.parseLong("1");  
    private List<Presupuesto_Evento> presupuestos;
    private Presupuesto_Evento presupuesto = new Presupuesto_Evento();
    
    private Long sigLineaId = Long.parseLong("1");
    private List<Linea_Presupuesto_Evento> linea_presupuestos;
    private Linea_Presupuesto_Evento linea_presupuesto = new Linea_Presupuesto_Evento();
    
    public presupuestosBB(){
        presupuestos = new ArrayList<Presupuesto_Evento>();
        Presupuesto_Evento presu1 = new Presupuesto_Evento();
        Evento evento1 = new Evento();
        evento1.setId_evento(Long.parseLong("1"));
        presu1.setId_presupuesto(sigId++);
        presu1.setFecha(Date.valueOf("2018-02-13"));
        presu1.setImporte_total(340);
        presu1.setEvento(evento1);
        presupuestos.add(presu1);
        
        Presupuesto_Evento presu2 = new Presupuesto_Evento();
        Evento evento2 = new Evento();
        presu2.setId_presupuesto(sigId++);
        presu2.setFecha(Date.valueOf("2015-02-12"));
        presu2.setImporte_total(730);
        presu2.setEvento(evento2);
        presupuestos.add(presu2);
        
        linea_presupuestos = new ArrayList<Linea_Presupuesto_Evento>();
        Linea_Presupuesto_Evento linea_presu1 = new Linea_Presupuesto_Evento();
        linea_presu1.setLinea(sigLineaId++);
        linea_presu1.setConcepto("La vida");
        linea_presu1.setCantidad(65);
        linea_presu1.setPrecio(Long.parseLong("10"));
        linea_presupuestos.add(linea_presu1);
    }
    
//Mierdas para PRESUPUESTO_EVENTO
    
    public List<Presupuesto_Evento> getPresupuestos() {
        return presupuestos;
    }

    public void setPresupuestos(List<Presupuesto_Evento> presupuestos) {
        this.presupuestos = presupuestos;
    }

    public Presupuesto_Evento getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto_Evento presupeusto) {
        this.presupuesto = presupeusto;
    }
    
    public String newPresupuesto(){
        presupuesto = new Presupuesto_Evento();
        return "presupuestosCrear.xhtml";
    }
    
    public String createPresupuesto(){
        presupuesto.setId_presupuesto(sigId++);      
        presupuesto.setFecha(Date.valueOf(LocalDate.now()));
        presupuestos.add(presupuesto);
        return "presupuestosLista.xhtml";
    }
    
    public String updatePresupuesto(Presupuesto_Evento presu){
        presupuesto = presu;
        return "presupuestosModificar.xhtml";
    }
    
    public String readPresupuesto(Presupuesto_Evento presu){
        presupuesto = presu;
        return "presupuestosConsultar.xhtml";
    }
    
    public String deletePresupuesto(Presupuesto_Evento presu){
        boolean borrado = false;
        int i = 0;
        while(!borrado && i < presupuestos.size()){
            if(presupuestos.get(i).getId_presupuesto().compareTo(presu.getId_presupuesto())==0){
                presupuestos.remove(i);
                borrado=true;
            }
            i++;
        }
        return "presupuestosLista.xhtml";
    }
    
    
    
    //Mierdas para LINEA_PRESUPEUSTO_EVENTO        
    
    public List<Linea_Presupuesto_Evento> getLineaPresupuestos() {
        return linea_presupuestos;
    }
    
    
}




