package configuracao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauan
 */
public class Configuracao_CauanIgorVinicius implements Serializable{
    
    
    
    private String arquivoAlugueis;
    private String arquivoVendas;
    private String arquivoImoveis;
    private String arquivoClientes;
    private String arquivoCorretores;
    private String arquivoSeguros;

    public Configuracao_CauanIgorVinicius() {
    }

    public Configuracao_CauanIgorVinicius(String arquivoAlugueis, String arquivoVendas, String arquivoImoveis, String arquivoClientes, String arquivoCorretores, String arquivoSeguros) {
        this.arquivoAlugueis = arquivoAlugueis;
        this.arquivoVendas = arquivoVendas;
        this.arquivoImoveis = arquivoImoveis;
        this.arquivoClientes = arquivoClientes;
        this.arquivoCorretores = arquivoCorretores;
        this.arquivoSeguros = arquivoSeguros;
    }

    public String getArquivoAlugueis() {
        return arquivoAlugueis;
    }

    public void setArquivoAlugueis(String arquivoAlugueis) {
        this.arquivoAlugueis = arquivoAlugueis;
    }

    public String getArquivoVendas() {
        return arquivoVendas;
    }

    public void setArquivoVendas(String arquivoVendas) {
        this.arquivoVendas = arquivoVendas;
    }

    public String getArquivoImoveis() {
        return arquivoImoveis;
    }

    public void setArquivoImoveis(String arquivoImoveis) {
        this.arquivoImoveis = arquivoImoveis;
    }

    public String getArquivoClientes() {
        return arquivoClientes;
    }

    public void setArquivoClientes(String arquivoClientes) {
        this.arquivoClientes = arquivoClientes;
    }

    public String getArquivoCorretores() {
        return arquivoCorretores;
    }

    public void setArquivoCorretores(String arquivoCorretores) {
        this.arquivoCorretores = arquivoCorretores;
    }

    public String getArquivoSeguros() {
        return arquivoSeguros;
    }

    public void setArquivoSeguros(String arquivoSeguros) {
        this.arquivoSeguros = arquivoSeguros;
    }
    
    
    public static <T extends Serializable> void salvarObjetos(T objeto, String arquivo)
    {
        try
        {            
            FileOutputStream fout = new FileOutputStream(arquivo);

            ObjectOutputStream oos = new ObjectOutputStream(fout);
            
            oos.writeObject(objeto);

            
        }
        catch (Exception e)
        {
            
            System.err.println("Erro ao salvar os objetos - " + arquivo);

             e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked") // Apaga a mensagem de "unchecked casting"
    public static <T extends Serializable> T lerObjetos(String arquivo)
    {
        File file = new File(arquivo);
        if (!file.exists() || file.length() == 0) {
            
            return null;
        }
        
        try{

		   FileInputStream fin = new FileInputStream(arquivo);

		   ObjectInputStream ois = new ObjectInputStream(fin);

		   T objeto = (T) ois.readObject();
           
           ois.close();
           fin.close();

           return objeto;
                   
	   }
       catch (Exception e){

		   System.out.println("Erro ao ler o objeto - retornando null ao vetor!");

            e.printStackTrace();

            return null;
	   }
    }
}
