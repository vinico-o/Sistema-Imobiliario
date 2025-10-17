/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento;

/**
 *
 * @author manoe
 */
public class Dinheiro_CauanIgorVinicius extends Pagamento_CauanIgorVinicius{

    public Dinheiro_CauanIgorVinicius() {}

    public Dinheiro_CauanIgorVinicius(String tipoPagamento) {
        super(tipoPagamento);
    }

    @Override
    public String toString() {
        return getTipoPagamento();
    }
    
    
}
