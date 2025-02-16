
package ControladorPersistencia;

import Interface.IRol;
import Negocio.DTO.Rol;
import Negocio.DTO.Usuario;
import Repositorio.RepositorioBase;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Dórame
 */
public class RolJpaController extends RepositorioBase <Rol> implements IRol {
          public RolJpaController (EntityManager em){
        super(em);
    }
      
      @Override
    public List <Object[]> getRol(EntityManager em, Usuario u){ 
       String jpql = "select r.RolID from rol r inner join usuariorol u on r.rolid = u.rolid inner join Usuario s on u.usuarioID = s.usuarioID where s.usuarioID = ?"; 
       Query query = em.createNativeQuery(jpql, Usuario.class);
       query.setParameter(1, u.getIdUsuario());
       List <Object[]> user = query.getResultList();
       if(!user.isEmpty()){ 
          return user;
       }
       else{
         return null;  
       }
       
    }
}

