package empresa;

import java.util.jar.JarOutputStream;

public class Empresa {
    private String nome;
    private double salario;
    
    public String getNome(){  /// dificil para caramba fazer aqui custei fazer ta everaldo 
        return this.nome;
    }
    
    public void setNome(String nome){
        if (nome.isBlank()){
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }


    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        if (this.primeiroSalario){
            throw new IllegalArgumentException("salario ja registrado");
        }

        if (salario <= 0){
            throw new IllegalArgumentException("salario tem que ser maior que zero");
        }
        this.salario = salario;
        this.primeiroSalario = true;
    }


    public double getAumento(){
        return this.aumento;
    }

    public void setAumento(double aumento){
        if (aumento <= 0){
            throw new IllegalArgumentException("aumento tem que ser maior que zero");
        }
        this.salario = this.salario + (this.salario * aumento);
    }
}
