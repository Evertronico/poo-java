public class Aluno {

    private String nome;
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, String matricula, double notaFinal) {

        if (matricula.length() < 5) {
            System.out.println("Erro: matrícula inválida!");
            return;
        }

        if (notaFinal < 0 || notaFinal > 10) {
            System.out.println("Erro: nota inválida!");
            return;
        }
    }

    this.nome = nome;
    this.matricula = matricula;
    this.notaFinal = notaFinal;

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