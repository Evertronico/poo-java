import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SistemaCadastro {
    
        public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<>();
                
        produtos.add(new Produto("Notebook", 3500));
        produtos.add(new Produto("Mouse", 120));
        produtos.add(new Produto("Monitor", 980));
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println("Lista de produtos:");
        
        for (int i = 0; i < lista.size(); i++) {
            Produto p = lista.get(i);
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: R$ " + p.getPreco());
        }
    }
}
