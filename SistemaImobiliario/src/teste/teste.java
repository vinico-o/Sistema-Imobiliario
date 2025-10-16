package teste;

import imobiliaria.Imobiliaria_CauanIgorVinicius;
import imovel.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class teste {
    
    public static void main(String[] args) {
        
        Imobiliaria_CauanIgorVinicius imobiliaria = new Imobiliaria_CauanIgorVinicius();


        if (imobiliaria.getAlugueis() == null) 
        {
            imobiliaria.setAlugueis(new ArrayList<>());
        }

        if (imobiliaria.getVendas() == null) 
        {
            imobiliaria.setVendas(new ArrayList<>());
        }

        if (imobiliaria.getImoveis() == null) 
        {
            imobiliaria.setImoveis(new ArrayList<>());
        }
        
        if (imobiliaria.getClientes() == null) 
        {
            imobiliaria.setClientes(new ArrayList<>());
        }
        
        if (imobiliaria.getCorretores() == null)
        {
            imobiliaria.setCorretores(new ArrayList<>());
        }
        
        if (imobiliaria.getSeguros() == null) 
        {
            imobiliaria.setSeguros(new ArrayList<>());
        }

        Imovel_CauanIgorVinicius casa = new Imovel_CauanIgorVinicius(
            101,                                           // código do imóvel
            "Rua das Flores, 123 - Centro",               // endereço
            LocalDate.of(2010, 5, 12),                    // data de construção
            250.0f,                                      // área total (m²)
            180.0f,                                      // área construída (m²)
            3,                                           // dormitórios
            2,                                           // banheiros
            2,                                           // vagas de garagem
            1200.50f,                                    // valor IPTU
            450000.00f,                                  // valor de venda
            2500.00f                                    // valor de aluguel
        );

        // 🏢 Imóvel 2 — Apartamento
        Imovel_CauanIgorVinicius apartamento = new Imovel_CauanIgorVinicius(
            202,                                           // código do imóvel
            "Av. Paulista, 1000 - São Paulo, SP",         // endereço
            LocalDate.of(2018, 9, 1),                     // data de construção
            90.0f,                                       // área total (m²)
            90.0f,                                       // área construída (m²)
            2,                                           // dormitórios
            2,                                           // banheiros
            1,                                           // vagas de garagem
            2500.00f,                                    // valor IPTU
            750000.00f,                                  // valor de venda
            3500.00f                                    // valor de aluguel
        );

        imobiliaria.addImovel(casa);
        imobiliaria.addImovel(apartamento);

        for(Imovel_CauanIgorVinicius c : imobiliaria.getImoveis()){
            System.out.println("" + c.toString());
        }

        imobiliaria.salvarObjetos();
    }


}
