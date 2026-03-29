package exemplo3;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria");
        Pedido pedido = new Pedido(cliente, 250);
        
        pedido.imprimaPedido();
    }
}
