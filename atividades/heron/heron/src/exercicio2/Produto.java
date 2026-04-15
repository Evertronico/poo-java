package exercicio2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;

        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }

        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }
    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
            System.out.println(" Estoque adcionado ");
        } else {
            System.out.println(" invalido");
        }
    }

    public void removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("remover");
        } else {
            System.out.println("nao é possivel");
        }
    }

    public void exibirDados() {
        System.out.println( nome);
        System.out.println( preco);
        System.out.println(  quantidade);
    }
}