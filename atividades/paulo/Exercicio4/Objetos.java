
package atv4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando a lista de objetos
        ArrayList<objeto> lista = new ArrayList<>();

        // Adicionando objetos
        lista.add(new objeto("Notebook", 3000));
        lista.add(new objeto("Mouse", 100));
        lista.add(new objeto("Teclado", -50)); // preço inválido vira 0

        // Percorrendo a lista com laço for
        for (int i = 0; i < lista.size(); i++) {
            objeto o = lista.get(i);
            System.out.println("Objeto: " + o.getNome() + " - R$ " + o.getPreco());
        }
    }
}