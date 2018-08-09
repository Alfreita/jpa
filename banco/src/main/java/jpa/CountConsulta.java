package jpa;

import connection.JpaUtil;
import conta.Conta;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CountConsulta {
    public static void main (String[] args){
        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        Conta conta = em.find(Conta.class,2);

        Query query = em.createQuery("select count(m) from Movimentacao m where m.conta = :pConta");

        query.setParameter("pConta",conta);

        Long quantidade = (Long) query.getSingleResult();

        System.out.println("Total de movimentação: "+ quantidade);

        em.close();
        JpaUtil.closeEMF();
        

    }
}
