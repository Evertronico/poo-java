import javax.swing.JOptionPane;

public class Programa {
    
    public static void main(String[] args){
        Produto p = new Produto();

        p.setNome("Celular");
        p.setPreco(5000);
        JOptionPane.showMessageDialog(null, "Preço: " + p.getPreco());

        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preço: R$ " + p.getPreco());
    }
}