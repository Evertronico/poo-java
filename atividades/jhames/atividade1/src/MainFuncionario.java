package atividades.jhames.atividade1.src;

public class MainFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Carlos", 2000);
        Funcionario f2 = new Funcionario("Ana", 1500);

        System.out.println("Funcionário: " + f1.getNome());
        System.out.println("Salário: R$ " + f1.getSalario());

        f1.aumentarSalario(10);

        System.out.println("Salário após aumento: R$ " + f1.getSalario());

        System.out.println();

        System.out.println("Funcionário: " + f2.getNome());
        System.out.println("Salário: R$ " + f2.getSalario());

        f2.aumentarSalario(-5); // tentativa inválida
    }
}
