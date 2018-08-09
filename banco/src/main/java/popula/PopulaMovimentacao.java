package popula;

import connection.JpaUtil;
import conta.Categoria;
import conta.Conta;
import conta.Movimentacao;
import conta.TipoMovimentacao;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;


/**
 * Classe para popular o banco de dados
 */
public class PopulaMovimentacao {
    public static void main (String[] args){
        Categoria categoria1 = new Categoria("Viagem");
        Categoria categoria2 = new Categoria("Negocios");

        Conta conta = new Conta();
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();
        Conta conta4 = new Conta();
        Conta conta5 = new Conta();
        Conta conta6 = new Conta();

        conta.setId(1);
        conta1.setId(2);
        conta2.setId(3);
        conta3.setId(4);
        conta4.setId(5);
        conta5.setId(6);
        conta6.setId(7);


        Movimentacao movimentacaoS = new Movimentacao();
        movimentacaoS.setData(Calendar.getInstance()); //hoje
        movimentacaoS.setDescricao("Viagem à SP");
        movimentacaoS.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoS.setValor(new BigDecimal("100.0"));
        movimentacaoS.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoS.setConta(conta);

        Movimentacao movimentacaoR = new Movimentacao();
        movimentacaoR.setData(Calendar.getInstance()); //hoje
        movimentacaoR.setDescricao("Viagem à RJ");
        movimentacaoR.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoR.setValor(new BigDecimal("100.0"));
        movimentacaoR.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoR.setConta(conta);

        Movimentacao movimentacaoS1 = new Movimentacao();
        movimentacaoS1.setData(Calendar.getInstance()); //hoje
        movimentacaoS1.setDescricao("Viagem à SP");
        movimentacaoS1.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoS1.setValor(new BigDecimal("100.0"));
        movimentacaoS1.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoS1.setConta(conta1);

        Movimentacao movimentacaoR1 = new Movimentacao();
        movimentacaoR1.setData(Calendar.getInstance()); //hoje
        movimentacaoR1.setDescricao("Viagem à RJ");
        movimentacaoR1.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoR1.setValor(new BigDecimal("100.0"));
        movimentacaoR1.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoR1.setConta(conta1);

        Movimentacao movimentacaoS2 = new Movimentacao();
        movimentacaoS2.setData(Calendar.getInstance()); //hoje
        movimentacaoS2.setDescricao("Viagem à SP");
        movimentacaoS2.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoS2.setValor(new BigDecimal("100.0"));
        movimentacaoS2.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoS2.setConta(conta2);

        Movimentacao movimentacaoR2 = new Movimentacao();
        movimentacaoR2.setData(Calendar.getInstance()); //hoje
        movimentacaoR2.setDescricao("Viagem à RJ");
        movimentacaoR2.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoR2.setValor(new BigDecimal("100.0"));
        movimentacaoR2.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoR2.setConta(conta2);

        Movimentacao movimentacaoS3 = new Movimentacao();
        movimentacaoS3.setData(Calendar.getInstance()); //hoje
        movimentacaoS3.setDescricao("Viagem à SP");
        movimentacaoS3.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoS3.setValor(new BigDecimal("100.0"));
        movimentacaoS3.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoS3.setConta(conta3);

        Movimentacao movimentacaoR3 = new Movimentacao();
        movimentacaoR3.setData(Calendar.getInstance()); //hoje
        movimentacaoR3.setDescricao("Viagem à RJ");
        movimentacaoR3.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoR3.setValor(new BigDecimal("100.0"));
        movimentacaoR3.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoR3.setConta(conta3);

        Movimentacao movimentacaoS4 = new Movimentacao();
        movimentacaoS4.setData(Calendar.getInstance()); //hoje
        movimentacaoS4.setDescricao("Viagem à SP");
        movimentacaoS4.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoS4.setValor(new BigDecimal("100.0"));
        movimentacaoS4.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoS4.setConta(conta4);

        Movimentacao movimentacaoR4 = new Movimentacao();
        movimentacaoR4.setData(Calendar.getInstance()); //hoje
        movimentacaoR4.setDescricao("Viagem à RJ");
        movimentacaoR4.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoR4.setValor(new BigDecimal("100.0"));
        movimentacaoR4.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoR4.setConta(conta4);

        Movimentacao movimentacaoS5 = new Movimentacao();
        movimentacaoS5.setData(Calendar.getInstance()); //hoje
        movimentacaoS5.setDescricao("Viagem à SP");
        movimentacaoS5.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoS5.setValor(new BigDecimal("100.0"));
        movimentacaoS5.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoS5.setConta(conta5);

        Movimentacao movimentacaoR5 = new Movimentacao();
        movimentacaoR5.setData(Calendar.getInstance()); //hoje
        movimentacaoR5.setDescricao("Viagem à RJ");
        movimentacaoR5.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoR5.setValor(new BigDecimal("100.0"));
        movimentacaoR5.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoR5.setConta(conta5);

        Movimentacao movimentacaoS6 = new Movimentacao();
        movimentacaoS6.setData(Calendar.getInstance()); //hoje
        movimentacaoS6.setDescricao("Viagem à SP");
        movimentacaoS6.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoS6.setValor(new BigDecimal("100.0"));
        movimentacaoS6.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoS6.setConta(conta6);

        Movimentacao movimentacaoR6 = new Movimentacao();
        movimentacaoR6.setData(Calendar.getInstance()); //hoje
        movimentacaoR6.setDescricao("Viagem à RJ");
        movimentacaoR6.setTipo(TipoMovimentacao.SAIDA);
        movimentacaoR6.setValor(new BigDecimal("100.0"));
        movimentacaoR6.setCategorias(Arrays.asList(categoria1,categoria2));
        movimentacaoR6.setConta(conta6);

        EntityManager em  = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        em.persist(categoria1);
        em.persist(categoria2);

        em.persist(movimentacaoS);
        em.persist(movimentacaoR);

        em.persist(movimentacaoS1);
        em.persist(movimentacaoR1);

        em.persist(movimentacaoS2);
        em.persist(movimentacaoR2);

        em.persist(movimentacaoS3);
        em.persist(movimentacaoR3);

        em.persist(movimentacaoS4);
        em.persist(movimentacaoR4);

        em.persist(movimentacaoS5);
        em.persist(movimentacaoR5);

        em.persist(movimentacaoS6);
        em.persist(movimentacaoR6);

        em.getTransaction().commit();
        em.close();
        JpaUtil.closeEMF();
    }
}
