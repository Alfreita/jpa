package jpa;

import connection.JpaUtil;
import conta.Conta;
import conta.Movimentacao;
import conta.TipoMovimentacao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * O JQPL é feita para abstrair o mundo relacional,permitindo que os desenvolvedores se preocupem apenas com objetos.Por consequencia,não precisamos referenciar a uma chave estrangeira
 * já que é algo qu faz parte do modelo relacional
 */
public class Jpql {
    public static void main (String[] args){

        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        Conta conta = new Conta();
        conta.setId(2);

        String jpql ="select m from Movimentacao m where m.conta = :pConta" + " and m.tipo = :pTipo" + " order by m.valor desc";
        Query query = em.createQuery(jpql);
        query.setParameter("pConta",conta);
        query.setParameter("pTipo", TipoMovimentacao.SAIDA);

        List<Movimentacao> resultados =  query.getResultList();

        for(Movimentacao movimentacao: resultados){
            System.out.println("Descrição; "+movimentacao.getDescricao());
            System.out.println("Conta.id: "+ movimentacao.getConta().getId());
        }
        em.getTransaction().commit();
        em.close();
        JpaUtil.closeEMF();
    }
}
