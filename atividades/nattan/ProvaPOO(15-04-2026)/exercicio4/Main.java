package exercicio4;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Nattan", "123.456.789-00");
        Produto p1 = new Produto("Notebook", 3500.0);

        Pedido pedido1 = new Pedido(1, c1, p1);

        pedido1.exibirPedido();
    }
}