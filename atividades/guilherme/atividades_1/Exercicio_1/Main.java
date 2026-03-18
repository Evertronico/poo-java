package Exercicio_1;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();

        p.setNome("Notebook");
        p.setPreco(3500.0);

        System.out.println(p.getNome());
        System.out.println(p.getPreco());

        p.setPreco(-50.0);
        System.out.println(p.getPreco());
    }
}
