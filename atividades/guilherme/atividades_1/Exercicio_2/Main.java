package Exercicio_2;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao", "12345", 8.5);
        System.out.println(a1.getNome());
        System.out.println(a1.getMatricula());
        System.out.println(a1.getNotaFinal());

        Aluno a2 = new Aluno("Maria", "123", 15.0);
        System.out.println(a2.getNome());
        System.out.println(a2.getMatricula());
        System.out.println(a2.getNotaFinal());
    }
}
