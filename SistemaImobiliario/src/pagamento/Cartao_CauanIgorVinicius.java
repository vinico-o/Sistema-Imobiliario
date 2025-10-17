/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento;

/**
 *
 * @author manoe
 */
public class Cartao_CauanIgorVinicius extends Pagamento_CauanIgorVinicius{
    private String nome,bandeira,numero;

    public Cartao_CauanIgorVinicius() {}

    public Cartao_CauanIgorVinicius(String nome, String bandeira, String numero, String tipoPagamento) {
        super(tipoPagamento);
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString()
    {
        return getTipoPagamento();
    }
    
    
}
