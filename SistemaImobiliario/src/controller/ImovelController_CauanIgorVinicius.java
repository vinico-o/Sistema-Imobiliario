package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


import imovel.*;
;

public class ImovelController_CauanIgorVinicius {
    
    public static CasaResidencial_CauanIgorVinicius cadastrarCasaResidencial() {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Codigo do imovel: ");
        int codigoImovel = sc.nextInt();

        System.out.print("Tipo do imovel (0 - aluguel | 1 - venda): ");
        int tipo = sc.nextInt();

        sc.nextLine();
        System.out.print("Endereco: ");
        String endereco = sc.nextLine();

        System.out.print("Data de construcao (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();
        LocalDate dataConstrucao = LocalDate.parse(dataStr, formatter);

        System.out.println("Casa pequena (0) ou grande (1): ");
        int tamanho = sc.nextInt();

        String tipoStr;
        if (tipo == 0)
        {
            tipoStr = "aluguel";
        }
        else
        {
            tipoStr = "venda";
        }
        CasaResidencial_CauanIgorVinicius casa;

        if (tamanho == 0){
            casa = BuilderImovel_CauanIgorVinicius.casaPequena();
        }
        else {
            casa = BuilderImovel_CauanIgorVinicius.casaGrande();
        }

        casa.setCodigoImovel(codigoImovel);
        casa.setTipo(tipoStr);
        casa.setEndereco(endereco);
        casa.setDataConstrucao(dataConstrucao);


        return casa;

    }

    public static Comercial_CauanIgorVinicius cadastrarImovelComercial() {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Codigo do imovel: ");
        int codigoImovel = sc.nextInt();

        System.out.println("Tipo do imovel (0 - aluguel | 1 - venda): ");
        int tipo = sc.nextInt();

        sc.nextLine();

        System.out.print("Endereco: ");
        String endereco = sc.nextLine();

        System.out.print("Data de construcao (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();
        LocalDate dataConstrucao = LocalDate.parse(dataStr, formatter);

        System.out.println("Comercio pequena (0) ou grande (1): ");
        int tamanho = sc.nextInt();


        String tipoStr;
        if (tipo == 0)
        {
            tipoStr = "aluguel";
        }
        else
        {
            tipoStr = "venda";
        }

        Comercial_CauanIgorVinicius imovelComercial;

        if (tamanho == 0){
            imovelComercial = BuilderImovel_CauanIgorVinicius.comercioPequeno();
        }
        else {
            imovelComercial = BuilderImovel_CauanIgorVinicius.comercioGrande();
        }
        
        imovelComercial.setCodigoImovel(codigoImovel);
        imovelComercial.setEndereco(endereco);
        imovelComercial.setDataConstrucao(dataConstrucao);
        imovelComercial.setTipo(tipoStr);

        return imovelComercial;
    }

    public static PredioResidencial_CauanIgorVinicius cadastrarPredioResidencial() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Codigo do imovel: ");
        int codigoImovel = sc.nextInt();

        System.out.print("Tipo do imovel (0 - aluguel | 1 - venda): ");
        int tipo = sc.nextInt();

        sc.nextLine();

        System.out.print("Endereco: ");
        String endereco = sc.nextLine();

        System.out.print("Data de construcao (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();
        LocalDate dataConstrucao = LocalDate.parse(dataStr, formatter);

        System.out.print("Andar do apartamento: ");
        int andar = sc.nextInt();

        System.out.println("Predio pequena (0) ou grande (1): ");
        int tamanho = sc.nextInt();

        String tipoStr;
        if (tipo == 0)
        {
            tipoStr = "aluguel";
        }
        else
        {
            tipoStr = "venda";
        }

        PredioResidencial_CauanIgorVinicius predio;

        if (tamanho == 0){
            predio = BuilderImovel_CauanIgorVinicius.predioPequeno();
        }
        else {
            predio = BuilderImovel_CauanIgorVinicius.predioGrande();
        }

        predio.setCodigoImovel(codigoImovel);
        predio.setEndereco(endereco);
        predio.setDataConstrucao(dataConstrucao);
        predio.setTipo(tipoStr);
        predio.setAndar(andar);

        return predio;
    }


}
