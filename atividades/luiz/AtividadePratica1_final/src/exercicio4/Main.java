package exercicio4;

public class Main {
    public static void main(String[] args) {
        // Criando o cliente e o produto primeiro
        Cliente c1 = new Cliente("luiz antonio de souza", "000.111.222-33");
        Produto p1 = new Produto("Mooto", 30000.00);

        // Agora cria o pedido passando o c1 e o p1 pra dentro dele
        Pedido ped = new Pedido(5001, c1, p1);

        // resultado final
        ped.mostrarTudo();
    }
}