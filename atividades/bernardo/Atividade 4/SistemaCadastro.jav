import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SistemaCadastro {

        public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        
        Produto p = new Produto("Notebook", 3500, 10);
        
        p.venda(2);
        p.adicioneEstoque(4);
        
        JOptionPane.showMessageDialog(
            null, "Produto: " + p.getEstoque()
        );
                   
        produtos.add(new Produto("Notebook", 3500));
        produtos.add(new Produto("Mouse", 120));
        produtos.add(new Produto("Monitor", 980));
        
        for (Produto p : produtos) {
            JOptionPane.showMessageDialog(
                null, "Produto: " + p.getNome()
            );
        }
    }
}