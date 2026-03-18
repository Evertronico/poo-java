package aluno;

import java.util.jar.JarOutputStream;

public class Aluno {
    private String nome;
    private String matricula;
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
            throw new IllegalArgumentException("Matricula deve ter pelo menos 5 caracteres");
        }
        this.matricula = matricula;
    }

    public double getNotaFinal(){
        return this.notaFinal;
    }
    public void setNotaFinal(double notaFinal){
        if (notaFinal < 0 || notaFinal > 10){
            throw new IllegalArgumentException("Nota final deve ser entre 0 e 10");
        }
        this.notaFinal = notaFinal;
    }
}
