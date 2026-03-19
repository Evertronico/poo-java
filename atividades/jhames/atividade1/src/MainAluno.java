package atividades.jhames.atividade1.src;

public class MainAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Carlos", "12345", 8.5);
        Aluno aluno2 = new Aluno("Ana", "98765", 9.2);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nota Final: " + aluno1.getNotaFinal());

        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Nota Final: " + aluno2.getNotaFinal());

    }
}
