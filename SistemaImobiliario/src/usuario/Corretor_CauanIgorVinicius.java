package usuario;

import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauan
 */
public class Corretor_CauanIgorVinicius extends Usuario_CauanIgorVinicius{
    
    protected String creci;
    protected float salario;
    protected String pis;
    protected LocalDate dataAdmissao;

    public Corretor_CauanIgorVinicius() {
    }

    public Corretor_CauanIgorVinicius(String creci, float salario, String pis, LocalDate dataAdmissao, int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String telefone, String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, telefone, email);
        this.creci = creci;
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "\nCreci: " + creci +
                "\nSalario: " + salario +
                "\nPis: " + pis +
                "Data de admissao: " + dataAdmissao;
    }
    
    
    
}
