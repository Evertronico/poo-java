package exercicio1;

// Exercício 1
// Nome: Gabriel Pedrosa
// Período: 3º Período

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3500.00;
        p1.quantidade = 10;

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 85.50;
        p2.quantidade = 25;

        System.out.println("--- Produto 1 ---");
        p1.exibirDados();
        System.out.println("Valor em estoque: R$ " + p1.calcularValorEstoque());

        System.out.println();

        System.out.println("--- Produto 2 ---");
        p2.exibirDados();
        System.out.println("Valor em estoque: R$ " + p2.calcularValorEstoque());
    }
}
