import java.util.ArrayList;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero!");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Notebook", 3500));
        listaProdutos.add(new Produto("Mouse", 80));
        listaProdutos.add(new Produto("Teclado", 150));

        System.out.println("Lista de Produtos:");
        for (Produto p : listaProdutos) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: R$ " + p.getPreco());
        }
    }
}