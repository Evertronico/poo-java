package exercicio2;

public class Principal {
    public static void main(String[] args) {
        // Criando o objeto com o construtor (passando os dados nos parenteses)
        Produto prod = new Produto("Televisao", 2500.0, 5);
        
        System.out.println("--- Dados Iniciais ---");
        prod.imprimir();

        // Testando a entrada de estoque
        prod.adicionarEstoque(10);
        System.out.println("Entrou 10 unidades...");
        prod.imprimir();

        // Testando a saida de estoque
        prod.removerEstoque(3);
        System.out.println("Saiu 3 unidades...");
        prod.imprimir();

        // Testando a regra de nao deixar negativo
        System.out.println("Tentando tirar 20 unidades agora...");
        prod.removerEstoque(20); 
        prod.imprimir();
    }
}