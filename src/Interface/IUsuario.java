
package Interface;


import Negocio.DTO.Usuario;
import Repositorio.IRepositorioB;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Dórame
 */
public interface IUsuario  extends IRepositorioB <Usuario>{
    public List <Object>  getUltimoUsuario(EntityManager em);
    public List <Object>  getUsuario(EntityManager em,String usuario, String clave);
    public List <Object[]> obtenerU(EntityManager em, int u);

 
}
