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
public class PredioResidencial_CauanIgorVinicius extends Imovel_CauanIgorVinicius {
    protected int andar;
    protected float valorCondominio;
    
    //CONTRUTORES
    public PredioResidencial_CauanIgorVinicius() {
        
    }
    
    public PredioResidencial_CauanIgorVinicius(int andar, float valorCondominio, int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdsVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel, String tipo) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdsVagasGaragem, valorIPTU, valorVenda, valorAluguel, tipo);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }
    
    
    //METODOS
    
    @Override
    public float getValorAluguel() {
        return super.getValorAluguel() + this.valorCondominio;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nAndar: " + andar +
                "\nValor do condominio: " + valorCondominio;
    }
    
    //GETTERS E SETTERS
    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(float valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
    

}
