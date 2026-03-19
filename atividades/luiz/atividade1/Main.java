public class Main {
    public static void main(String[] args) {
        // 1. Instanciação (Criar o objeto)
        Produto p1 = new Produto();

        // 2. Definindo valores usando os SETTERS
        p1.setNome("Notebook");
        p1.setPreco(3500.00); // Valor válido

        // 3. Testando a validação (Valor inválido)
        p1.setPreco(-50.0); // Isso vai disparar o "Aviso" do nosso IF dentro do Produto.java

        // 4. Exibindo os dados usando os GETTERS
        System.out.println("--- Produto Cadastrado ---");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: R$ " + p1.getPreco());
    }
}