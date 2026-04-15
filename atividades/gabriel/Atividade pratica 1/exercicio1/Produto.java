package exercicio1;

// Exercício 1 - Classe Produto
// Nome: Gabriel Pedrosa
// Período: 3º Período

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }
}
