package exercicio4;

// Exercício 4 - Classe Pedido
// Nome: Gabriel Pedrosa
// Período: 3º Período

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private Produto produto;

    public Pedido(int numeroPedido, Cliente cliente, Produto produto) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.produto = produto;
    }

    public void exibirPedido() {
        System.out.println("Pedido nº " + numeroPedido);
        System.out.println("-----------------");
        cliente.exibirDados();
        System.out.println("-----------------");
        produto.exibirDados();
        System.out.println("-----------------");
    }
}
