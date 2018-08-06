package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Serve para retornar uma instancia do entityManager pra que nao seja instanciado toda vez em cada classe
 * E tambem com o metodo para fechar a conexão
 */
public class JpaUtil {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static void closeEMF(){
        emf.close();
    }
}
