package conta;

import javax.persistence.*;
import java.util.BitSet;
import java.util.List;


/** @Entity mostra que esta classe está relacionada a uma tabela no banco*/
@Entity
@Table(name="conta")
public class Conta{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) /** cria um auto incremento*/
    private int id;
    @Column
    private String titular;
    @Column
    private String banco;
    @Column
    private String agencia;
    @Column
    private String numero;
    @OneToMany(mappedBy = "conta")
    private List<Movimentacao> movimentacoes;

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

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
