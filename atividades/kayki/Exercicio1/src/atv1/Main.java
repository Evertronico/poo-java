
package atv1;


public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno", 20);
        Produto p2 = new Produto("Caneta", -5);

        System.out.println("Produto 1:");
        System.out.println(p1.getNome() + " - " + p1.getPreco());

        System.out.println("\nProduto 2:");
        System.out.println(p2.getNome() + " - " + p2.getPreco());
    }
}
