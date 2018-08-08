package jpa;

import connection.JpaUtil;
import conta.Conta;
import conta.Movimentacao;
import conta.TipoMovimentacao;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Calendar;

public class CriaTabelaMovimentacao {
    public static void main(String[] args){

        /*
        conta.setAgencia("1234");
        conta.setBanco("1234");
        conta.setNumero("1234");
        conta.setTitular("Victor Almeida");
        */
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData(Calendar.getInstance());
        movimentacao.setDescricao("Pizza");
        movimentacao.setTipo(TipoMovimentacao.SAIDA);
        movimentacao.setValor(new BigDecimal("200.0"));
        
        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        Conta conta = em.find(Conta.class,6);
        movimentacao.setConta(conta);
        em.persist(conta);
        em.persist(movimentacao);

        em.getTransaction().commit();
        em.close();
        JpaUtil.closeEMF();
    }
}
