package exercicio1;

import java.util.ArrayList;

public class SistemaProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        Produto p1 = new Produto("Notebook", 3500);
        p1.setNome("Mouse");
        p1.setPreco(50);

        Produto p2 = new Produto("Notebook", 3500);
        p2.setNome("Teclado");
        p2.setPreco(120);

        Produto p3 = new Produto("Notebook", 3500);
        p3.setNome("Monitor");
        p3.setPreco(900);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Produto p : lista) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: " + p.getPreco());
            System.out.println("------------------");
        }
    }
}
