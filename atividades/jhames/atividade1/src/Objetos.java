package atividades.jhames.atividade1.src;

public class Objetos {

    private String nome;
    private double preco;

    public Objetos(String nome, double preco) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }

        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço deve ser maior que zero.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
