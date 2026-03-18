package exercicio1;

import javax.swing.JOptionPane;

public class MainProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3500);
        
        JOptionPane.showMessageDialog(null, "Preço: " + p.getPreco());
    }
}
