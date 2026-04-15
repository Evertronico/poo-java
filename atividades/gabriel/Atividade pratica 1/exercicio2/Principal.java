package exercicio2;

// Exercício 2
// Nome: Gabriel Pedrosa
// Período: 3º Período

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado Mecanico", 350.00, 15);

        System.out.println("--- Estado inicial ---");
        p1.exibirDados();

        System.out.println();
        p1.adicionarEstoque(10);
        p1.exibirDados();

        System.out.println();
        p1.removerEstoque(5);
        p1.exibirDados();

        System.out.println();
        System.out.println("Tentando remover mais do que tem:");
        p1.removerEstoque(50);

        System.out.println();
        System.out.println("Tentando adicionar negativo:");
        p1.adicionarEstoque(-3);
    }
}
