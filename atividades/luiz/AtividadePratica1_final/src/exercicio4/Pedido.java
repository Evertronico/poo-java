package exercicio4;

public class Pedido {
    public int numero;
    public Cliente cliente; // Aqui liga com a classe Cliente
    public Produto produto; // Aqui liga com a classe Produto

    public Pedido(int num, Cliente c, Produto p) {
        this.numero = num;
        this.cliente = c;
        this.produto = p;
    }

    public void mostrarTudo() {
        System.out.println("--- NOTA FISCAL DO PEDIDO " + numero + " ---");
        System.out.println("Cliente: " + cliente.nome + " | CPF: " + cliente.cpf);
        System.out.println("Item: " + produto.nomeProd + " | Valor: R$ " + produto.precoProd);
        System.out.println("---------------------------------------");
    }
}