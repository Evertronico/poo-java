package exercicio4;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
    }
}
