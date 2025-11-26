/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venda;

import imovel.Imovel_CauanIgorVinicius;
import pagamento.Pagamento_CauanIgorVinicius;

import java.io.Serializable;
import java.time.LocalDate;
import usuario.Cliente_CauanIgorVinicius;
import usuario.Corretor_CauanIgorVinicius;

/**
 *
 * @author manoe
 */
public class Venda_CauanIgorVinicius implements Serializable{
    private int codigoVenda;
    private Cliente_CauanIgorVinicius cliente;
    private Corretor_CauanIgorVinicius corretor;
    private Imovel_CauanIgorVinicius imovel;
    private LocalDate dataVenda;
    private float valorTotalVenda;
    private Pagamento_CauanIgorVinicius formaPagamento;
    private Boolean finalizada;

    
    public Venda_CauanIgorVinicius() {}

    public Venda_CauanIgorVinicius(int codigoVenda, Cliente_CauanIgorVinicius cliente, Corretor_CauanIgorVinicius corretor, Imovel_CauanIgorVinicius imovel, LocalDate dataVenda, float valorTotalVenda, Pagamento_CauanIgorVinicius formaPagamento, Boolean finalizada) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.valorTotalVenda = valorTotalVenda;
        this.dataVenda = dataVenda;
        this.formaPagamento = formaPagamento;
        this.finalizada = finalizada;
    }

    public float getValorTotalVenda(){
        return valorTotalVenda;
    }

    public void setValorTotalVenda(float valorTotalVenda){
        this.valorTotalVenda = valorTotalVenda;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Cliente_CauanIgorVinicius getCliente() {
        return cliente;
    }

    public void setCliente(Cliente_CauanIgorVinicius cliente) {
        this.cliente = cliente;
    }

    public Corretor_CauanIgorVinicius getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor_CauanIgorVinicius corretor) {
        this.corretor = corretor;
    }

    public Imovel_CauanIgorVinicius getImovel() {
        return imovel;
    }

    public void setImovel(Imovel_CauanIgorVinicius imovel) {
        this.imovel = imovel;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Pagamento_CauanIgorVinicius getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento_CauanIgorVinicius formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    @Override
    public String toString()
    {
        return "Codigo da venda: " + this.codigoVenda + "\n"
                        + "Cliente: " + this.cliente + "\n"
                        + "Corretor: " + this.corretor + "\n"
                        + "Imovel: " + this.imovel + "\n"
                        + "Data da venda: " + this.dataVenda + "\n"
                        + "Forma de pagamento: " + this.formaPagamento + "\n"
                        + "Esta finalizada? " + this.finalizada ;
    }                   
    
    public String listagemSimples()
    {
        return "Codigo da venda: " + this.codigoVenda + "\n"
                        + "Cliente: " + this.cliente.getNome() + "\n"
                        + "Corretor: " + this.corretor.getNome() + "\n"
                        + "Imovel: " + this.imovel.listagemSimples() + "\n";
    }
}
