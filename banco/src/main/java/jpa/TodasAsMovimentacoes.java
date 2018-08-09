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

        /**
         * A falta do uso do distinct faz com que cada conta que tenha mais que 1 movimentação,
         * no caso a conta Paulo, se ela tiver 3 movimentaçoes ela será impressa 3 vezes,
         * pois a Jpa faz um produto cartesiano
         */

        String jpql = "select distinct c from Conta c JOIN  fetch  c.movimentacoes";
        /**
         * usando o left join, busca-se todas as contas no banco inclusive as que não tem
         * movimentação
         * String jpql = "select distinct c from Conta c left JOIN  fetch  c.movimentacoes";
         */

        Query query = em.createQuery(jpql);

        List<Conta> todasAsContas = query.getResultList();

        for (Conta conta : todasAsContas) {
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Movimentacoes: ");
            System.out.println(conta.getMovimentacoes());
    }

        em.close();
        JpaUtil.closeEMF();

    }

}
