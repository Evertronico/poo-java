package exemplo3;

import javax.swing.JOptionPane;

public class Pedido {
    private Cliente cliente;
    private double valor;
    
    public Pedido(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }
    
    public void imprimaPedido() {
        String pedido = String.format("Cliente: %s%nValor: %.2f", this.cliente.getNome(), this.valor);
        
        JOptionPane.showMessageDialog(null, pedido);
    }
}
