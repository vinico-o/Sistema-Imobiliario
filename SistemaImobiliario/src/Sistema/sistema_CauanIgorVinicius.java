package Sistema;

import imobiliaria.Imobiliaria_CauanIgorVinicius;
import imovel.*;
import pagamento.Cartao_CauanIgorVinicius;
import pagamento.Dinheiro_CauanIgorVinicius;
import pagamento.Pagamento_CauanIgorVinicius;
import seguro.Seguro_CauanIgorVinicius;
import usuario.Cliente_CauanIgorVinicius;
import usuario.Corretor_CauanIgorVinicius;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import aluguel.Aluguel_CauanIgorVinicius;

public class sistema_CauanIgorVinicius{

    public static void main(String[] args) {

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

        System.out.println("\n\n|| SISTEMA IMOBILIARIO ||");

        int opcao;

        do {
            opcao = Integer.parseInt(mensagemMenu());

            switch (opcao) {
                case 1:

                    Cliente_CauanIgorVinicius cliente = cadastrarCliente();

                    imobiliaria.addCliente(cliente);

                    break;

                case 2:

                    Corretor_CauanIgorVinicius corretor = cadastrarCorretor();

                    imobiliaria.addCorretor(corretor);

                    break;

                case 3:

                    CasaResidencial_CauanIgorVinicius casaResidencial = cadastrarCasaResidencial();

                    imobiliaria.addImovel(casaResidencial);

                    break;

                case 4:

                    Comercial_CauanIgorVinicius imovelComercial = cadastrarImovelComercial();

                    imobiliaria.addImovel(imovelComercial);

                    break;

                case 5:

                    PredioResidencial_CauanIgorVinicius predioResidencial = cadastrarPredioResidencial();

                    imobiliaria.addImovel(predioResidencial);

                    break;

                
                case 6:

                    Aluguel_CauanIgorVinicius aluguel = cadastrarAluguel(imobiliaria);

                    imobiliaria.addAluguel(aluguel);

                    break;

                case 7:
                    //Pagar imovel
                    
                    

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:
                    //Aqui no relatorio vou chamar um metod para opções de listagem
                    int lista = Integer.parseInt(Listagem());
                    OpListagem(lista,imobiliaria);
                    break;

                case 11:
                    imobiliaria.salvarObjetos();
                    
                    break;

                default:
                    System.out.println("\nFIM DO PROGRAMA");
                    System.out.println("---------------------");
                    break;

            }

        } while (opcao != 11);

    }
    private static void OpListagem(int operacao,Imobiliaria_CauanIgorVinicius imobiliaria)
    {
        int sair =1;
        do{
            
            switch(operacao)
            {
                case 1:
                    ListarImoveisCasaResidencial(imobiliaria);
                    break;
                    
                case 2:
                    ListarImoveisPredioResidencial(imobiliaria);
                    break;
                    
                case 3:
                    ListarImoveisComercial(imobiliaria);
                    break;
                    
                case 4:
                    ListarImoveisDiponiveisLocacao(imobiliaria);
                    break;
                    
                case 5:
                    ListarImoveisAlugados(imobiliaria);
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    break;
                    
                case 8:
                    break;
                    
                case 9:
                    break;
                    
                case 10:
                    break;  
                    
                case 11:
                    break;
                    
                case 12:
                    break;
                    
                case 13:
                    break;
                    
                case 14:
                    break;
                    
                case 15:
                    break;
                    
                case 16:
                    break;
                    
                case 17:
                    break;
                    
                case 18:
                    break;
                    
                case 19:
                    System.out.println("Saindo da opção de relatórios!");
                    sair = 0;
                    break;
                    
                default:
                    System.out.println("Opção invalidada! Digite novamente:");
                    break;
                
                
            }
        }while(sair==1);
    }
    private static String Listagem()
    {
        System.out.println("Digite uma operação de Listagem");
        System.out.println("1- Listar todos os imóveis de categoria Casa Residencial");
        System.out.println("2- Listar todos os imóveis de categoria Prédio Residencial");
        System.out.println("3- Listar todos os imóveis de categoria Comercial");    
        System.out.println("4- Listar todos os Imóveis disponíveis para locação");
        System.out.println("5- Listar todos os Imóveis alugados");
        
        System.out.println("6- Listar todos os Imóveis disponíveis para vendas");
        System.out.println("7- Listar todos os Imóveis vendidos");
        System.out.println("8- Listar todos os Imóveis com atraso no pagamento do aluguel");
        System.out.println("9- Listar todos os Imóveis já alugados por um Cliente em específico");
        System.out.println("10- Listar todos os Imóveis já comprados por um Cliente em específico");
        System.out.println("11- Listar todos os Corretores cadastrados");
        System.out.println("12- Listar todos os Clientes cadastrados");
        System.out.println("13- Listar Clientes com aluguéis em atraso");
        System.out.println("14- Listar todos os Aluguéis finalizados, ou seja, que já concluíram contrato e foram devolvidos");
        System.out.println("15- Listar todos os Aluguéis ainda dentro do prazo de locação");
        System.out.println("16- Listar todas as Vendas realizadas");
        System.out.println("17- Listar Vendas realizadas em um mês em específico e o total de lucro gerado no mês");
        System.out.println("18- Listar todos os tipos de Seguros cadastrados");
        System.out.println("19- Sair");
        
        Scanner leitor = new Scanner(System.in);

        String opcao = leitor.nextLine();

        return opcao;       
 
    }
    private static void ListarImoveisAlugados(Imobiliaria_CauanIgorVinicius imobiliaria)
    {
        for(Aluguel_CauanIgorVinicius alg : imobiliaria.getAlugueis())
        {
            String text = alg.toString();
            System.out.println(text);
        }
    }
    private static void ListarImoveisDiponiveisLocacao(Imobiliaria_CauanIgorVinicius imobiliaria)
    {
         for(Imovel_CauanIgorVinicius imv : imobiliaria.getImoveis())
        {
            imv.imprimir();
        }        
    } 
    private static void ListarImoveisComercial(Imobiliaria_CauanIgorVinicius imobiliaria)
    {
        for(Imovel_CauanIgorVinicius imv : imobiliaria.getImoveis())
        {
            if(imv instanceof Comercial_CauanIgorVinicius)
            {
                imv.imprimir();
            }
        }         
    }
    private static void ListarImoveisPredioResidencial(Imobiliaria_CauanIgorVinicius imobiliaria)
    {
        for(Imovel_CauanIgorVinicius imv : imobiliaria.getImoveis())
        {
            if(imv instanceof PredioResidencial_CauanIgorVinicius)
            {
                imv.imprimir();
            }
        } 
    }
    private static void ListarImoveisCasaResidencial(Imobiliaria_CauanIgorVinicius imobiliaria)
    {
        for(Imovel_CauanIgorVinicius imv : imobiliaria.getImoveis())
        {
            if(imv instanceof CasaResidencial_CauanIgorVinicius)
            {
                imv.imprimir();
            }
        }
    }
    
