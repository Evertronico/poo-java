package Exercicio_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        Produto p1 = new Produto("Teclado", 150.0);
        Produto p2 = new Produto("Mouse", 80.0);
        Produto p3 = new Produto("Monitor", 1200.0);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (int i = 0; i < lista.size(); i++) {
            Produto p = lista.get(i);
            System.out.println(p.getNome() + " - " + p.getPreco());
        }
    }
}
