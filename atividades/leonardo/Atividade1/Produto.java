//caso vc n tenha percebido, eu coloquei os nomes ficticios no package's so pra organizar melhor os arquivo.
package atividae1;

import java.util.jar.JarOutputStream;

public class Produto {
    private String nome;
    private double preco;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if (nome.isBlank()){
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        if (preco <= 0){
            throw new IllegalArgumentException("preco deve ser maior que zero");
        }
        this.preco = preco;
    }
}
