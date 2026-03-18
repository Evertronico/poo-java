package Exercicio_2;

public class Aluno {
    private String nome;
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, String matricula, double notaFinal) {
        this.nome = nome;
        
        if (matricula != null && matricula.length() >= 5) {
            this.matricula = matricula;
        } else {
            this.matricula = "00000";
        }

        if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        } else {
            this.notaFinal = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}