    private static Aluguel_CauanIgorVinicius cadastrarAluguel(Imobiliaria_CauanIgorVinicius imobiliaria) {
        
        imobiliaria.listarImoveisParaLocacao();
        imobiliaria.listarCorretoresRegistrados();
        imobiliaria.listarClientesRegistrados();

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o codigo do cliente: ");
        int codigoCliente = sc.nextInt();

        System.out.println("Informe o codigo do corretor: ");
        int codigoCorretor = sc.nextInt();

        System.out.println("Informe o codigo do imovel: ");
        int codigoImovel = sc.nextInt();

        System.out.println("Informe o codigo do seguro: ");
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
            if (c.getCodigoSEguro() == codigoImovel) {
                seguroAluguel.add(c);
            }
        }

        if (imovelAluguel != null && clienteAluguel != null && corretorAluguel != null && seguroAluguel != null) {
            System.out.println("Informe o codigo do aluguel: ");
            int codigoAluguel = sc.nextInt();

            sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Informe a data do aluguel (DD/MM/YYYY): ");
            String dataStr = sc.nextLine();
            LocalDate dataAlguel = LocalDate.parse(dataStr, formatter);

            System.out.println("Informe a data do devolucao (DD/MM/YYYY): ");
            dataStr = sc.nextLine();
            LocalDate dataDevolucao = LocalDate.parse(dataStr, formatter);

            System.out.println("Informe a data de pagamento mensal (DD/MM/YYYY): ");
            dataStr = sc.nextLine();
            LocalDate dataPagamentoMensal = LocalDate.parse(dataStr, formatter);

            System.out.println("Valor total do aluguel: ");
            float valorTotalAluguel = sc.nextFloat();

            System.out.println("Qual a forma de pagamento? (0 - dinhero // 1- cartao)");
            int escolha = sc.nextInt();

            sc.nextLine();

            Pagamento_CauanIgorVinicius pagamento = cadastrarPagamento(escolha);

            Aluguel_CauanIgorVinicius aluguel = new Aluguel_CauanIgorVinicius(codigoAluguel, clienteAluguel,
                    corretorAluguel, imovelAluguel, dataAlguel, dataDevolucao, dataPagamentoMensal, pagamento,
                    seguroAluguel, false, false);

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

        System.out.println("Codigo do imovel; ");
        int codigoImovel = sc.nextInt();

        sc.nextLine();

        System.out.println("Endereco: ");
        String endereco = sc.nextLine();

        System.out.println("Data de construcao (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();
        LocalDate dataConstrucao = LocalDate.parse(dataStr, formatter);

        System.out.println("Area total: ");
        float areaTotal = sc.nextFloat();

        System.out.println("Area construida: ");
        float areaConstruida = sc.nextFloat();

        System.out.println("Quantidade de dormitorios: ");
        int qntDormitorios = sc.nextInt();

        System.out.println("Quantidade de banheiros: ");
        int qntBanheiros = sc.nextInt();

        System.out.println("Quantidade de vagas na garagem: ");
        int qntVagasGaragem = sc.nextInt();

        System.out.println("Valor do IPTU: ");
        float valorIPTU = sc.nextFloat();

        System.out.println("Valor de venda: ");
        float valorVenda = sc.nextFloat();

        System.out.println("Valor do alguel: ");
        float valorAluguel = sc.nextFloat();

        System.out.println("Andar do apartamento: ");
        int andar = sc.nextInt();

        System.out.println("valor do condominio: ");
        float valorCondominio = sc.nextFloat();

        PredioResidencial_CauanIgorVinicius predioResidencial = new PredioResidencial_CauanIgorVinicius(andar,
                valorCondominio, codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qntDormitorios,
                qntBanheiros, qntVagasGaragem, valorIPTU, valorVenda, valorAluguel);

        return predioResidencial;
    }

    private static Comercial_CauanIgorVinicius cadastrarImovelComercial() {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Codigo do imovel; ");
        int codigoImovel = sc.nextInt();

        sc.nextLine();

        System.out.println("Endereco: ");
        String endereco = sc.nextLine();

        System.out.println("Data de construcao (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();
        LocalDate dataConstrucao = LocalDate.parse(dataStr, formatter);

        System.out.println("Area total: ");
        float areaTotal = sc.nextFloat();

        System.out.println("Area construida: ");
        float areaConstruida = sc.nextFloat();

        System.out.println("Quantidade de dormitorios: ");
        int qntDormitorios = sc.nextInt();

        System.out.println("Quantidade de banheiros: ");
        int qntBanheiros = sc.nextInt();

        System.out.println("Quantidade de vagas na garagem: ");
        int qntVagasGaragem = sc.nextInt();

        System.out.println("Valor do IPTU: ");
        float valorIPTU = sc.nextFloat();

        System.out.println("Valor de venda: ");
        float valorVenda = sc.nextFloat();

        System.out.println("Valor do alguel: ");
        float valorAluguel = sc.nextFloat();

        System.out.println("Imposto federal: ");
        float taxaImpostoFederal = sc.nextFloat();

        Comercial_CauanIgorVinicius imovelComercial = new Comercial_CauanIgorVinicius(taxaImpostoFederal, codigoImovel,
                endereco, dataConstrucao, areaTotal, areaConstruida, qntDormitorios, qntBanheiros, qntVagasGaragem,
                valorIPTU, valorVenda, valorAluguel);

        return imovelComercial;
    }

    private static String mensagemMenu() {
        System.out.println("1- Cadastrar cliente");
        System.out.println("2- Cadastrar corretor");
        System.out.println("3- Cadastrar casa residencial");
        System.out.println("4- Cadastrar imovel comercial");
        System.out.println("5- Cadastrar predio residencial");
        System.out.println("6- Alugar imovel");
        System.out.println("7- Pagar imovel"); //Seria comprar ou pagar o imovel ou pagar o aluguel?
        System.out.println("8- Finalizar aluguel");
        System.out.println("9- Finalizar venda");
        System.out.println("10- Relatorio");
        System.out.println("11- Sair");

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

        System.out.println("Salario: ");
        float salario = sc.nextFloat();

        if (salario < 0) {
            System.out.println("Salario invalido! - falha no cadastro");

            return null;
        }

        sc.nextLine();

        System.out.println("Pis: ");
        String pis = sc.nextLine();

        System.out.println("Data de admissao: ");
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

        System.out.println("Codigo do imovel; ");
        int codigoImovel = sc.nextInt();

        sc.nextLine();

        System.out.println("Endereco: ");
        String endereco = sc.nextLine();

        System.out.println("Data de construcao (dd/MM/yyyy): ");
        String dataStr = sc.nextLine();
        LocalDate dataConstrucao = LocalDate.parse(dataStr, formatter);

        System.out.println("Area total: ");
        float areaTotal = sc.nextFloat();

        System.out.println("Area construida: ");
        float areaConstruida = sc.nextFloat();

        System.out.println("Quantidade de dormitorios: ");
        int qntDormitorios = sc.nextInt();

        System.out.println("Quantidade de banheiros: ");
        int qntBanheiros = sc.nextInt();

        System.out.println("Quantidade de vagas na garagem: ");
        int qntVagasGaragem = sc.nextInt();

        System.out.println("Valor do IPTU: ");
        float valorIPTU = sc.nextFloat();

        System.out.println("Valor de venda: ");
        float valorVenda = sc.nextFloat();

        System.out.println("Valor do alguel: ");
        float valorAluguel = sc.nextFloat();

        CasaResidencial_CauanIgorVinicius casaResidencial = new CasaResidencial_CauanIgorVinicius(codigoImovel,
                endereco, dataConstrucao, areaTotal, areaConstruida, qntDormitorios, qntBanheiros, qntVagasGaragem,
                valorIPTU, valorVenda, valorAluguel);

        return casaResidencial;

    }

    private static Pagamento_CauanIgorVinicius cadastrarPagamento(int escolha) {
        Pagamento_CauanIgorVinicius d;

        if (escolha == 0) {
            d = new Dinheiro_CauanIgorVinicius("dinheiro");
        } else {
            Scanner sc = new Scanner(System.in);


            System.out.println("Nome do cartao: ");
            String nome = sc.nextLine();

            System.out.println("Bandeira do cartao: ");
            String bandeira = sc.nextLine();

            System.out.println("Numero do cartao: ");
            String numero = sc.nextLine();

            d = new Cartao_CauanIgorVinicius(nome, bandeira, numero, "cartao");
        }

        return d;

    }
}
