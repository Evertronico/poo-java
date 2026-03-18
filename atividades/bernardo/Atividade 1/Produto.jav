public class Produto {
    
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero");
        }
        
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
