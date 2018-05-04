/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softbox.gruposantoangel.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author miguel_martin
 */
@Entity
public class Campos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_campo", length = 30)
    private Long id_campo;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Column(name = "tipo", nullable = false, length = 100)
    private String tipo;
    @Column(name = "tam", nullable = false)
    private Integer tam;
    @ManyToMany(mappedBy = "campos")
    private List<Documento_Plantilla> docs_plantilla;
    
    public Long getId_campo() {
        return id_campo;
    }

    public void setId_campo(Long id) {
        this.id_campo = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getTam() {
        return tam;
    }

    public void setTam(Integer tam) {
        this.tam = tam;
    }

    public List<Documento_Plantilla> getDocs_plantilla() {
        return docs_plantilla;
    }

    public void setDocs_plantilla(List<Documento_Plantilla> docs_plantilla) {
        this.docs_plantilla = docs_plantilla;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_campo != null ? id_campo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campos)) {
            return false;
        }
        Campos other = (Campos) object;
        if ((this.id_campo == null && other.id_campo != null) || (this.id_campo != null && !this.id_campo.equals(other.id_campo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entrega1_scouts.Campos[ id=" + id_campo + " ]";
    }
    
}
