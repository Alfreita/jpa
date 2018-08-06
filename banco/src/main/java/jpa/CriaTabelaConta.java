package jpa;

import conta.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaTabelaConta {

    public static void main(String[] args){


       /* Conta conta = new Conta();
        conta.setAgencia("1234");
        conta.setBanco("1234");
        conta.setId(1235);
        conta.setNumero("1234");
        conta.setTitular("victor");
*/
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
        EntityManager em = emf.createEntityManager();
      //  em.getTransaction().begin();
        //em.persist(conta);
       //  em.getTransaction().commit();
        em.close();
        emf.close();


    }


}
