package AtividadePratica1;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDados() {
        System.out.println(nome);
        System.out.println( preco);
        System.out.println( quantidade);
        System.out.println(calcularTotalEstoque());
    }

    public double calcularTotalEstoque() {
        return preco *  quantidade;
    }

    public String getNome()      { return nome; }
    public double getPreco()     { return preco; }
    public int getQuantidade()   { return quantidade; }
}