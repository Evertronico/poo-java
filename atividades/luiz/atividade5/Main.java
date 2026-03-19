public class Main {
    public static void main(String[] args) {
        // Criando um funcionário com tentativa de salário abaixo do mínimo
        Funcionario func1 = new Funcionario("Ana Silva", 1200.00);

        System.out.println("--- Dados do Funcionário ---");
        System.out.println("Nome: " + func1.getNome());
        System.out.println("Salário (Ajustado p/ Mínimo): R$ " + func1.getSalario());

        System.out.println("\n--- Testando Aumento ---");
        
        // 1. Teste de aumento válido
        func1.aumentarSalario(10.5); // Aumento de 10.5%
        System.out.println("Salário após aumento: R$ " + func1.getSalario());

        // 2. Teste de aumento inválido (Negativo)
        func1.aumentarSalario(-5.0); 
        System.out.println("Salário final (não deve mudar): R$ " + func1.getSalario());
    }
}