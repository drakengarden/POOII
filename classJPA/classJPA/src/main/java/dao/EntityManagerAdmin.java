package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin { // singleton
    private static final String UNIT_PERSISTENCE = "classJPA";
    private static EntityManager entityManager = null;
    private EntityManagerAdmin() {};
    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(UNIT_PERSISTENCE);
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }
    public void closeEntityManager() {
        entityManager.close();
    }
}
