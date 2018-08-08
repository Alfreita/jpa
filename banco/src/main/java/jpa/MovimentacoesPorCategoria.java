package jpa;

import connection.JpaUtil;
import conta.Categoria;
import conta.Movimentacao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class MovimentacoesPorCategoria {
    public static void main(String[] args){
        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();

        Categoria categoria = new Categoria();
        categoria.setId(1);

        String jpql ="select m from Movimentacao m join m.categoria c where c = :pCategoria";

        Query query = em.createQuery(jpql);
        query.setParameter("pCategoria",categoria);

        List<Movimentacao> resultados = query.getResultList();

        for(Movimentacao movimentacao: resultados){
            System.out.println("Descrição: "+ movimentacao.getDescricao());
            System.out.println("Conta.id: "+ movimentacao.getConta().getId());
        }
        em.close();
        JpaUtil.closeEMF();

    }
}
