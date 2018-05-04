package backingBeans;


import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "sesion")
@SessionScoped
public class SessionUtils implements Serializable {

    public void add(String key, Object value) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(key, value);
    }

    public void get(String key) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(key);
    }
}
