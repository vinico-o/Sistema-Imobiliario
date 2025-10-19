package Sistema;

import imobiliaria.Imobiliaria_CauanIgorVinicius;
import imovel.*;
import pagamento.Cartao_CauanIgorVinicius;
import pagamento.Dinheiro_CauanIgorVinicius;
import pagamento.Pagamento_CauanIgorVinicius;
import seguro.Seguro_CauanIgorVinicius;
import usuario.Cliente_CauanIgorVinicius;
import usuario.Corretor_CauanIgorVinicius;
import venda.Venda_CauanIgorVinicius;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import aluguel.Aluguel_CauanIgorVinicius;

public class sistema_CauanIgorVinicius{

    public static void sistema() {

        Imobiliaria_CauanIgorVinicius imobiliaria = new Imobiliaria_CauanIgorVinicius();

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
                    Cliente_CauanIgorVinicius cliente = cadastrarCliente();

                    System.out.println("\nCliente cadastrado com sucesso!\n");
                    imobiliaria.addCliente(cliente);

                    break;

                case 2:
                    Corretor_CauanIgorVinicius corretor = cadastrarCorretor();

                    System.out.println("\nCorretor cadastrado com sucesso!\n");

                    imobiliaria.addCorretor(corretor);

                    break;

                case 3:
                    CasaResidencial_CauanIgorVinicius casaResidencial = cadastrarCasaResidencial();

                    System.out.println("\nCasa residencial cadastrada com sucesso!\n");

                    imobiliaria.addImovel(casaResidencial);

                    break;

                case 4:

                    Comercial_CauanIgorVinicius imovelComercial = cadastrarImovelComercial();

                    System.out.println("\nImovel comercial cadastrado com sucesso!\n");

                    imobiliaria.addImovel(imovelComercial);

                    break;

                case 5:
                    PredioResidencial_CauanIgorVinicius predioResidencial = cadastrarPredioResidencial();

                    System.out.println("\nPredio residencial cadastrado com sucesso!\n");

                    imobiliaria.addImovel(predioResidencial);

                    break;
                
                case 6:
                    Seguro_CauanIgorVinicius seguro = cadastrarSeguro();

                    System.out.println("\nSeguro cadastrado com sucesso!\n");

                    imobiliaria.addSeguro(seguro);

                    break;

                
                case 7:
                    Aluguel_CauanIgorVinicius aluguel = cadastrarAluguel(imobiliaria);

                    System.out.println("\nAluguel cadastrado com sucesso!\n");

                    imobiliaria.addAluguel(aluguel);

                    break;

                case 8:
                    Venda_CauanIgorVinicius venda = cadastrarVenda(imobiliaria);

                    System.out.println("\nVenda cadastrada com sucesso!\n");

                    imobiliaria.addAVenda(venda);

                    break;

                case 9:
                    pagarAluguel(imobiliaria);

                    break;

                case 10:
                    finalizarAluguel(imobiliaria);

                    break;

                case 11:
                    finalizarVenda(imobiliaria);

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

    private static void finalizarVenda(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
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

    private static void finalizarAluguel(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
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

    private static void pagarAluguel(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
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

    private static Venda_CauanIgorVinicius cadastrarVenda(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
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
        Pagamento_CauanIgorVinicius pagamento = cadastrarPagamento(forma);

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

    private static Seguro_CauanIgorVinicius cadastrarSeguro() {
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
        System.out.println("|  02- Listar todos os imoveis de categoria Pridio Residencial            |");
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

    private static Aluguel_CauanIgorVinicius cadastrarAluguel(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
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

            Pagamento_CauanIgorVinicius pagamento = cadastrarPagamento(escolha);

            Aluguel_CauanIgorVinicius aluguel = new Aluguel_CauanIgorVinicius(codigoAluguel, clienteAluguel,
                    corretorAluguel, imovelAluguel, dataAlguel, dataDevolucao, dataPagamentoMensal, pagamento,
                    seguroAluguel, false, false);
            
            imovelAluguel.setIsDisponivel(false);

            return aluguel;
        } 
        else {
            System.out.println("\nInformacoes nao encontradas - cancelando aluguel de imovel");

            return null;
        }
    }

    private static PredioResidencial_CauanIgorVinicius cadastrarPredioResidencial() {
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

        System.out.print("Area total: ");
        float areaTotal = sc.nextFloat();

        System.out.print("Area construida: ");
        float areaConstruida = sc.nextFloat();

        System.out.print("Quantidade de dormitorios: ");
        int qntDormitorios = sc.nextInt();

        System.out.print("Quantidade de banheiros: ");
        int qntBanheiros = sc.nextInt();

        System.out.print("Quantidade de vagas na garagem: ");
        int qntVagasGaragem = sc.nextInt();

        System.out.print("Valor do IPTU: ");
        float valorIPTU = sc.nextFloat();

        System.out.print("Valor de venda: ");
        float valorVenda = sc.nextFloat();

        System.out.print("Valor do alguel: ");
        float valorAluguel = sc.nextFloat();

        System.out.print("Andar do apartamento: ");
        int andar = sc.nextInt();

        System.out.print("valor do condominio: ");
        float valorCondominio = sc.nextFloat();

        String tipoStr;
        if (tipo == 0)
        {
            tipoStr = "aluguel";
        }
        else
        {
            tipoStr = "venda";
        }

        PredioResidencial_CauanIgorVinicius predioResidencial = new PredioResidencial_CauanIgorVinicius(andar,
                valorCondominio, codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qntDormitorios,
                qntBanheiros, qntVagasGaragem, valorIPTU, valorVenda, valorAluguel, tipoStr);

        return predioResidencial;
    }

    private static Comercial_CauanIgorVinicius cadastrarImovelComercial() {

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

        System.out.print("Area total: ");
        float areaTotal = sc.nextFloat();

        System.out.print("Area construida: ");
        float areaConstruida = sc.nextFloat();

        System.out.print("Quantidade de dormitorios: ");
        int qntDormitorios = sc.nextInt();

        System.out.print("Quantidade de banheiros: ");
        int qntBanheiros = sc.nextInt();

        System.out.print("Quantidade de vagas na garagem: ");
        int qntVagasGaragem = sc.nextInt();

        System.out.print("Valor do IPTU: ");
        float valorIPTU = sc.nextFloat();

        System.out.print("Valor de venda: ");
        float valorVenda = sc.nextFloat();

        System.out.print("Valor do alguel: ");
        float valorAluguel = sc.nextFloat();

        System.out.print("Imposto federal: ");
        float taxaImpostoFederal = sc.nextFloat();

        String tipoStr;
        if (tipo == 0)
        {
            tipoStr = "aluguel";
        }
        else
        {
            tipoStr = "venda";
        }

        Comercial_CauanIgorVinicius imovelComercial = new Comercial_CauanIgorVinicius(taxaImpostoFederal, codigoImovel,
                endereco, dataConstrucao, areaTotal, areaConstruida, qntDormitorios, qntBanheiros, qntVagasGaragem,
                valorIPTU, valorVenda, valorAluguel, tipoStr);

        return imovelComercial;
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

    private static Cliente_CauanIgorVinicius cadastrarCliente() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Código do usuário: ");
        int codigoUsuario = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("RG: ");
        String rg = sc.nextLine();

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataStr, formatter);

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.nextLine();

        LocalDate localDate = LocalDate.now();

        Cliente_CauanIgorVinicius cliente = new Cliente_CauanIgorVinicius(localDate, codigoUsuario, nome, cpf, rg,
                dataNascimento, endereco, cep, telefone, email);

        return cliente;

    }

    private static Corretor_CauanIgorVinicius cadastrarCorretor() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Código do usuário: ");
        int codigoUsuario = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("RG: ");
        String rg = sc.nextLine();

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataStr, formatter);

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.nextLine();

        System.out.print("Cresci: ");
        String cresci = sc.nextLine();

        System.out.print("Salario: ");
        float salario = sc.nextFloat();

        if (salario < 0) {
            System.out.println("Salario invalido! - falha no cadastro");

            return null;
        }

        sc.nextLine();

        System.out.print("Pis: ");
        String pis = sc.nextLine();

        System.out.print("Data de admissao (dd/MM/yyyy): ");
        String dataAdmStr = sc.nextLine();
        LocalDate dataAdm = LocalDate.parse(dataAdmStr, formatter);

        Corretor_CauanIgorVinicius corretor = new Corretor_CauanIgorVinicius(cresci, salario, pis, dataAdm,
                codigoUsuario, nome, cpf, rg,
                dataNascimento, endereco, cep, telefone, email);

        return corretor;
    }

    private static CasaResidencial_CauanIgorVinicius cadastrarCasaResidencial() {
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

        System.out.print("Area total: ");
        float areaTotal = sc.nextFloat();

        System.out.print("Area construida: ");
        float areaConstruida = sc.nextFloat();

        System.out.print("Quantidade de dormitorios: ");
        int qntDormitorios = sc.nextInt();

        System.out.print("Quantidade de banheiros: ");
        int qntBanheiros = sc.nextInt();

        System.out.print("Quantidade de vagas na garagem: ");
        int qntVagasGaragem = sc.nextInt();

        System.out.print("Valor do IPTU: ");
        float valorIPTU = sc.nextFloat();

        System.out.print("Valor de venda: ");
        float valorVenda = sc.nextFloat();

        System.out.print("Valor do alguel: ");
        float valorAluguel = sc.nextFloat();

        String tipoStr;
        if (tipo == 0)
        {
            tipoStr = "aluguel";
        }
        else
        {
            tipoStr = "venda";
        }

        CasaResidencial_CauanIgorVinicius casaResidencial = new CasaResidencial_CauanIgorVinicius(codigoImovel,
                endereco, dataConstrucao, areaTotal, areaConstruida, qntDormitorios, qntBanheiros, qntVagasGaragem,
                valorIPTU, valorVenda, valorAluguel, tipoStr);

        return casaResidencial;

    }

    private static Pagamento_CauanIgorVinicius cadastrarPagamento(int escolha) {
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
