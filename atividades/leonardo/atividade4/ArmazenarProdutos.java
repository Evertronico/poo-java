//esse codigo eu fiz no vscode, nao no netbeans. a parte de laço de repeticao for e arrylist fiz pesquisando na internet, entao se tiver algo errado me avise.
package produtos;

import java.util.ArrayList;
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
