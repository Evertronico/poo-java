package atividae1;

import javax.print.attribute.standard.JobStateReason;
import javax.swing.JOptionPane; /// dificil para caramba fazer aqui custei fazer ta everaldo 

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        
        p.setNome("alguma coisa");  
        p.setPreco(50000);  
        JOptionPane.showMessageDialog(null, "preco: " + p.getPreco() + " nome: " + p.getNome());
    }
}
