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
public class CasaResidencial_CauanIgorVinicius extends Imovel_CauanIgorVinicius {
    //CONSTRUTORES
    public CasaResidencial_CauanIgorVinicius() {
        
    }
    
    public CasaResidencial_CauanIgorVinicius(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdsVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel, String tipo) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdsVagasGaragem, valorIPTU, valorVenda, valorAluguel, tipo);
    }
}
