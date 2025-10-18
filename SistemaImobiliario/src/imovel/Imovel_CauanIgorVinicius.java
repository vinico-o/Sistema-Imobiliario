package imovel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author Vinícius Mardegan
 */
public class Imovel_CauanIgorVinicius implements Serializable {
    protected int codigoImovel;
    protected String endereco;
    protected LocalDate dataConstrucao;
    protected float areaTotal;
    protected float areaConstruida;
    protected int qtdDormitorios;
    protected int qtdBanheiros;
    protected int qtdsVagasGaragem;
    protected float valorIPTU;
    protected float valorVenda;
    protected float valorAluguel;

    //CONSTUTORES
    public Imovel_CauanIgorVinicius() {
        
    }
    
    public Imovel_CauanIgorVinicius(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdsVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        this.codigoImovel = codigoImovel;
        this.endereco = endereco;
        this.dataConstrucao = dataConstrucao;
        this.areaTotal = areaTotal;
        this.areaConstruida = areaConstruida;
        this.qtdDormitorios = qtdDormitorios;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdsVagasGaragem = qtdsVagasGaragem;
        this.valorIPTU = valorIPTU;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
    }
    
    
    //METODOS
    public void imprimir(){
        System.out.println("DADOS DO IMOVEL");
        System.out.println("Código do imóvel: " + codigoImovel);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data de construção: " + dataConstrucao);
        System.out.println("Área total: " + areaTotal + " m²");
        System.out.println("Área construída: " + areaConstruida + " m²");
        System.out.println("Dormitórios: " + qtdDormitorios);
        System.out.println("Banheiros: " + qtdBanheiros);
        System.out.println("Vagas de garagem: " + qtdsVagasGaragem);
        System.out.println("Valor do IPTU: R$ " + valorIPTU);
        System.out.println("Valor de venda: R$ " + valorVenda);
        System.out.println("Valor de aluguel: R$ " + valorAluguel);
    }

    @Override
    public String toString() {
        return "\nCodigo do imovel: " + codigoImovel +
                "\nEndereco: " + endereco +
                "\nData de construcao: " + dataConstrucao +
                "\nArea total: " + areaTotal +
                "\nArea construida: " + areaConstruida +
                "\nQuantidade de dormitorios: " + qtdDormitorios +
                "\nQuantidade de banheiros: " + qtdBanheiros +
                "\nQuantidade de vagas na garagem: " + qtdsVagasGaragem +
                "\nValor do IPTU: " + valorIPTU +
                "\nValor da venda: " + valorVenda +
                "\nValor do aluguel: " + valorAluguel;
    }
    
    //GETTERS E SETTERS
    public int getCodigoImovel() {
        return codigoImovel;
    }

    public void setCodigoImovel(int codigoImovel) {
        this.codigoImovel = codigoImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public int getQtdDormitorios() {
        return qtdDormitorios;
    }

    public void setQtdDormitorios(int qtdDormitorios) {
        this.qtdDormitorios = qtdDormitorios;
    }

    public int getQtdBanheiros() {
        return qtdBanheiros;
    }

    public void setQtdBanheiros(int qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
    }

    public int getQtdsVagasGaragem() {
        return qtdsVagasGaragem;
    }

    public void setQtdsVagasGaragem(int qtdsVagasGaragem) {
        this.qtdsVagasGaragem = qtdsVagasGaragem;
    }

    public float getValorIPTU() {
        return valorIPTU;
    }

    public void setValorIPTU(float valorIPTU) {
        this.valorIPTU = valorIPTU;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    
}
