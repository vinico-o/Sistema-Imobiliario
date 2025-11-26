package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import aluguel.Aluguel_CauanIgorVinicius;
import imobiliaria.*;
import imovel.*;
import pagamento.*;
import seguro.*;
import usuario.*;

public class AluguelController_CauanIgorVinicius {
    
    public static Aluguel_CauanIgorVinicius cadastrarAluguel(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
        imobiliaria.listarImoveisParaLocacao();
        imobiliaria.listarCorretoresRegistrados();
        imobiliaria.listarClientesRegistrados();
        imobiliaria.listarSeguros();

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o codigo do cliente: ");
        int codigoCliente = sc.nextInt();

        System.out.print("Informe o codigo do corretor: ");
        int codigoCorretor = sc.nextInt();

        System.out.print("Informe o codigo do imovel: ");
        int codigoImovel = sc.nextInt();

        System.out.print("Informe o codigo do seguro: ");
        int codigoSeguro = sc.nextInt();

        Corretor_CauanIgorVinicius corretorAluguel = null;
        Cliente_CauanIgorVinicius clienteAluguel = null;
        Imovel_CauanIgorVinicius imovelAluguel = null;
        ArrayList<Seguro_CauanIgorVinicius> seguroAluguel = new ArrayList<>();

        for (Corretor_CauanIgorVinicius c : imobiliaria.getCorretores()) {
            if (c.getCodigoUsuario() == codigoCorretor) {
                corretorAluguel = c;
            }
        }

        for (Cliente_CauanIgorVinicius c : imobiliaria.getClientes()) {
            if (c.getCodigoUsuario() == codigoCliente) {
                clienteAluguel = c;
            }
        }

        for (Imovel_CauanIgorVinicius c : imobiliaria.getImoveis()) {
            if (c.getCodigoImovel() == codigoImovel) {
                imovelAluguel = c;
            }
        }

        for (Seguro_CauanIgorVinicius c : imobiliaria.getSeguros()) {
            if (c.getCodigoSEguro() == codigoSeguro) {
                seguroAluguel.add(c);
            }
        }

        if (imovelAluguel != null && clienteAluguel != null && corretorAluguel != null && seguroAluguel != null) {
            System.out.print("Informe o codigo do aluguel: ");
            int codigoAluguel = sc.nextInt();

            sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.print("Informe a data do aluguel (DD/MM/YYYY): ");
            String dataStr = sc.nextLine();
            LocalDate dataAlguel = LocalDate.parse(dataStr, formatter);

            System.out.print("Informe a data do devolucao (DD/MM/YYYY): ");
            dataStr = sc.nextLine();
            LocalDate dataDevolucao = LocalDate.parse(dataStr, formatter);

            System.out.print("Informe a data de pagamento mensal (DD/MM/YYYY): ");
            dataStr = sc.nextLine();
            LocalDate dataPagamentoMensal = LocalDate.parse(dataStr, formatter);

            System.out.print("Qual a forma de pagamento? (0 - dinhero // 1- cartao)");
            int escolha = sc.nextInt();

            sc.nextLine();

            Pagamento_CauanIgorVinicius pagamento = PagamentoController_CauanIgorVinicius.cadastrarPagamento(escolha);

            Aluguel_CauanIgorVinicius aluguel = new Aluguel_CauanIgorVinicius(codigoAluguel, clienteAluguel,
                    corretorAluguel, imovelAluguel, dataAlguel, dataDevolucao, dataPagamentoMensal, pagamento,
                    seguroAluguel, false, false);
            

            imovelAluguel.setIsDisponivel(false);

            return aluguel;
        } 

            System.out.println("\nInformacoes nao encontradas - cancelando aluguel de imovel");

            return null;
        }

    public static void pagarAluguel(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
        imobiliaria.listarImoveisAtrasoAluguel();
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o codigo do aluguel: ");
        String codigoAluguel = sc.nextLine();

        boolean encontrado = false;

        for (Aluguel_CauanIgorVinicius aluguel: imobiliaria.getAlugueis())
        {
            if (aluguel.getCodigoAluguel() == Integer.parseInt(codigoAluguel) && aluguel.getPago() == false)
            {
                encontrado = true;
                aluguel.setPago(true);
                System.out.println("\nAluguel pago com sucesso\n");
            }
        }

        if (encontrado == false)
        {
            System.out.println("\nAluguel nao encontrado\n");
        }
    }

    public static void finalizarAluguel(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
        imobiliaria.listarImoveisAlugados();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        System.out.print("Informe o codigo do aluguel: ");
        String codigoAluguel = sc.nextLine();

        boolean encontrado = false;

        for (Aluguel_CauanIgorVinicius aluguel: imobiliaria.getAlugueis())
        {
            if (aluguel.getCodigoAluguel() == Integer.parseInt(codigoAluguel) && aluguel.getFinalizado() == false)
            {
                encontrado = true;

                aluguel.setFinalizado(true);
                System.out.println("\nAluguel finalizado com sucesso\n");
            }
        }

        if (encontrado == false)
        {
            System.out.println("Aluguel nao encontrado");
        }
    }

}
