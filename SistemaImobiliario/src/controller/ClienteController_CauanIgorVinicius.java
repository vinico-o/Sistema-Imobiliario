package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import usuario.*;


public class ClienteController_CauanIgorVinicius {
    
    public static Cliente_CauanIgorVinicius cadastrarCliente() {
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

}
