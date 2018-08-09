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
        conta1.setAgencia("1234");
        conta1.setBanco("Itau");
        conta1.setNumero("1234");
        conta1.setTitular("heloisa");

        Conta conta2  = new Conta();
        conta2.setAgencia("1234");
        conta2.setBanco("Itau");
        conta2.setNumero("1234");
        conta2.setTitular("claudio");

        Conta conta3  = new Conta();
        conta3.setAgencia("1234");
        conta3.setBanco("Itau");
        conta3.setNumero("1234");
        conta3.setTitular("roberto");

        Conta conta4  = new Conta();
        conta4.setAgencia("1234");
        conta4.setBanco("Itau");
        conta4.setNumero("1234");
        conta4.setTitular("pedro");

        Conta conta5  = new Conta();
        conta5.setAgencia("1234");
        conta5.setBanco("Itau");
        conta5.setNumero("1234");
        conta5.setTitular("paulo");

        Conta conta6  = new Conta();
        conta6.setAgencia("1234");
        conta6.setBanco("Itau");
        conta6.setNumero("1234");
        conta6.setTitular("lucas");

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
