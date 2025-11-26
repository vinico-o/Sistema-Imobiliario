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
public class Comercial_CauanIgorVinicius extends Imovel_CauanIgorVinicius {
    protected float taxaImpostoFederal;
    
    //CONSTRUTORES
    public Comercial_CauanIgorVinicius() {
        
    }
    
    public Comercial_CauanIgorVinicius(float taxaImpostoFederal, int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdsVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel, String tipo) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdsVagasGaragem, valorIPTU, valorVenda, valorAluguel, tipo);
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
    //METODOS
    
    @Override
    public float getValorAluguel() {
        return super.getValorAluguel() + super.getValorAluguel() * taxaImpostoFederal;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nTaxa de imposto federal: " + taxaImpostoFederal;
    }
    
    //GETTERS E SETTERS
    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
}
