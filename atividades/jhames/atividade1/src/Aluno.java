package atividades.jhames.atividade1.src;

public class Aluno {

    private String nome;
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, String matricula, double notaFinal) {

        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido.");
            return;
        }

        if (matricula == null || matricula.length() < 5) {
            System.out.println("Matrícula deve ter pelo menos 5 caracteres.");
            return;
        }

        if (notaFinal < 0 || notaFinal > 10) {
            System.out.println("Nota deve estar entre 0 e 10.");
            return;
        }

        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
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
