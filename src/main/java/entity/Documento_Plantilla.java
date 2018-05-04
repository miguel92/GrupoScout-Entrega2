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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author miguel_martin
 */
@Entity
public class Documento_Plantilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_doc_plantilla",length =30)
    private Long id_doc_plantilla;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @ManyToMany
    @JoinTable(name = "CAMPOS_DOCUMENTO_PLANTILLA", joinColumns = @JoinColumn(name = "id_doc_plantilla_fk"), inverseJoinColumns = @JoinColumn(name = "id_campo_fk"))
    private List<Campos> campos;
    @OneToMany(mappedBy = "doc_plantilla")
    private List<Documento> documentos;
    
    public Long getId_doc_plantilla() {
        return id_doc_plantilla;
    }

    public void setId_doc_plantilla(Long id) {
        this.id_doc_plantilla = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Campos> getCampos() {
        return campos;
    }

    public void setCampos(List<Campos> campos) {
        this.campos = campos;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_doc_plantilla != null ? id_doc_plantilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento_Plantilla)) {
            return false;
        }
        Documento_Plantilla other = (Documento_Plantilla) object;
        if ((this.id_doc_plantilla == null && other.id_doc_plantilla != null) || (this.id_doc_plantilla != null && !this.id_doc_plantilla.equals(other.id_doc_plantilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entrega1_scouts.Documento_Plantilla[ id=" + id_doc_plantilla + " ]";
    }
    
}
