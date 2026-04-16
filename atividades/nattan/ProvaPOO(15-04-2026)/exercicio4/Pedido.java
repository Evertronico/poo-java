
package exercicio4;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private Produto produto;

    public Pedido(int numero, Cliente cliente, Produto produto) {
        this.numero = numero;
        this.cliente = cliente;
        this.produto = produto;
    }

    public void exibirPedido() {
        System.out.println("Pedido Numero: " + numero);
        cliente.exibirDados();
        produto.exibirDados();
    }
}
