package exercicio2;

public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;

    
    public Produto(String n, double p, int q) {
        nome = n;
        preco = p;
        quantidade = q;
    }

    
    public void adicionarEstoque(int valor) {
        quantidade = quantidade + valor;
    }

    
    public void removerEstoque(int valorTirar) {
        if (quantidade >= valorTirar) {
            quantidade = quantidade - valorTirar;
        } else {
            
            System.out.println("Erro: Nao tem essa quantidade no estoque!");
        }
    }

    
    public void imprimir() {
        System.out.println("Nome: " + nome + " | Preco: " + preco + " | Qtd: " + quantidade);
    }
}