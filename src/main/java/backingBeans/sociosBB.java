/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import com.softbox.gruposantoangel.entity.Socio;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Borja Delgado
 */
@Named(value = "sociosBB")
@RequestScoped
public class sociosBB {
    
    private Long sigId = Long.parseLong("1");
    private List<Socio> socios;
    private Socio socio = new Socio();

    /**
     * Creates a new instance of sociosBB
     */
    public sociosBB() {
        socios = new ArrayList<Socio>();
        Socio soc = new Socio();
        soc.setId_Socio(sigId++);
        soc.setNombre("Juan");
        soc.setApellidos("Truño");
        soc.setDni("12345678");
        soc.setEmail("HansTheMan@correo.com");
        soc.setDireccion("Calle de Atrás, N1, 1ºB. Madrid, 10101");
        soc.setSexo(true);
        soc.setTelefono(952121212);
        soc.setTelefono_movil(650121212);
        soc.setPerfil("Scouter");
        soc.setGrupo("Clan");
        soc.setAmbito("Federal");
        soc.setFecha_nacimiento(Date.valueOf("1994-02-13"));
        soc.setFecha_ingreso(Date.valueOf(LocalDate.now()));
        socios.add(soc);
        soc = new Socio();
        soc.setId_Socio(sigId++);
        soc.setNombre("Loles");
        soc.setApellidos("Lelos");
        socios.add(soc);
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
    
    public String createSocio(){
        socio.setId_Socio(sigId++);
        socio.setFecha_ingreso(Date.valueOf(LocalDate.now()));
        socios.add(socio);
        socio = new Socio();
        return "sociosLista.xhtml";
    }
    
    public String updateSocio(){
        socios.add(socio);
        socio = new Socio();
        return "sociosLista.xhtml";
    }
    
    public String buscarSocio(Socio soc){
        socio = soc;
        return "modificarSocio.xhtml";
    }
    
    public String readSocio(Socio soc){
        socio = soc;
        return "consultarSocio.xhtml";
    }
    
    public String deleteSocio(Socio soc){
        boolean borrado = false;
        int i = 0;
        while(!borrado && i < socios.size()){
            if(socios.get(i).getId_Socio().compareTo(soc.getId_Socio())==0){
                socios.remove(i);
                borrado=true;
            }
            i++;
        }

        socio = new Socio();
        return "sociosLista.xhtml";
    }
}
