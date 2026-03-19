
package produtos;

import java.util.ArrayList; /// dificil para caramba fazer aqui custei fazer ta everaldo 
import java.util.List;
import javax.swing.JOptionPane;

public class produtos {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        
        Produto p = new Produto("notebook");
        produtos.add(p);
        Produto p2 = new Produto("notebook");
        produtos.add(p2);
        Produto p3 = new Produto("notebook");
        produtos.add(p3);

        for (int i = 0; i < produtos.size(); i++) {
            JOptionPane.showMessageDialog(
                    null, "produto: " + produtos.get(i).getNome()
            );
        }
}
