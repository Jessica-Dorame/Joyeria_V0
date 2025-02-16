
package ControladorPersistencia;

import Interface.IUsuario;
import Negocio.DTO.Usuario;
import Repositorio.RepositorioBase;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import util.HashUtil;

/**
 *
 * @author Dórame
 */
public class UsuarioJpaController extends RepositorioBase <Usuario> implements IUsuario{
    
    public UsuarioJpaController(EntityManager em){
        super(em);
    }
    
    /**
     * Regresa el Id del ultimo usuario registrado
     * @param em
     * @return Id
     */
    @Override
    public List <Object>  getUltimoUsuario(EntityManager em){ 
       String jpql = "select u.UsuarioID from Usuario u order by u.UsuarioID desc LIMIT 1;"; 
       Query query = em.createNativeQuery(jpql);
       List <Object> user = query.getResultList();
       return user;      
    }
    
    /**
     * Regresa el usuario segun el nombre de usuario
     * @param em
     * @param usuario
     * @param clave
     * @return Nombre Usuario
     */
    @Override
    public List <Object>  getUsuario(EntityManager em, String usuario, String clave){ 
       String jpql = "select *  from Usuario where usuario = ?;"; 
       Query query = em.createNativeQuery(jpql, Usuario.class);
       query.setParameter(1,usuario);
       List <Object> user = query.getResultList();
       if(!user.isEmpty()){
    
         String hashClave = HashUtil.hashPassword(clave); // clave a hash
         Usuario us = (Usuario) user.get(0);
        
         if( hashClave.equals(us.getClave())){
             return user;
            }
       }
       else{
         return null;  
       }
         
      return user;
     }
    
/**
 * Método para obtener la lista de usuarios menos el usuario con que iniciaron sesion
 * @param em
 * @param u
 * @return 
 */
 
    @Override
     public List<Object[]> obtenerU(EntityManager em, int u){
         String sql = "select * from Usuario where usuarioid != ?";
         Query query = em.createNativeQuery(sql);
         query.setParameter(1, u);
        
        List <Object[]> user = query.getResultList();
         if(!user.isEmpty()){
             return user;
         }
         else{
             return null;
         }
         
     }
     
}