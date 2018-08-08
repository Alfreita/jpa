package jpa;

import connection.JpaUtil;
import conta.Conta;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class TodasAsMovimentacoes {
    public static void main(String[] args){
        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        String jpql = "select c from Conta c JOIN  fetch  c.movimentacoes";

        Query query = em.createQuery(jpql);

        List<Conta> todasAsContas = query.getResultList();

        for (Conta conta : todasAsContas) {
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Movimentacoes: ");
           System.out.println(conta.getMovimentacoes());
        }

    }

}
