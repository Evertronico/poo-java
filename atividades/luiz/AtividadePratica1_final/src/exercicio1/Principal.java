package exercicio1;

public class Principal {
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 5390.00;
        p1.quantidade = 30;

        
        Produto p2 = new Produto();
        p2.nome = "Mose Sem Fioooo de alta qualidade gamer";
        p2.preco = 250.90;
        p2.quantidade = 50;

        
        Produto p3 = new Produto();
        p3.nome = "monitor 40";
        p3.preco = 599.30;
        p3.quantidade = 71;
        
        Produto p4 = new Produto();
        p4.nome = "placa de video de alta qualidade nvideo 20000gtx";
        p4.preco = 7009.00;
        p4.quantidade = 500;

        System.out.println("--- DADOS DOS PRODUTOS ---");
        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
        p4.exibirDados();
    }
}