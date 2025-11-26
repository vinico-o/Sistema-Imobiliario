package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


import imobiliaria.*;
import imovel.*;
import pagamento.*;
import usuario.*;
import venda.*;

public class VendaController_CauanIgorVinicius {
    
    public static Venda_CauanIgorVinicius cadastrarVenda(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
        imobiliaria.listarImoveisDisponiveisVenda();
        imobiliaria.listarCorretoresRegistrados();
        imobiliaria.listarClientesRegistrados();

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Codigo da venda: ");
        int codigoVenda = sc.nextInt();

        System.out.print("Codigo do cliente: ");
        int codigoCliente = sc.nextInt();

        System.out.print("Codigo do corretor: ");
        int codigoCorretor = sc.nextInt();

        System.out.print("Codigo do imovel: ");
        int codigoImovel = sc.nextInt();

        sc.nextLine();
        System.out.print("Data da venda (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();
        LocalDate dataVenda = LocalDate.parse(dataStr, formatter);

        System.out.print("Valor total da venda: ");
        float valorVenda = sc.nextFloat();

        System.out.print("Forma de pagamento: (0 - dinhero // 1- cartao) ");
        int forma = sc.nextInt();
        Pagamento_CauanIgorVinicius pagamento = PagamentoController_CauanIgorVinicius.cadastrarPagamento(forma);

        Corretor_CauanIgorVinicius corretorVenda = null;
        Cliente_CauanIgorVinicius clienteVenda = null;
        Imovel_CauanIgorVinicius imovelVenda = null;

        for (Corretor_CauanIgorVinicius c : imobiliaria.getCorretores()) {
            if (c.getCodigoUsuario() == codigoCorretor) {
                corretorVenda = c;
            }
        }

        for (Cliente_CauanIgorVinicius c : imobiliaria.getClientes()) {
            if (c.getCodigoUsuario() == codigoCliente) {
                clienteVenda = c;
            }
        }

        for (Imovel_CauanIgorVinicius c : imobiliaria.getImoveis()) {
            if (c.getCodigoImovel() == codigoImovel) {
                imovelVenda = c;
            }
        }
        
        if (clienteVenda != null && corretorVenda != null && imovelVenda != null)
        {
            Venda_CauanIgorVinicius venda = new Venda_CauanIgorVinicius(codigoVenda, clienteVenda, corretorVenda, imovelVenda, dataVenda, valorVenda,pagamento, false);

            imovelVenda.setIsDisponivel(false);

            return venda;
        }
        else
        {
            System.out.println("Cadastro de venda sem sucesso - informacoes sobre cliente, corretor ou imovel incorretas");

            return null;
        }

    }

    public static void finalizarVenda(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
        imobiliaria.listarImoveisDisponiveisVenda();

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o codigo da venda: ");
        String codigoVenda = sc.nextLine();

        boolean encontrado = false;

        for (Venda_CauanIgorVinicius venda: imobiliaria.getVendas())
        {
            if (venda.getCodigoVenda() == Integer.parseInt(codigoVenda)  && venda.getFinalizada() == false)
            {
                encontrado = true;
                venda.setFinalizada(true);
                System.out.println("\nVenda finalizada");
            }
        }
        
        if (encontrado == false)
        {
            System.out.println("Venda nao encontrado");
        }

    }


}
