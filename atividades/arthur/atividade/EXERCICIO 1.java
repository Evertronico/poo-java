class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço deve ser maior que zero!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Notebook");
        produto1.setPreco(3500.00);

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço: R$ " + produto1.getPreco());

        Produto produto2 = new Produto();
        produto2.setNome(""); 
        produto2.setPreco(-50);

        System.out.println("Produto: " + produto2.getNome());
        System.out.println("Preço: R$ " + produto2.getPreco());
    }
}