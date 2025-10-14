package imobiliaria;

import aluguel.Aluguel_CauanIgorVinicius;
import configuracao.Configuracao_CauanIgorVinicius;
import imovel.Imovel_CauanIgorVinicius;
import java.util.ArrayList;
import seguro.Seguro_CauanIgorVinicius;
import usuario.Cliente_CauanIgorVinicius;
import usuario.Corretor_CauanIgorVinicius;
import venda.Venda_CauanIgorVinicius;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauan
 */
public class Imobiliaria_CauanIgorVinicius {
    
    // Métodos: add (aluguel, venda, imovel, ...)
    
    private String nome;
    private String endereco;
    private ArrayList<Aluguel_CauanIgorVinicius> alugueis;
    private ArrayList<Venda_CauanIgorVinicius> vendas;
    private ArrayList<Imovel_CauanIgorVinicius> imoveis;
    private ArrayList<Cliente_CauanIgorVinicius> clientes;
    private ArrayList<Corretor_CauanIgorVinicius> corretores;
    private ArrayList<Seguro_CauanIgorVinicius> seguros;
    private Configuracao_CauanIgorVinicius configuracoes;

    public Imobiliaria_CauanIgorVinicius() {
        this.nome = "imobiliaria";
        this.endereco = "endereço";
        this.configuracoes = new Configuracao_CauanIgorVinicius();
        this.alugueis = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/alugueis.txt");
        this.vendas = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/vendas.txt");
        this.imoveis = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/imoveis.txt");
        this.clientes = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/clientes.txt");
        this.corretores = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/corretores.txt");
        this.seguros = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/seguros.txt");
    }

    public Imobiliaria_CauanIgorVinicius(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.configuracoes = new Configuracao_CauanIgorVinicius();
        this.alugueis = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/alugueis.txt");
        this.vendas = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/vendas.txt");
        this.imoveis = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/imoveis.txt");
        this.clientes = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/clientes.txt");
        this.corretores = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/corretores.txt");
        this.seguros = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/seguros.txt");
    }
    
    public void addAluguel(Aluguel_CauanIgorVinicius aluguel)
    {
        alugueis.add(aluguel);
    }
    
    public void addAVenda(Venda_CauanIgorVinicius venda)
    {
        vendas.add(venda);
    }
    
    public void addImovel(Imovel_CauanIgorVinicius imovel)
    {
        imoveis.add(imovel);
    }

    public void addCliente(Cliente_CauanIgorVinicius cliente)
    {
        clientes.add(cliente);
    }

    public void addCorretor(Corretor_CauanIgorVinicius corretor)
    {
        corretores.add(corretor);
    }

    public void addSeguro(Seguro_CauanIgorVinicius seguro)
    {
        seguros.add(seguro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Aluguel_CauanIgorVinicius> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(ArrayList<Aluguel_CauanIgorVinicius> alugueis) {
        this.alugueis = alugueis;
    }

    public ArrayList<Venda_CauanIgorVinicius> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda_CauanIgorVinicius> vendas) {
        this.vendas = vendas;
    }

    public ArrayList<Imovel_CauanIgorVinicius> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel_CauanIgorVinicius> imoveis) {
        this.imoveis = imoveis;
    }

    public ArrayList<Cliente_CauanIgorVinicius> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente_CauanIgorVinicius> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Corretor_CauanIgorVinicius> getCorretores() {
        return corretores;
    }

    public void setCorretores(ArrayList<Corretor_CauanIgorVinicius> corretores) {
        this.corretores = corretores;
    }

    public ArrayList<Seguro_CauanIgorVinicius> getSeguros() {
        return seguros;
    }

    public void setSeguros(ArrayList<Seguro_CauanIgorVinicius> seguros) {
        this.seguros = seguros;
    }

    public Configuracao_CauanIgorVinicius getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Configuracao_CauanIgorVinicius configuracoes) {
        this.configuracoes = configuracoes;
    }
    
    public void salvarObjetos()
    {
        Configuracao_CauanIgorVinicius.salvarObjetos(alugueis, "arquivos/alugueis.txt");
        Configuracao_CauanIgorVinicius.salvarObjetos(vendas, "arquivos/vendas.txt");
        Configuracao_CauanIgorVinicius.salvarObjetos(imoveis, "arquivos/imoveis.txt");
        Configuracao_CauanIgorVinicius.salvarObjetos(clientes, "arquivos/clientes.txt");
        Configuracao_CauanIgorVinicius.salvarObjetos(corretores, "arquivos/corretores.txt");
        Configuracao_CauanIgorVinicius.salvarObjetos(seguros, "arquivos/seguros.txt");
    }
 
    
}
