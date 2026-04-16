package exercicio3;

public class Principal {
    public static void main(String[] args) {
        Produto p = new Produto();

        
        System.out.println("--- Teste 1: Valores Certos ---");
        p.setNome("Tecladooo Gamer azull");
        p.setPreco(250.0);
        p.setQuantidade(30);
        System.out.println("Produto: " + p.getNome() + " | R$ " + p.getPreco());

        // Tentativa 2: Coisas erradas (o sistema tem que barrar)
        System.out.println("\n--- Teste 2: Valores Errados ---");
        
        System.out.print("Tentando preco -50: ");
        p.setPreco(-50.0); // Vai dar erro no console
        
        System.out.print("Tentando qtd -5: ");
        p.setQuantidade(-5); // Vai dar erro no console

        // Mostrando que o objeto CONTINUA com os valores antigos (consistência)
        System.out.println("\n--- Dados Finais (nao mudaram com os erros) ---");
        System.out.println("Preco atual: " + p.getPreco());
        System.out.println("Qtd atual: " + p.getQuantidade());
    }
}