package jpa;

import connection.JpaUtil;
import conta.Conta;
import conta.Movimentacao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class RecebeConta {
    public static void main (String[] args){

        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        Movimentacao movimentacao = em.find(Movimentacao.class, 3);
        Conta conta = movimentacao.getConta();


        System.out.println(conta.getTitular()+" "+conta.getMovimentacoes().size());
    }

}
