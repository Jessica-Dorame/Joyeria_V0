
package Interface;

import Negocio.DTO.Rol;
import Negocio.DTO.Usuario;
import Repositorio.IRepositorioB;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Dórame
 */
public interface IRol extends IRepositorioB <Rol> {
    public List <Object[]> getRol(EntityManager em, Usuario u);
}
