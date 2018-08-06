package jpa;

import connection.JpaUtil;
import conta.Conta;

import javax.persistence.EntityManager;


public class RemoveConta {
    public static void main (String[] args){

        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();
        Conta conta = em.find(Conta.class,6);
        System.out.println(conta.getTitular());
        em.remove(conta);
        em.getTransaction().commit();
        em.close();
        JpaUtil.closeEMF();
    }
}
