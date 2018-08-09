package jpa;

import connection.JpaUtil;
import conta.Conta;
import conta.TipoMovimentacao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import java.math.BigDecimal;

public class Test {
    public static void main(String[] args){
        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        Conta conta = new Conta();
        conta.setId(2);

        String jpql ="select sum(m.valor) from Movimentacao m where m.conta = :pConta"+ " and m.tipo = :pTipo"+" order by m.valor desc";

        Query query = em.createQuery(jpql);
        query.setParameter("pConta",conta);
        query.setParameter("pTipo", TipoMovimentacao.SAIDA);

        BigDecimal soma = (BigDecimal) query.getSingleResult();
        System.out.println("A soma é: "+ soma);

        em.getTransaction().commit();
        em.close();
        JpaUtil.closeEMF();



    }
}
