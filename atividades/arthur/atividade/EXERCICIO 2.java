class Aluno {
    private String nome;
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, String matricula, double notaFinal) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        if (matricula == null || matricula.length() < 5) {
            throw new IllegalArgumentException("Matrícula deve ter pelo menos 5 caracteres!");
        }

        if (notaFinal < 0 || notaFinal > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10!");
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

public class Main {
    public static void main(String[] args) {
        try {
            Aluno aluno1 = new Aluno("João", "12345", 8.5);
            System.out.println("Aluno: " + aluno1.getNome());
            System.out.println("Matrícula: " + aluno1.getMatricula());
            System.out.println("Nota Final: " + aluno1.getNotaFinal());

            Aluno aluno2 = new Aluno("Maria", "123", 11);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar aluno: " + e.getMessage());
        }
    }
}