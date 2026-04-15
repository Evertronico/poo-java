package exercicio4;

public class Pedido {

    int numeroPedido;
    Cliente cliente;
    Produto produto;

    public Pedido(int numeroPedido, Cliente cliente, Produto produto) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.produto = produto;
    }

    public void exibirPedido() {
        System.out.println("=== Pedido N. " + numeroPedido + " ===");
        cliente.exibirDados();
        produto.exibirDados();
        double total = produto.preco * produto.quantidade;
        System.out.println("Valor total: R$ " + total);
    }
}
