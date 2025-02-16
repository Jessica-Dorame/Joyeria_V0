
package Interface;


import Negocio.DTO.Empleado;
import Repositorio.IRepositorioB;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Dórame
 */
public interface IEmpleado extends IRepositorioB<Empleado>{
     public List<Object[]> empleadoSinUsuario(EntityManager em);
     public List <Object[]>  empleadoNombres(EntityManager em, int u);
    
}
