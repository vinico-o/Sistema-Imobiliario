package imovel;


import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vinícius Mardegan
 */
public class Comercial extends Imovel {
    protected float taxaImpostoFederal;
    
    //CONSTRUTORES
    public Comercial() {
        
    }
    
    public Comercial(float taxaImpostoFederal, int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdsVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdsVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
    //METODOS
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Taxa de Imposto Federal: " + taxaImpostoFederal);
    }
    
    @Override
    public float getValorAluguel() {
        return super.getValorAluguel() + super.getValorAluguel() * taxaImpostoFederal;
    }
    
    //GETTERS E SETTERS
    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
}
