
package ControladorPersistencia;

import Interface.IUsuarioRol;
import Negocio.DTO.usuarioRol;
import Repositorio.RepositorioBase;
import javax.persistence.EntityManager;


/**
 *
 * @author Dórame
 */
public class usuarioRolJpaController extends RepositorioBase <usuarioRol> implements IUsuarioRol{
    public usuarioRolJpaController (EntityManager em){
        super(em);
    }
    
}
