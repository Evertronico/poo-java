package atividae1;

import javax.print.attribute.standard.JobStateReason;
import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        
        p.setNome("alguma coisa");  
        p.setPreco(50000);  
        JOptionPane.showMessageDialog(null, "preco: " + p.getPreco() + " nome: " + p.getNome());
    }
}
