public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Bernardo", 2000);

        System.out.println("Salário inicial: " + f1.getSalario());

        f1.aumentarSalario(10);

        System.out.println("Salário após aumento: " + f1.getSalario());
    }
}