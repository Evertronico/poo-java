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

    public void exibir() {
        System.out.println( numero);
      

        cliente.exibir();
        produto.exibir();
    }
}