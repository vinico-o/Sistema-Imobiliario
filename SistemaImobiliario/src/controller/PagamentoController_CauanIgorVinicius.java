package controller;

import java.util.Scanner;


import pagamento.*;


public class PagamentoController_CauanIgorVinicius {
    
    public static Pagamento_CauanIgorVinicius cadastrarPagamento(int escolha) {
        Pagamento_CauanIgorVinicius d;

        if (escolha == 0) {
            d = new Dinheiro_CauanIgorVinicius("dinheiro");
        } else {
            Scanner sc = new Scanner(System.in);


            System.out.print("Nome do cartao: ");
            String nome = sc.nextLine();

            System.out.print("Bandeira do cartao: ");
            String bandeira = sc.nextLine();

            System.out.print("Numero do cartao: ");
            String numero = sc.nextLine();
    
            d = new Cartao_CauanIgorVinicius(nome, bandeira, numero, "cartao");

        }


        return d;

    }

}
