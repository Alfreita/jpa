package popula;

import connection.JpaUtil;
import conta.Conta;

import javax.persistence.EntityManager;

public class PopulaConta {
    public static void main(String[] args){
        Conta conta  = new Conta();
        conta.setAgencia("1234");
        conta.setBanco("Itau");
        conta.setNumero("1234");
        conta.setTitular("victor");

        Conta conta1  = new Conta();
        conta.setAgencia("1234");
        conta.setBanco("Itau");
        conta.setNumero("1234");
        conta.setTitular("heloisa");

        Conta conta2  = new Conta();
        conta.setAgencia("1234");
        conta.setBanco("Itau");
        conta.setNumero("1234");
        conta.setTitular("claudio");

        Conta conta3  = new Conta();
        conta.setAgencia("1234");
        conta.setBanco("Itau");
        conta.setNumero("1234");
        conta.setTitular("roberto");

        Conta conta4  = new Conta();
        conta.setAgencia("1234");
        conta.setBanco("Itau");
        conta.setNumero("1234");
        conta.setTitular("pedro");

        Conta conta5  = new Conta();
        conta.setAgencia("1234");
        conta.setBanco("Itau");
        conta.setNumero("1234");
        conta.setTitular("paulo");

        Conta conta6  = new Conta();
        conta.setAgencia("1234");
        conta.setBanco("Itau");
        conta.setNumero("1234");
        conta.setTitular("lucas");

        EntityManager em = new JpaUtil().getEntityManager();

        em.getTransaction().begin();
        em.persist(conta);
        em.persist(conta1);
        em.persist(conta2);
        em.persist(conta3);
        em.persist(conta4);
        em.persist(conta5);
        em.persist(conta6);

        em.getTransaction().commit();

        em.close();
        JpaUtil.closeEMF();

    }
}
