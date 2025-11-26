package controller;

import java.util.Scanner;


import seguro.*;


public class SeguroController_CauanIgorVinicius {
    
    public static Seguro_CauanIgorVinicius cadastrarSeguro() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Codigo do seguro: ");
        int codigoSeguro = sc.nextInt();

        sc.nextLine();

        System.out.print("Nome da seguradora: ");
        String nomeSeguradora = sc.nextLine();

        System.out.print("Tipo do seguro: ");
        String tipo = sc.nextLine();

        System.out.print("Descricao do seguro: ");
        String descricao = sc.nextLine();

        System.out.print("Valor do seguro: ");
        float valor = sc.nextFloat();

        Seguro_CauanIgorVinicius seguro = new Seguro_CauanIgorVinicius(codigoSeguro, nomeSeguradora, tipo, descricao, valor);

        return seguro;

    }

}
