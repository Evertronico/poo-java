
package prova;
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public void exibir(String nome,double preco,int quantidade){
      System.out.println("Nome: " + nome);
      System.out.println("Preco: " + preco);
      System.out.println("Quuntidade: " + quantidade);
    }
    
    public Double valorTotal(double preco, int quantidade){
        return preco * quantidade;
        
    } 
}

public class main{
    public static void main(String[] args){
        Produto p1 = new Produto("livro", 150.0, 10);
        Produto p2 = new Produto("Caderno", 20.0, 25); 
        p1.exibir();
        System.out.println("Valor total: " + p1.valorTotal());
        System.out.println();
        p2.exibir();
        System.out.println("Valor total: " + p2.valorTotal());       
        
    }
}
