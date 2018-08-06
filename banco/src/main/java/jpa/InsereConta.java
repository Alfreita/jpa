package jpa;

import connection.JpaUtil;
import conta.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsereConta {
    public static void main (String[] args){
        Conta conta  = new Conta();
        conta.setAgencia("1234");
        conta.setBanco("1234");
        conta.setNumero("1234");
        conta.setTitular("Victor Almeida");

        EntityManager em = new JpaUtil().getEntityManager();

        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();

        System.out.println("ID da tarefa:  "+ conta.getId());


        em.close();
        JpaUtil.closeEMF();




    }

}
