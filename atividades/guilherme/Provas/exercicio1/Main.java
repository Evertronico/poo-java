package exercicio1;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Arroz";
        p1.preco = 5.50;
        p1.quantidade = 10;

        Produto p2 = new Produto();
        p2.nome = "Feijao";
        p2.preco = 8.90;
        p2.quantidade = 5;

        System.out.println("=== Produto 1 ===");
        p1.exibirDados();
        System.out.println("Valor total em estoque: R$ " + p1.calcularValorTotal());

        System.out.println();

        System.out.println("=== Produto 2 ===");
        p2.exibirDados();
        System.out.println("Valor total em estoque: R$ " + p2.calcularValorTotal());
    }
}
