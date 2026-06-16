public class produto3 {
    private String nome;
    private double preco;
    private int quantidade;
    
    public produto(String nome, Double preco,int quantidade){
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
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setNome(int quantidade){
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return nome;
    }
    public Double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
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
    
public class Main {
    public static void main(String[] args) {

        Produto3 p1 = new Produto3("Livro", 150.0, 10);
        p1.exibir();
        System.out.println("Valor total: " + p1.valorTotal());
        System.out.println();
        p1.setPreco(200.0);
        p1.adicionarEstoque(5);
        System.out.println("Após alterações:");
        p1.exibir();
        System.out.println();
        Produto3 p2 = new Produto3("", -10, 0);
    }
}