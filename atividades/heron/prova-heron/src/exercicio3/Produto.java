package exercicio3;

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
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preco invalido");
        }
    }

    public int getQuantidade() {
        return quantidade;
    
    
    
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade invalida");
             }
    }

    public void exibirDados() {
        System.out.println(    nome  );
        System.out.println(  preco);
        System.out.println(  quantidade);
    }
}