package exercicio1;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }
}
