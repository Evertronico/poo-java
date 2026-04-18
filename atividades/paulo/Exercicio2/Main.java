
package atv2;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", "12345", 8.5);
        Aluno a2 = new Aluno("Maria", "123", 11); // inválido

        System.out.println("Aluno 1:");
        System.out.println(a1.getNome() + " - " + a1.getMatricula() + " - " + a1.getNotaFinal());

        System.out.println("\nAluno 2:");
        System.out.println(a2.getNome() + " - " + a2.getMatricula() + " - " + a2.getNotaFinal());
    }
}