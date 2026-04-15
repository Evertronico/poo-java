package exercicio2;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Arroz", 5.50, 10);

        System.out.println("=== Estado inicial ===");
        p1.exibirDados();

        System.out.println();
        p1.adicionarEstoque(5);
        p1.exibirDados();

        System.out.println();
        p1.removerEstoque(3);
        p1.exibirDados();

        System.out.println();
        p1.removerEstoque(20);
        p1.exibirDados();
    }
}
