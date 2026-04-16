package exercicio2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        //regras para inicializacao dos atributos
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior do que zero");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
    
    public double calcularValorTotal() {
        return preco * quantidade;
    }
    
    public void addEstoque(int qtd) {
        if (qtd <= 0) {
            System.out.println("Quantidade inválida");
            return;
        }
        quantidade += qtd;
    } 
    
    public void removeEstoque(int qtd) {
        if (qtd <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }
        if (qtd > quantidade) {
            System.out.println("Valor maior do que o estoque.");
        }
        quantidade -= qtd;
    }
    
}
