package Exercicio_3;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        conta.depositar(200.0);
        System.out.println(conta.getSaldo());
        
        conta.sacar(50.0);
        System.out.println(conta.getSaldo());
        
        conta.sacar(300.0);
        System.out.println(conta.getSaldo());
    }
}
