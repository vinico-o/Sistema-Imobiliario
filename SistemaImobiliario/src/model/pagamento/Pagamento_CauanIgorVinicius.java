/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento;

import java.io.Serializable;

/**
 *
 * @author manoe
 */
public abstract class Pagamento_CauanIgorVinicius implements Serializable{
    private String tipoPagamento;

    public Pagamento_CauanIgorVinicius() {}

    public Pagamento_CauanIgorVinicius(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    
    
    @Override
    public abstract String toString();
}
