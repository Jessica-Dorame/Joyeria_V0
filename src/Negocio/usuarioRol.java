
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
public class usuarioRol implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idUsuarioRol;
    private int idUsuario;
    private int idRol;

    public usuarioRol() {
    }

        public usuarioRol( int idUsuario, int idRol) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
    }
        
    public int getIdUsuarioRol() {
        return idUsuarioRol;
    }

    public void setIdUsuarioRol(int idUsuarioRol) {
        this.idUsuarioRol = idUsuarioRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }


    
}
