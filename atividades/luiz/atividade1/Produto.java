
public class Produto {
    private String nome;
    private double preco;

    // Métodos Getter e Setter para o Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos Getter e Setter para o Preço
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Aviso: Preço inválido (negativo)!");
        }
    }
}