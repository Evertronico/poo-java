package exercicio;

import javax.swing.JOptionPane;

public class Emprestimo {
    
    private Usuario usuario;
    private Livro livro;
    
    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
    }
    
    public void exibeDados() {
        String emprestimo = String.format("Usuario: %s%nLivro: %s%nAutor: %s",this.usuario.getNome(), this.livro.getTitulo(), this.livro.getAutor());
        
        JOptionPane.showMessageDialog(null, emprestimo);
    }
}