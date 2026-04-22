public class Produto2 {
    public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public produto(String nome, Double preco,int quantidade ){
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome inválido");
        if(preco <= 0){
            throw new IllegalArgumentException("Preco invalido");
        }
        if(quantidade <= 0){
            throw new IllegalArgumentException("Quantidae invalida");
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        } 
    }
    
    public void adcionarEstoque(int quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this.quantidade += quantidade;
        }
        
    }
    public void exibir(String nome,double preco,int quantidade){
      System.out.println("Nome: " + nome);
      System.out.println("Preco: " + preco);
      System.out.println("Quuntidade: " + quantidade);
    }
    
    public double valorTotal(double preco, int quantidade){
        return preco * quantidade;
        
    } 
}

public class Main {
    public static void main(String[] args) {

        Produto2 p1 = new Produto2("Livro", 150.0, 10);
        Produto2 p2 = new Produto2("Caderno", 20.0, 25);
        p1.exibir();
        System.out.println("Valor total: " + p1.valorTotal());
        System.out.println();
        p2.exibir();
        System.out.println("Valor total: " + p2.valorTotal());
        System.out.println();
        p1.adicionarEstoque(5);
        System.out.println("Estoque:");
        p1.exibir();
    }
}
