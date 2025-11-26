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
public class Cliente_CauanIgorVinicius extends Usuario_CauanIgorVinicius{
    
    protected LocalDate dataCadastro;

    public Cliente_CauanIgorVinicius() {
    }

    public Cliente_CauanIgorVinicius(LocalDate dataCadastro, int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String telefone, String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, telefone, email);
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return super.toString() + 
              "\nData de cadastro: " + dataCadastro;
    }
    
    
    
}
