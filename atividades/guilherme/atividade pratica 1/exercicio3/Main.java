package exercicio3;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.setNome("Arroz");
        p1.setPreco(5.50);
        p1.setQuantidade(10);

        System.out.println("=== Dados do produto ===");
        p1.exibirDados();

        System.out.println();
        System.out.println("=== Tentando preco negativo ===");
        p1.setPreco(-3.00);
        p1.exibirDados();

        System.out.println();
        System.out.println("=== Tentando quantidade negativa ===");
        p1.setQuantidade(-5);
        p1.exibirDados();

        System.out.println();
        System.out.println("=== Alteracao valida ===");
        p1.setPreco(7.90);
        p1.setQuantidade(20);
        p1.exibirDados();
    }
}
