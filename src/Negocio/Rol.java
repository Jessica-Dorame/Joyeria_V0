
package Negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dórame
 */
@Entity
public class Rol implements Serializable {
    @Id
@GeneratedValue(strategy=GenerationType.AUTO)
    private int roidRol;
    private String tipoRol;

    public Rol() {
    }

    public Rol( String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public int getRoidRol() {
        return roidRol;
    }

    public void setRoidRol(int roidRol) {
        this.roidRol = roidRol;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }
    
    
}
