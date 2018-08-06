package jpa;

import connection.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscaContas {

    public static void main(String[] args){

        EntityManager em = new JpaUtil().getEntityManager();

        em.close();
        JpaUtil.closeEMF();
    }

}
