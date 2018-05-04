/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import com.softbox.gruposantoangel.entity.Socio;
import java.util.ArrayList;
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
    
    private List<Socio> socios;

    /**
     * Creates a new instance of sociosBB
     */
    public sociosBB() {
        socios = new ArrayList<Socio>();
        Socio soc = new Socio();
        soc.setId_Socio(Long.parseLong("1"));
        soc.setNombre("Juan");
        soc.setApellidos("Truño");
        socios.add(soc);
        soc = new Socio();
        soc.setId_Socio(Long.parseLong("2"));
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
    
    
}
