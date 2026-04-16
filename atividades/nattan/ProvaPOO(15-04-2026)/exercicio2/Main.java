package exercicio2;

public class Main {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 3000.0, 5);
        
        p1.exibirDados();
        System.out.println("Valor total: " + p1.calcularValorTotal());
        
        System.out.println("\nAdd 5 Unidades");
        p1.addEstoque(5);
        p1.exibirDados();
        
        System.out.println("\nRemove 3 Unidades");
        p1.removeEstoque(3);
        p1.exibirDados();
        
        System.out.println("\nTeste da regra de validação");
        p1.removeEstoque(20);
        p1.exibirDados();
    }
}

