/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluguel;

import imovel.Imovel_CauanIgorVinicius;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import pagamento.Pagamento_CauanIgorVinicius;
import seguro.Seguro_CauanIgorVinicius;
import usuario.Cliente_CauanIgorVinicius;
import usuario.Corretor_CauanIgorVinicius;

/**
 *
 * @author manoe
 */
public class Aluguel_CauanIgorVinicius implements Serializable{
    private int codigoAluguel;
    private Cliente_CauanIgorVinicius cliente;
    private Corretor_CauanIgorVinicius corretor;
    private Imovel_CauanIgorVinicius imovel;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;
    private LocalDate dataPagamentoMensal;
    private float valorTotalAluguel;
    private Pagamento_CauanIgorVinicius formaPagamento;
    private ArrayList<Seguro_CauanIgorVinicius> segurosContratados = new ArrayList<>();
    private Boolean finalizado;
    private Boolean pago;


    
    public Aluguel_CauanIgorVinicius(){}

    public Aluguel_CauanIgorVinicius(int codigoAluguel, Cliente_CauanIgorVinicius cliente, Corretor_CauanIgorVinicius corretor, Imovel_CauanIgorVinicius imovel, LocalDate dataAluguel, LocalDate dataDevolucao, LocalDate dataPagamentoMensal, Pagamento_CauanIgorVinicius formaPagamento, ArrayList<Seguro_CauanIgorVinicius> segurosContratados, Boolean finalizado, Boolean pago) {
        this.codigoAluguel = codigoAluguel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.dataPagamentoMensal = dataPagamentoMensal;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = segurosContratados;
        this.finalizado = finalizado;
        this.pago = pago;
        this.valorTotalAluguel = this.calcularValorTotal();
    }

    
    public int getCodigoAluguel() {
        return codigoAluguel;
    }

    public void setCodigoAluguel(int codigoAluguel) {
        this.codigoAluguel = codigoAluguel;
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

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataPagamentoMensal() {
        return dataPagamentoMensal;
    }

    public void setDataPagamentoMensal(LocalDate dataPagamentoMensal) {
        this.dataPagamentoMensal = dataPagamentoMensal;
    }

    public float getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(float valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }

    public Pagamento_CauanIgorVinicius getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento_CauanIgorVinicius formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<Seguro_CauanIgorVinicius> getSegurosContratados() {
        return segurosContratados;
    }

    public void setSegurosContratados(ArrayList<Seguro_CauanIgorVinicius> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }
    
    //Valores incluidos: valor aluguel(de imovel) e os valores de cada seguro
    public float calcularValorTotal()
    {
        float custoTotal=0;
        custoTotal+=imovel.getValorAluguel();
        for(Seguro_CauanIgorVinicius s: segurosContratados)
        {
            custoTotal+=s.getValor();
        }
        return custoTotal;
    }
    
    public Boolean possuiSeguro()
    {
       if(segurosContratados.isEmpty())
       {
           return false;
       }
       else
       {
           return true;
       }
    }
    
    public Boolean verificarAtraso()
    {
       if(this.pago == false)
       {
          if(LocalDate.now().isAfter(dataPagamentoMensal))
          {
              return true;
          }
          else 
          {
              return false;
          }
       }
       return false;
    }
    
    public String toString()
    {
       return "\nCodigo do aluguel: " + this.codigoAluguel + "\n"
                        + "Cliente: " + this.cliente + "\n"
                        + "Corretor: " + this.corretor + "\n"    
                        + "Imovel: " + this.imovel + "\n"
                        + "Data do aluguel: " + this.dataAluguel + "\n"
                        + "Data de devolucao: " + this.dataDevolucao + "\n"
                        + "Data de pagamento mensal: " + this.dataPagamentoMensal + "\n"
                        + "Valor total do aluguel: " + this.valorTotalAluguel + "\n"
                        + "Forma de pagamento: " + this.formaPagamento + "\n"
                        + "Seguros contratados:" + this.segurosContratados + "\n"
                        + "Esta finalizado? " + this.finalizado + "\n"
                        + "Esta pago?" + this.pago + "\n";        
    }
    
 
    public String listagemSimples()
    {
        return "\nCodigo do aluguel: " + this.codigoAluguel + "\n"
                        + "Cliente: " + this.cliente.getNome() + "\n"
                        + "Corretor: " + this.corretor.getNome() + "\n"    
                        + "Imovel: " + this.imovel.listagemSimples() + "\n";
    }
}
