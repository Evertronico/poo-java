package aluno;

import java.util.jar.JarOutputStream;

public class Aluno {
    private String nome;
    private String matricula;  /// dificil para caramba fazer aqui custei fazer ta everaldo 
    private double notaFinal;

    public Aluno(String nome, String matricula, double notaFinal) {
        setNome(nome);
        setMatricula(matricula);
        setNotaFinal(notaFinal);
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if (nome.isBlank()){
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        if (matricula.length() < 5){
            throw new IllegalArgumentException("matricula deve ter pelo menos 5 caracteires");
        }
        this.matricula = matricula;
    }

    public double getNotaFinal(){
        return this.notaFinal;
    }
    public void setNotaFinal(double notaFinal){
        if (notaFinal < 0 || notaFinal > 10){
            throw new IllegalArgumentException("nota final tem que estar entre 0 e 10");
        }
        this.notaFinal = notaFinal;
    }
}
