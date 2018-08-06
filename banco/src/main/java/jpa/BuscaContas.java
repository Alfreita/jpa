package jpa;

import connection.JpaUtil;
import conta.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Aqui as entitdades se encontram no estado managed ou seja elas tem sincronização automatica com o banco
 */
public class BuscaContas {

    public static void main(String[] args){

        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        Conta conta = em.find(Conta.class,6);

        //conta.setTitular("Jaison");

        System.out.println(conta.getTitular());

        em.getTransaction().commit();


        em.close();
        JpaUtil.closeEMF();
    }

}
