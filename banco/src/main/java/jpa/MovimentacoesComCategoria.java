package jpa;

import connection.JpaUtil;
import conta.Categoria;
import conta.Conta;
import conta.Movimentacao;
import conta.TipoMovimentacao;


import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

public class MovimentacoesComCategoria {
    public static void main (String[] args){
        Categoria categoria1 = new Categoria("Viagem");
        Categoria categoria2 = new Categoria("Negocios");
        
        Conta conta = new Conta();
        conta.setId(2);

        /*
        Movimentacao movimentacao1 = new Movimentacao();
        movimentacao1.setData(Calendar.getInstance()); //hoje
        movimentacao1.setDescricao("Viagem à SP");
        movimentacao1.setTipo(TipoMovimentacao.SAIDA);
        movimentacao1.setValor(new BigDecimal("100.0"));
        movimentacao1.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacao1.setConta(conta);
        */
        Movimentacao movimentacao2 = new Movimentacao();
        movimentacao2.setData(Calendar.getInstance()); //hoje
        movimentacao2.setDescricao("noteBook");
        movimentacao2.setTipo(TipoMovimentacao.SAIDA);
        movimentacao2.setValor(new BigDecimal("900.0"));
        movimentacao2.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacao2.setConta(conta);

        EntityManager em  = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        em.persist(categoria1);
        em.persist(categoria2);
        //em.persist(movimentacao1);
        em.persist(movimentacao2);

        em.getTransaction().commit();
        em.close();
        JpaUtil.closeEMF();


    }
}
