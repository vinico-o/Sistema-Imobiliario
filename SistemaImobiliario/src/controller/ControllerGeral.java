package controller;

import aluguel.Aluguel_CauanIgorVinicius;
import imobiliaria.*;
import imovel.*;
import seguro.*;
import usuario.*;
import venda.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ControllerGeral{

    public static void sistema() {

        // singleton
        Imobiliaria_CauanIgorVinicius imobiliaria = Imobiliaria_CauanIgorVinicius.getInstance();

        if (imobiliaria.getAlugueis() == null) {
            imobiliaria.setAlugueis(new ArrayList<>());
        }

        if (imobiliaria.getVendas() == null) {
            imobiliaria.setVendas(new ArrayList<>());
        }

        if (imobiliaria.getImoveis() == null) {
            imobiliaria.setImoveis(new ArrayList<>());
        }

        if (imobiliaria.getClientes() == null) {
            imobiliaria.setClientes(new ArrayList<>());
        }

        if (imobiliaria.getCorretores() == null) {
            imobiliaria.setCorretores(new ArrayList<>());
        }

        if (imobiliaria.getSeguros() == null) {
            imobiliaria.setSeguros(new ArrayList<>());
        }

        System.out.println("+---------------------------------------+");
        System.out.println("|    BEM VINDO AO SISTEMA IMOBILIARIO   |");
        System.out.println("+---------------------------------------+");

        int opcao;

        do {
            opcao = Integer.parseInt(mensagemMenu());

            switch (opcao) {
                case 1:
                    Cliente_CauanIgorVinicius cliente = ClienteController_CauanIgorVinicius.cadastrarCliente();

                    System.out.println("\nCliente cadastrado com sucesso!\n");
                    imobiliaria.addCliente(cliente);

                    break;

                case 2:
                    Corretor_CauanIgorVinicius corretor = CorretorController_CauanIgorVinicius.cadastrarCorretor();

                    System.out.println("\nCorretor cadastrado com sucesso!\n");

                    imobiliaria.addCorretor(corretor);

                    break;

                case 3:
                    CasaResidencial_CauanIgorVinicius casaResidencial = ImovelController_CauanIgorVinicius.cadastrarCasaResidencial();

                    System.out.println("\nCasa residencial cadastrada com sucesso!\n");

                    imobiliaria.addImovel(casaResidencial);

                    break;

                case 4:

                    Comercial_CauanIgorVinicius imovelComercial = ImovelController_CauanIgorVinicius.cadastrarImovelComercial();

                    System.out.println("\nImovel comercial cadastrado com sucesso!\n");

                    imobiliaria.addImovel(imovelComercial);

                    break;

                case 5:
                    PredioResidencial_CauanIgorVinicius predioResidencial = ImovelController_CauanIgorVinicius.cadastrarPredioResidencial();

                    System.out.println("\nPredio residencial cadastrado com sucesso!\n");

                    imobiliaria.addImovel(predioResidencial);

                    break;
                
                case 6:
                    Seguro_CauanIgorVinicius seguro = SeguroController_CauanIgorVinicius.cadastrarSeguro();

                    System.out.println("\nSeguro cadastrado com sucesso!\n");

                    imobiliaria.addSeguro(seguro);

                    break;

                
                case 7:
                    Aluguel_CauanIgorVinicius aluguel = AluguelController_CauanIgorVinicius.cadastrarAluguel(imobiliaria);

                    System.out.println("\nAluguel cadastrado com sucesso!\n");

                    imobiliaria.addAluguel(aluguel);

                    break;

                case 8:
                    Venda_CauanIgorVinicius venda = VendaController_CauanIgorVinicius.cadastrarVenda(imobiliaria);

                    System.out.println("\nVenda cadastrada com sucesso!\n");

                    imobiliaria.addAVenda(venda);

                    break;

                case 9:
                    AluguelController_CauanIgorVinicius.pagarAluguel(imobiliaria);

                    break;

                case 10:
                    AluguelController_CauanIgorVinicius.finalizarAluguel(imobiliaria);

                    break;

                case 11:
                    VendaController_CauanIgorVinicius.finalizarVenda(imobiliaria);

                    break;

                case 12:
                    int lista = Integer.parseInt(Listagem());
                    OpListagem(lista,imobiliaria);

                    break;

                case 0:
                    imobiliaria.salvarObjetos();
                    System.out.println("+---------------------------------------+");
                    System.out.println("|            FIM DO PROGRAMA            |");
                    System.out.println("+---------------------------------------+");

                    break;

                default:
                    System.out.println("\nOpcao invalida");

                    break;

            }

        } while (opcao != 0);

    }
    

    private static void OpListagem(int operacao,Imobiliaria_CauanIgorVinicius imobiliaria)
    {
        int sair =1;
        Scanner leitor = new Scanner(System.in);
        do{
            

            switch(operacao)
            {
                case 1:
                    imobiliaria.listarCasaResidencial();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 2:
                    imobiliaria.listarPredio();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 3:
                    imobiliaria.listarImovelComercial();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 4:
                    imobiliaria.listarImoveisParaLocacao();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 5:
                    imobiliaria.listarImoveisAlugados();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 6:
                    imobiliaria.listarImoveisDisponiveisVenda();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 7:
                    imobiliaria.listarImoveisVendidos();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 8:
                    imobiliaria.listarImoveisAtrasoAluguel();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 9:
                    imobiliaria.listarClientesRegistrados();
                    System.out.print("Digite o nome do cliente para a busca: ");
                    String c = leitor.nextLine();
                    imobiliaria.listarImoveisAlugadosPorCliente(c);
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 10:
                    imobiliaria.listarClientesRegistrados();
                    System.out.print("Digite o nome do cliente para a busca: ");
                    String cliente = leitor.nextLine();
                    imobiliaria.listarImoveisCompradosPorCliente(cliente);
                    operacao = Integer.parseInt(Listagem());
                    break;  
                    
                case 11:
                    imobiliaria.listarCorretoresRegistrados();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 12:
                    imobiliaria.listarClientesRegistrados();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 13:
                    imobiliaria.listarClientesComAluguelAtrasado();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 14:
                    imobiliaria.listarAlugueisFinalizadosDevolvidos();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 15:
                    imobiliaria.listarAlugueisDentroDoPrazoLocacao();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 16:
                    imobiliaria.listarVendasRealizadas();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 17:
                    System.out.println("Digite o mês que deseja buscar:");
                    int month = Integer.parseInt(leitor.nextLine());
                    imobiliaria.listarVendasDoMesX(month);
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 18:
                    imobiliaria.listarSeguros();
                    operacao = Integer.parseInt(Listagem());
                    break;
                    
                case 0:
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("|                    SAIANDO DA OPCAO DE RELATORIOS                       |");
                    System.out.println("+-------------------------------------------------------------------------+");
                    sair = 0;
                    break;
                    
                default:
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("|                   OPCAO INVALIDA! DIGITE NOVAMENTE                      |");
                    System.out.println("+-------------------------------------------------------------------------+");
                    operacao = Integer.parseInt(Listagem());
                    break;
                
            }

        }while(sair==1);
    

    }
    private static String Listagem()
    {
        System.out.println("+-------------------------------------------------------------------------+");
        System.out.println("|IMOVEIS:                                                                 |");
        System.out.println("|  01- Listar todos os imoveis de categoria Casa Residencial              |");
        System.out.println("|  02- Listar todos os imoveis de categoria Predio Residencial            |");
        System.out.println("|  03- Listar todos os imoveis de categoria Comercial                     |");
        System.out.println("|  04- Listar todos os Imoveis disponiveis para locacao                   |");
        System.out.println("|  05- Listar todos os Imoveis alugados                                   |");
        System.out.println("|  06- Listar todos os Imoveis disponiveis para vendas                    |");
        System.out.println("|  07- Listar todos os Imoveis vendidos                                   |");
        System.out.println("|  08- Listar todos os Imoveis com atraso no pagamento do aluguel         |");
        System.out.println("|  09- Listar todos os Imoveis ja alugados por um Cliente em especifico   |");
        System.out.println("|  10- Listar todos os Imoveis ja comprados por um Cliente em especifico  |");
        System.out.println("|PESSOAS:                                                                 |");
        System.out.println("|  11- Listar todos os Corretores cadastrados                             |");
        System.out.println("|  12- Listar todos os Clientes cadastrados                               |");
        System.out.println("|  13- Listar Clientes com alugueis em atraso                             |");
        System.out.println("|CONTRATOS:                                                               |");
        System.out.println("|  14- Listar todos os Alugueis finalizados                               |");
        System.out.println("|  15- Listar todos os Alugueis ainda dentro do prazo de locacao          |");
        System.out.println("|  16- Listar todas as Vendas realizadas                                  |");
        System.out.println("|  17- Listar Vendas realizadas em um mes em especifico e total de lucro  |");
        System.out.println("|SEGUROS:                                                                 |");
        System.out.println("|  18- Listar todos os tipos de Seguros cadastrados                       |");
        System.out.println("|SAIR:                                                                    |");
        System.out.println("|  00- Sair                                                               |");
        System.out.println("+-------------------------------------------------------------------------+");
        System.out.println("+-------------------------------------------------------------------------+");
        System.out.println("|                       DIGITE A OPCAO DESEJADA                           |");
        System.out.println("+-------------------------------------------------------------------------+");
    
        Scanner leitor = new Scanner(System.in);

        String opcao = leitor.nextLine();

        return opcao;  
 
    }

    
    

    private static String mensagemMenu() {
        System.out.println("+---------------------------------------+");
        System.out.println("|CADASTROS:                             |");
        System.out.println("|  01- Cadastrar cliente                |");
        System.out.println("|  02- Cadastrar corretor               |");
        System.out.println("|  03- Cadastrar casa residencial       |");
        System.out.println("|  04- Cadastrar imovel comercial       |");
        System.out.println("|  05- Cadastrar predio residencial     |");
        System.out.println("|  06- Cadastrar seguro                 |");
        System.out.println("|OPERACOES:                             |");
        System.out.println("|  07- Alugar imovel                    |");
        System.out.println("|  08- Vender imovel                    |");
        System.out.println("|  09- Pagar aluguel                    |");
        System.out.println("|  10- Finalizar aluguel                |");
        System.out.println("|  11- Finalizar venda                  |");
        System.out.println("|SISTEMA:                               |");
        System.out.println("|  12- Relatorio                        |");
        System.out.println("|  00- Sair                             |");
        System.out.println("+---------------------------------------+");
        System.out.println("+---------------------------------------+");
        System.out.println("|        DIGITE A OPCAO DESEJADA        |");
        System.out.println("+---------------------------------------+");

        Scanner leitor = new Scanner(System.in);

        String opcao = leitor.nextLine();

        return opcao;
    }

}
