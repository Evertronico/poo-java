package exercicio3;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3000.0, 5);
        
        p1.exibirDados();

        System.out.println("\nAlteração válida:");
        p1.setPreco(3500.0);
        p1.setQuantidade(10);
        p1.exibirDados();

        System.out.println("\nValores inválidos:");
        p1.setPreco(-100);
        p1.setQuantidade(-5);
        p1.setNome("");

        System.out.println("\nEstado final:");
        p1.exibirDados();
    }
}