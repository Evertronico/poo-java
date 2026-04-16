package exercicio1;

public class Main {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 3000.0, 5);
        Produto p2 = new Produto("Mouse", 50.0, 10);
        
        p1.exibirDados();
        System.out.println("Valor total: " + p1.calcularValorTotal());
        
        System.out.println("=======================");
        
        p2.exibirDados();
        System.out.println("Valor total: " + p2.calcularValorTotal());
    }
}