package exercicio4;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Joao Silva", "123.456.789-00");

        Produto p1 = new Produto("Notebook", 2500.00, 1);

        Pedido pedido1 = new Pedido(1, c1, p1);

        pedido1.exibirPedido();

        System.out.println();

        Cliente c2 = new Cliente("Maria Santos", "987.654.321-00");
        Produto p2 = new Produto("Mouse", 80.00, 3);
        Pedido pedido2 = new Pedido(2, c2, p2);

        pedido2.exibirPedido();
    }
}
