package atividades.jhames.atividade1.src;

import java.util.ArrayList;

public class MainListaObjetos {
    public static void main(String[] args) {

        ArrayList<Objetos> listaObjetos = new ArrayList<>();

        Objetos o1 = new Objetos("Notebook", 3500);
        Objetos o2 = new Objetos("Mouse", 120);
        Objetos o3 = new Objetos("Teclado", 200);

        listaObjetos.add(o1);
        listaObjetos.add(o2);
        listaObjetos.add(o3);

        for (Objetos objeto : listaObjetos) {
            System.out.println("Objeto: " + objeto.getNome());
            System.out.println("Preço: R$ " + objeto.getPreco());
            System.out.println("----------------------");
        }
    }
}
