package conta;

import javax.persistence.*;


/** @Entity mostra que esta classe está relacionada a uma tabela no banco*/
@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titular;
    private String banco;
    private String agencia;
    private String numero;

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public String getBanco() {
        return banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
