package jpa;

import connection.JpaUtil;
import conta.Conta;
import conta.TipoMovimentacao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigDecimal;

public class BuscaMaiorGasto {
    public static void main (String[] args){
        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();
        Conta conta = em.find(Conta.class,2);
        Query query = em.createQuery("select max(m.valor) from Movimentacao m where m.conta = :pConta");
        query.setParameter("pConta",conta);
        BigDecimal soma = (BigDecimal) query.getSingleResult();
        System.out.println("A soma é: "+ soma);

        em.getTransaction().commit();
        em.close();
        JpaUtil.closeEMF();
    }
}
