package jpa;

import connection.JpaUtil;
import conta.Cliente;
import conta.Conta;

import javax.persistence.EntityManager;

public class CriaContaCliente {

    public static void main (String[] args){

        Cliente cliente = new Cliente();
        cliente.setNome("Victor");
        cliente.setEndereco("Rua Fulano, 123");
        cliente.setProfissao("Professor");

        Conta conta = new Conta();
        conta.setId(2);
        cliente.setConta(conta);

        EntityManager em = new JpaUtil().getEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
        JpaUtil.closeEMF();

    }
}
