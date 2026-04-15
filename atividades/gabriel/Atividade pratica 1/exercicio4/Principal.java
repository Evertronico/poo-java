package exercicio4;

// Exercício 4
// Nome: Gabriel Pedrosa
// Período: 3º Período

public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gabriel Pedrosa", "123.456.789-00");
        Produto p1 = new Produto("Headset Gamer", 250.00, 1);

        Pedido pedido1 = new Pedido(1001, c1, p1);
        pedido1.exibirPedido();

        System.out.println();

        Cliente c2 = new Cliente("Ana Silva", "987.654.321-00");
        Produto p2 = new Produto("Webcam HD", 189.90, 2);

        Pedido pedido2 = new Pedido(1002, c2, p2);
        pedido2.exibirPedido();
    }
}
