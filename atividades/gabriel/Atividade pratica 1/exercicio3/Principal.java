package exercicio3;

// Exercício 3
// Nome: Gabriel Pedrosa
// Período: 3º Período

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        System.out.println("--- Alterações validas ---");
        p1.setNome("Monitor 24 polegadas");
        p1.setPreco(899.90);
        p1.setQuantidade(8);
        p1.exibirDados();

        System.out.println();
        System.out.println("--- Tentando preco negativo ---");
        p1.setPreco(-100.0);
        p1.exibirDados();

        System.out.println();
        System.out.println("--- Tentando quantidade negativa ---");
        p1.setQuantidade(-5);
        p1.exibirDados();

        System.out.println();
        System.out.println("--- Alterando de novo ---");
        p1.setPreco(750.00);
        p1.setQuantidade(12);
        p1.exibirDados();
    }
}
