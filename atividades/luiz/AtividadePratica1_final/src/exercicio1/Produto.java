package exercicio1;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double calcularTotalEstoque() {
        return preco * quantidade;
    }

    
    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total em estoque: R$ " + calcularTotalEstoque());
        System.out.println("----------------------------");
    }
}