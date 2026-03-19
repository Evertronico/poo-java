package atividades.jhames.atividade1.src;

public class MainProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500);
        Produto p2 = new Produto("Mouse", 120);

        System.out.println("Produto 1: " + p1.getNome() + " - R$ " + p1.getPreco());
        System.out.println("Produto 2: " + p2.getNome() + " - R$ " + p2.getPreco());

    }
}