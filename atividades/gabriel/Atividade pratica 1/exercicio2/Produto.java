package exercicio2;

// Exercício 2 - Classe Produto
// Nome: Gabriel Pedrosa
// Período: 3º Período

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
        if (qtd > 0) {
            quantidade = quantidade + qtd;
            System.out.println(qtd + " unidades adicionadas");
        } else {
            System.out.println("Quantidade invalida");
        }
    }

    public void removerEstoque(int qtd) {
        if (qtd <= 0) {
            System.out.println("Quantidade invalida");
        } else if (qtd > quantidade) {
            System.out.println("Estoque insuficiente");
        } else {
            quantidade = quantidade - qtd;
            System.out.println(qtd + " unidades removidas");
        }
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + (preco * quantidade));
    }
}
