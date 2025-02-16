
package Repositorio;



import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Dórame
 * @param <T>
 */
public class RepositorioBase <T> implements IRepositorioB<T> {
    
    private EntityManager entityManager;
    public Class<T> type;

    public RepositorioBase(EntityManager entityManager) {
        this.entityManager = entityManager;

        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public T agregar(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        return entity;
    }
    
    @Override
    public void eliminar(T entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.merge(entity));
        entityManager.getTransaction().commit();
    }

    @Override
    public List<T> lista() {
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(type));
        Query query = entityManager.createQuery(criteria);
        List<T> lista = query.getResultList();
        entityManager.getTransaction().commit();
        return lista;
    }

    @Override
    public T obtener(int id) {
        return entityManager.find(type, id);
    }

    @Override
    public T actualizar(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entityManager.merge(entity));
        entityManager.getTransaction().commit();
        return entity;
    }
   
}
