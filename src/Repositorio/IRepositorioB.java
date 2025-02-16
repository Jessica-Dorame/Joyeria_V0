
package Repositorio;

import java.util.List;
/**
 *
 * @author Dórame
 * @param <T>
 */
public interface IRepositorioB <T>{
    
    T obtener(int id);
    T agregar(T entidad);
    T actualizar (T entid);
    void eliminar (T entidad);
    List<T> lista(); 
   // List<Object[]> empleadoSinUsuario();

}
