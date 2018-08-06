package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static void closeEMF(){
        emf.close();
    }
}
