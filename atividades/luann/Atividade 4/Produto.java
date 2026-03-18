

package aula7;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero");
        }
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque inválido");
        }
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // get e set 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void adicioneEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida.");
        }
        this.estoque += quantidade;
    }

    public void venda(int quantidade) {
        if (quantidade <= 0 || quantidade > estoque) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.estoque -= quantidade;
    }
}