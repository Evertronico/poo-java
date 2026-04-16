package exercicio2;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("teclado", 120.00, 10);

        p1.exibirDados();

        p1.adicionarEstoque(5);
        p1.exibirDados();
        p1.removerEstoque(8);
        p1.exibirDados();

        p1.removerEstoque(20);
        p1.exibirDados();
    }
}