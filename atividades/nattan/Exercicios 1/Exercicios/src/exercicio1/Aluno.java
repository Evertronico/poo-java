package exercicio1;

public class Aluno {
    private String nome;
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, String matricula, double notaFinal) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (matricula == null || matricula.length() < 5) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (notaFinal < 0 || notaFinal > 10) {
            throw new IllegalArgumentException("Nota inválida");
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

