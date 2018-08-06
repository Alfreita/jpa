package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscaContas {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
        EntityManager em = emf.createEntityManager();


    }

}
