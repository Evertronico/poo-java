public class Main {
    public static void main(String[] args) {
        // Criando duas contas diferentes
        Conta contaLuiz = new Conta("Luiz", 1000.00);
        Conta contaProfessor = new Conta("Professor", 100.00);

        System.out.println("--- Saldo Inicial ---");
        contaLuiz.exibirSaldo();
        contaProfessor.exibirSaldo();

        System.out.println("\n--- Realizando Transferência ---");
        // Luiz transfere 300 para o Professor
        contaLuiz.transferir(300.00, contaProfessor);

        System.out.println("\n--- Saldo Final ---");
        contaLuiz.exibirSaldo();
        contaProfessor.exibirSaldo();
    }
}