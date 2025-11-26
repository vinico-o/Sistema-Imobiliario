package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import usuario.Corretor_CauanIgorVinicius;

public class CorretorController_CauanIgorVinicius {
    
    public static Corretor_CauanIgorVinicius cadastrarCorretor() {
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

}
