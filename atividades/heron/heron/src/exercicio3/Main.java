package exercicio3;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("fio", 50.0, 10);

        p1.exibirDados();

        p1.setPreco(80);
        p1.setQuantidade(15);
        p1.exibirDados();

        p1.setPreco(-10);
        p1.setQuantidade(-5);
        p1.exibirDados();
    }
}