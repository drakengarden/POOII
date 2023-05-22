package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ImpDAO implements IDAO {
    @Override
    public <T> List<T> findAll(Class<T> clazz, String nameQuery) {
        final EntityManager em = getEntityManager();
        TypedQuery<T> query = em.createNamedQuery(nameQuery, clazz);
        return query.getResultList();
    }

    @Override
    public <T> void create(T entity) {
        final EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin(); // start storing data
            em.persist(entity); // store the object given in the argument
            em.getTransaction().commit();
        }
        catch(Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace(); // print last error
        }
    }

    @Override
    public <T> void delete(T entity) {
        final EntityManager em = getEntityManager();
        try {

            em.getTransaction().begin();
            em.remove(entity); // only change in delete node
            em.getTransaction().commit();
        }
        catch(Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public <T> void update(T entity) {
        final EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity); // only change in update node
            em.getTransaction().commit();
        }
        catch(Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public <T> T findById(Long id, Class<T> clazz) { // used for delete()
        EntityManager em = getEntityManager();
        T entity = em.find(clazz, id);
        return entity;
    }

    private EntityManager getEntityManager() { // call singleton for instance of entity manager
        return EntityManagerAdmin.getEntityManager();
    }
}
