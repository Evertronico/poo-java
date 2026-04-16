package exercicio3;

public class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;

    
    public Produto() {
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

    public void setPreco(double p) {
        
        if (p >= 0) {
            this.preco = p;
        } else {
            System.out.println("Erro: Nao existe preco negativo!!!!");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int q) {
       
        if (q >= 0) {
            this.quantidade = q;
        } else {
            System.out.println("Erro: Qtd nao pode ser menor que zerooooo!");
        }
    }
}