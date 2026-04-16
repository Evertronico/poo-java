package exercicio3;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }
    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome inválido");
            return;
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço não pode ser negativo");
            return;
        }
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade não pode ser negativa");
            return;
        }
        this.quantidade = quantidade;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
