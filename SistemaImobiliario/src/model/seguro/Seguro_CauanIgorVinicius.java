/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguro;

import java.io.Serializable;

/**
 *
 * @author Vinícius Mardegan
 */
public class Seguro_CauanIgorVinicius implements Serializable{
    private int codigoSEguro;
    private String nomeSeguradora;
    private String tipo;
    private String descricao;
    private float valor;
    
    //CONSTRUTORES
    public Seguro_CauanIgorVinicius() {
        
    }

    public Seguro_CauanIgorVinicius(int codigoSEguro, String nomeSeguradora, String tipo, String descricao, float valor) {
        this.codigoSEguro = codigoSEguro;
        this.nomeSeguradora = nomeSeguradora;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    //METODOS
    public void imprimir() {
        System.out.println("DADOS DO SEGURO");
        System.out.println("Código do Seguro: " + codigoSEguro);
        System.out.println("Nome da Seguradora: " + nomeSeguradora);
        System.out.println("Tipo: " + tipo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$ " + valor);
    }

    @Override
    public String toString()
    {
        return "Codigo do seguro: " + codigoSEguro
                + "\nNome da seguradora: " + nomeSeguradora 
                + "\nTipo do seguro: " + tipo
                + "\nDescricao do seguro: " + descricao
                + "\nValor do seguro: " + valor;
    }
    
    //GETTERS E SETTERS
    public int getCodigoSEguro() {
        return codigoSEguro;
    }

    public void setCodigoSEguro(int codigoSEguro) {
        this.codigoSEguro = codigoSEguro;
    }

    public String getNomeSeguradora() {
        return nomeSeguradora;
    }

    public void setNomeSeguradora(String nomeSeguradora) {
        this.nomeSeguradora = nomeSeguradora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
