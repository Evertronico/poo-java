package AtividadePratica1;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Nowebook", 3499.90, 5);
        Produto p2 = new Produto("Mouse",89.90, 20);

        p1.exibirDados();
        p2.exibirDados();
    }
}