/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venda;

import imovel.Imovel_CauanIgorVinicius;
import java.time.LocalDate;
import usuario.Cliente_CauanIgorVinicius;
import usuario.Corretor_CauanIgorVinicius;

/**
 *
 * @author manoe
 */
public class Venda_CauanIgorVinicius {
    private int codigoVenda;
    private Cliente_CauanIgorVinicius cliente;
    private Corretor_CauanIgorVinicius corretor;
    private Imovel_CauanIgorVinicius imovel;
    private LocalDate dataVenda;
    private float formaPagamento;
    private Boolean finalizada;

    
    public Venda_CauanIgorVinicius() {}

    public Venda_CauanIgorVinicius(int codigoVenda, Cliente_CauanIgorVinicius cliente, Corretor_CauanIgorVinicius corretor, Imovel_CauanIgorVinicius imovel, LocalDate dataVenda, float formaPagamento, Boolean finalizada) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataVenda = dataVenda;
        this.formaPagamento = formaPagamento;
        this.finalizada = finalizada;
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

    public float getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(float formaPagamento) {
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
        return "Venda{" + "codigoVenda=" + this.codigoVenda + "\n"
                        + "cliente=" + this.cliente + "\n"
                        + "corretor=" + this.corretor + "\n"
                        + "imovel=" + this.imovel + "\n"
                        + "dataVenda=" + this.dataVenda + "\n"
                        + "formaPagamento=" + this.formaPagamento + "\n"
                        + "finalizada=" + this.finalizada + "}";
    }                   
    
}
