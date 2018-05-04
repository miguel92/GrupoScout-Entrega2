/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softbox.gruposantoangel.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author otman
 */
@Entity
public class Presupuesto_Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length=30, name="id_presupuesto")
    private Long id_presupuesto;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name="importe_total",nullable=false)
    private Integer importe_total;
    @ManyToOne
    private Evento evento;

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Evento getEvento() {
        return evento;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getFecha() {
        return fecha;
    }

    public Integer getImporte_total() {
        return importe_total;
    }
    
    
    
    public Long getId_presupuesto() {
        return id_presupuesto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    public void setImporte_total(Integer importe_total) {
        this.importe_total = importe_total;
    }
    
    
    public void setId_presupuesto(Long id) {
        this.id_presupuesto = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_presupuesto != null ? id_presupuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presupuesto_Evento)) {
            return false;
        }
        Presupuesto_Evento other = (Presupuesto_Evento) object;
        if ((this.id_presupuesto == null && other.id_presupuesto != null) || (this.id_presupuesto != null && !this.id_presupuesto.equals(other.id_presupuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mi_parte_trabajo.Presupuesto_Evento[ id=" + id_presupuesto + " ]";
    }
    
}
