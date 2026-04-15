package exercicio2;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int qtd) {
        quantidade = quantidade + qtd;
        System.out.println(qtd + " unidades adicionadas ao estoque.");
    }

    public void removerEstoque(int qtd) {
        if (qtd > quantidade) {
            System.out.println("Erro: estoque insuficiente. Estoque atual: " + quantidade);
        } else {
            quantidade = quantidade - qtd;
            System.out.println(qtd + " unidades removidas do estoque.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
