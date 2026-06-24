
package atv4;

 public class objeto {
    private String nome;
    private double preco;

    // Construtor simples
    public objeto(String nome, double preco) {
        this.nome = nome;
        if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}