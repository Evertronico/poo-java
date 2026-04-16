package exercicio4;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("tirar10", "222222222222");
        Produto p1 = new Produto("fio", 500000.0);

        Pedido pedido1 = new Pedido(1, c1, p1);

        pedido1.exibir();
    }
}