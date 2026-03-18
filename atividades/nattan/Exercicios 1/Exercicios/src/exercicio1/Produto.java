package exercicio1;

public class Produto {

    public Produto(String notebook, int par) {
    }
    private String nome;
    private double preco;
    
    public String getNome() {
        return nome;
    }
    
     public double getPreco() {
        return this.preco;
    }
    
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome Inválido");
        }
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }
        this.preco = preco;
    }
}