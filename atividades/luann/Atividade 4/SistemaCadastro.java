

package aula7;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Sistemacadastro {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500, 10));
        produtos.add(new Produto("Mouse", 120, 50));
        produtos.add(new Produto("Monitor", 980, 20));

        Produto p = produtos.get(0); // Notebook
        p.venda(8);                  // vende 8 unidades
        p.adicioneEstoque(12);       // adiciona 12 unidades

        JOptionPane.showMessageDialog(null, "Estoque do " + p.getNome() + ": " + p.getEstoque());

        // Exibir todos os produtos
       // for (Produto prod : produtos) {
          //  JOptionPane.showMessageDialog(
           //         null,
           //         "Produto: " + prod.getNome() +
           //         "\nPreço: R$ " + prod.getPreco() +
           //         "\nEstoque: " + prod.getEstoque()
           // );
        //}
    }
}