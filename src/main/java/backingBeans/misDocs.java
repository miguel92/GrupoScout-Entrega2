/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import com.softbox.gruposantoangel.entity.Documento;
import com.softbox.gruposantoangel.entity.EstadoDoc;
import java.io.Serializable;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author migue
 */
@Named(value = "misDocs")
@SessionScoped
public class misDocs implements Serializable{
    private Long nextDoc = Long.parseLong("1");
    private List<Documento> lista_docs;
    private Documento miDoc;
    /**
     * Creates a new instance of misDocs
     */
    public misDocs() {
        lista_docs = new ArrayList<>();
        miDoc = new Documento();
        miDoc.setId_documento(nextDoc++);
        miDoc.setFecha(Date.valueOf("2018-02-19"));
        miDoc.setEnlace("C:\\files\\578025.png");
        miDoc.setNombre("Alergias");
        miDoc.setTipo("1");
        miDoc.setEstado(EstadoDoc.ACEPTADO);
        lista_docs.add(miDoc);
        
        miDoc = new Documento();
        miDoc.setId_documento(nextDoc++);
        miDoc.setFecha(Date.valueOf("2017-07-19"));
        miDoc.setEnlace("./resources/docs/dni.pdf");
        miDoc.setNombre("DNI");
        miDoc.setEstado(EstadoDoc.ENTREGADO);
        miDoc.setTipo("2");
        lista_docs.add(miDoc);
        
    }

    public Long getNextDoc() {
        return nextDoc;
    }

    public void setNextDoc(Long nextDoc) {
        this.nextDoc = nextDoc;
    }

    public List<Documento> getLista_docs() {
        return lista_docs;
    }

    public void setLista_docs(List<Documento> lista_docs) {
        this.lista_docs = lista_docs;
    }

    public Documento getMiDoc() {
        return miDoc;
    }

    public void setMiDoc(Documento miDoc) {
        this.miDoc = miDoc;
    }
    
    public String borrarDoc(Documento doc){
        
        boolean encontrado = false;
        int contador = 0;
        Documento temp = null;

        while(contador < lista_docs.size() && !encontrado){
            temp = lista_docs.get(contador);
            if(doc.getId_documento().compareTo(temp.getId_documento())==0){
                encontrado = true;
                lista_docs.remove(contador);
            }
            contador++;
        }
        return "misDocumentos.xhtml";
    }
    public String getEnlace(Documento doc){
        return doc.getEnlace();
    }
}
