/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softbox.gruposantoangel.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author otman
 */
@Entity
public class Linea_Presupuesto_Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length=30, name="linea")
    private Long linea;
    @Column(name="concepto",length=100 ,nullable=false)
    private String concepto;
    @Column(name="cantidad",nullable=false)
    private Integer cantidad;
    @Column(name = "precio",nullable=false)
    private Long precio;
    @ManyToOne 
    private Presupuesto_Evento presupuesto_evento;
    
    public Linea_Presupuesto_Evento(Long linea, String concepto, int cantidad, Long precio){
        super( );
        this.linea = linea;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Linea_Presupuesto_Evento (){
        super();
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }
    
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getConcepto() {
        return concepto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Long getPrecio() {
        return precio;
    }
    
    
    public Long getLinea() {
        return linea;
    }

    public void setLinea(Long id) {
        this.linea = id;
    }
    
    public void setPresupuesto_evento (Presupuesto_Evento presupuesto){
        this.presupuesto_evento = presupuesto;
    }
    
    public Presupuesto_Evento getPresupuesto_evento(){
        return presupuesto_evento;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (linea != null ? linea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linea_Presupuesto_Evento)) {
            return false;
        }
        Linea_Presupuesto_Evento other = (Linea_Presupuesto_Evento) object;
        if ((this.linea == null && other.linea != null) || (this.linea != null && !this.linea.equals(other.linea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mi_parte_trabajo.Linea_Presupuesto_Evento[ id=" + linea + " ]";
    }
    
}
