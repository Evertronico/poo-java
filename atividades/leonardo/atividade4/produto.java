package atividae1;

import java.util.jar.JarOutputStream;

public class Produto {
    private String nome;
    private double preco;
    
    public String getNome(){
        return this.nome;
    }

    public Produto(String nome{
        if (nome.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }
    
}
