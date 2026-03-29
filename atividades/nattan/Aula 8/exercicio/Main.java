package exercicio;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nattan");
        Livro livro = new Livro("Livro qualquer", "Autor qualquer");
        Emprestimo emprestimo = new Emprestimo(usuario, livro);
        
        emprestimo.exibeDados();
    }
}
