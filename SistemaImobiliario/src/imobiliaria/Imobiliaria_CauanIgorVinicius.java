package imobiliaria;

import aluguel.Aluguel_CauanIgorVinicius;
import configuracao.Configuracao_CauanIgorVinicius;
import imovel.CasaResidencial_CauanIgorVinicius;
import imovel.Comercial_CauanIgorVinicius;
import imovel.Imovel_CauanIgorVinicius;
import imovel.PredioResidencial_CauanIgorVinicius;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
        this.alugueis = new ArrayList<>();
        this.vendas = new ArrayList<>();
        this.alugueis = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.corretores = new ArrayList<>();
        this.seguros = new ArrayList<>();

        this.alugueis = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/alugueis.dat");
        this.vendas = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/vendas.dat");
        this.imoveis = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/imoveis.dat");
        this.clientes = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/clientes.dat");
        this.corretores = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/corretores.dat");
        this.seguros = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/seguros.dat");
    }

    public Imobiliaria_CauanIgorVinicius(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.configuracoes = new Configuracao_CauanIgorVinicius();
        this.alugueis = new ArrayList<>();
        this.vendas = new ArrayList<>();
        this.alugueis = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.corretores = new ArrayList<>();
        this.seguros = new ArrayList<>();

        this.alugueis = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/alugueis.dat");
        this.vendas = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/vendas.dat");
        this.imoveis = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/imoveis.dat");
        this.clientes = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/clientes.dat");
        this.corretores = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/corretores.dat");
        this.seguros = Configuracao_CauanIgorVinicius.lerObjetos("arquivos/seguros.dat");
    }
    
    public void addAluguel(Aluguel_CauanIgorVinicius aluguel)
    {
        if (aluguel != null)
        {
            alugueis.add(aluguel);
        }
    }
    
    public void addAVenda(Venda_CauanIgorVinicius venda)
    {
        if (venda != null)
        {
            vendas.add(venda);
        }
    }
    
    public void addImovel(Imovel_CauanIgorVinicius imovel)
    {
        if (imovel != null)
        {
            imoveis.add(imovel);
        }
    }

    public void addCliente(Cliente_CauanIgorVinicius cliente)
    {
        if (cliente != null)
        {
            clientes.add(cliente);
        }
    }

    public void addCorretor(Corretor_CauanIgorVinicius corretor)
    {
        if (corretor != null)
        {
            corretores.add(corretor);
        }
    }

    public void addSeguro(Seguro_CauanIgorVinicius seguro)
    {
        if (seguro != null)
        {
            seguros.add(seguro);
        }
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
        Configuracao_CauanIgorVinicius.salvarObjetos(alugueis, "arquivos/alugueis.dat");
        Configuracao_CauanIgorVinicius.salvarObjetos(vendas, "arquivos/vendas.dat");
        Configuracao_CauanIgorVinicius.salvarObjetos(imoveis, "arquivos/imoveis.dat");
        Configuracao_CauanIgorVinicius.salvarObjetos(clientes, "arquivos/clientes.dat");
        Configuracao_CauanIgorVinicius.salvarObjetos(corretores, "arquivos/corretores.dat");
        Configuracao_CauanIgorVinicius.salvarObjetos(seguros, "arquivos/seguros.dat");
    }
 
    public void listarTodosImoveis()
    {
        System.out.println("\nTODOS OS IMOVEIS");
        for (Imovel_CauanIgorVinicius i: imoveis)
        {
            System.out.println("\n" + i.toString());
        }

        System.out.println("");
    }

    public void listarCasaResidencial()
    {
        System.out.println("\nTODAS AS CASAS RESIDENCIAIS");
        for(Imovel_CauanIgorVinicius cr: imoveis)
        {
            if (cr instanceof CasaResidencial_CauanIgorVinicius)
            {
                System.out.println("" + cr.listagemSimples());
            }
        }

        System.out.println("\n");
    }

    public void listarPredio()
    {
        System.out.println("\nLISTANDO PREDIOS");
        for (Imovel_CauanIgorVinicius pr: imoveis)
        {
            if (pr instanceof PredioResidencial_CauanIgorVinicius)
            {
                System.out.println("" + pr.listagemSimples());
            }
        }

        System.out.println("\n");
    }

    public void listarImovelComercial()
    {
        System.out.println("\nLISTANDO IMOVEIS COMERCIAIS");
        for (Imovel_CauanIgorVinicius cm: imoveis)
        {
            if (cm instanceof Comercial_CauanIgorVinicius)
            {
                System.out.println("" + cm.listagemSimples());
            }
        }

        System.out.println("\n");
    }

    public void listarImoveisParaLocacao()
    {
        System.out.println("\nLISTANDO IMOVEIS DISPONIVEIS PARA ALOCACAO");
        for (Imovel_CauanIgorVinicius i: imoveis)
        {
            if (i.getIsDisponivel() == true && i.getTipo().equals("aluguel"))
            {
                System.out.println("" + i.toString());
            }
        }

        System.out.println("\n");
    }

    public void listarImoveisAlugados()
    {
        System.out.println("\nLISTANDO IMOVEIS ALUGADOS");
        for (Aluguel_CauanIgorVinicius al: alugueis)
        {
            System.out.println("" + al.getImovel().toString());
            
        }

        System.out.println("\n");
    }

    public void listarClientesComAluguelAtrasado()
    {
        System.out.println("\nLISTANDO CLIENTES COM ALUGUEL ATRASADO");
        
        for (Aluguel_CauanIgorVinicius al: alugueis)
        {
            if (!al.getPago() && al.getDataPagamentoMensal().getDayOfMonth() < LocalDate.now().getDayOfMonth())
            {
                System.out.println("" + al.getCliente().toString());
            }
        }   
        
        System.out.println("\n");
    }

    public void listarAlugueisFinalizadosDevolvidos()
    {
        System.out.println("\nLISTANDO ALUGUEIS FINALIZADOS E DEVOLVIDOS");

        for (Aluguel_CauanIgorVinicius al: alugueis)
        {
            if (al.getFinalizado() && al.getDataDevolucao().isBefore(LocalDate.now()))
            {
                System.out.println("" + al.toString());
            }
        }

        System.out.println("\n");
    }

    public void listarAlugueisDentroDoPrazoLocacao()
    {
        System.out.println("\nLISTANDO ALUGUEIS DENTRO DO PRAZO DE LOCACAO");

        for (Aluguel_CauanIgorVinicius al: alugueis)
        {
            if(al.getDataAluguel().isAfter(LocalDateTime.now().toLocalDate()))
            {
                System.out.println("" + al.toString());
            }
        }

        System.out.println("\n");
    }

    public void listarVendasRealizadas()
    {
        System.out.println("\nLISTANDO VENDAS REALIZADAS");

        for (Venda_CauanIgorVinicius v: vendas)
        {
            if (v.getFinalizada() == true)
            {
                System.out.println("" + v.listagemSimples());
            }
        }

        System.out.println("\n");
    }

    public void listarVendasDoMesX(int mes)
    {
        System.out.println("\nLISTANDO VENDAS DO MES " + mes);
        int soma = 0;
        for (Venda_CauanIgorVinicius v: vendas)
        {
            if (v.getDataVenda().getMonth().getValue() == mes)
            {
                soma += v.getValorTotalVenda();
            }
        }

        if (soma > 0)
        {
            System.out.println("Lucro gerado no mes: " + soma);
        }

        System.out.println("\n");
    }

    public void listarSeguros()
    {
        System.out.println("\nLISTANDO SEGUROS");

        for (Seguro_CauanIgorVinicius s: seguros)
        {
            System.out.println("" + s.toString());
        }

        System.out.println("\n");
    }
    
    public void listarImoveisDisponiveisVenda ()
    {
        System.out.println("\nIMOVEIS DISPONIVEIS PARA VENDA");
        
        for(Imovel_CauanIgorVinicius i: imoveis)
        {
            if(i.getIsDisponivel() == true && i.getTipo().equals("venda"))
            {
                System.out.println("" + i.toString());
            }
        }

        System.out.println("\n");
    }
    
    public void listarImoveisVendidos () {
        
        System.out.println("\nIMOVEIS VENDIDOS");
        
        for(Venda_CauanIgorVinicius i: vendas){
            if(i.getFinalizada()){
                System.out.println("" + i.listagemSimples());
            }
        }

        System.out.println("\n");
    }
    
    public void listarImoveisAtrasoAluguel() {
        System.out.println("\nIMOVEIS COM ATRASO NO PAGAMENTO DO ALUGUEL\n");
        for(Aluguel_CauanIgorVinicius i: alugueis) {
            if(!(i.getPago())){
                System.out.println("" + i.listagemSimples());

                System.out.println("\n");
            }
        }

        System.out.println("\n");
    }
    
    public void listarImoveisAlugadosPorCliente(String c){
        System.out.println("\nIMOVEIS ALUGADOS PELO CLIENTE " + c);
        for(Aluguel_CauanIgorVinicius i: alugueis) {
            if(i.getCliente().getNome().equals(c)){
                System.out.println("" + i.listagemSimples());
            }
        }

        System.out.println("\n");
    }
    
    public void listarImoveisCompradosPorCliente(String c){
        System.out.println("\nIMOVEIS COMPRADOS PELO CLIENTE " + c);
        for(Venda_CauanIgorVinicius i: vendas) {
            if(i.getCliente().getNome().equals(c)){
                System.out.println("" + i.listagemSimples());
            }
        }

        System.out.println("\n");
    }
    
    public void listarCorretoresRegistrados(){
        System.out.println("\nCORRETORES CADASTRADOS");

        for(Corretor_CauanIgorVinicius i: corretores){
            System.out.println("" + i.listagemSimples());
        }

        System.out.println("\n");
    }
    
    public void listarClientesRegistrados(){
        System.out.println("\nCLIENTES CADASTRADOS");
        for(Cliente_CauanIgorVinicius i: clientes){
            System.out.println("" + i.listagemSimples());
        }

        System.out.println("\n");
    }

    public void listarImoveis()
    {
        System.out.println("\nIMOVEIS DISPONVEIS");

        for (Imovel_CauanIgorVinicius i: imoveis)
        {
            if (i.getIsDisponivel() == true)
            {
                System.out.println(""+ i.listagemSimples());
            }
        }

        System.out.println("\n");
    }
    
}
