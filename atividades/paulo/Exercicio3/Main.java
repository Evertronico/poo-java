
package atv3;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        try {
            conta.depositar(100);
            conta.sacar(30);

            System.out.println("Saldo atual: " + conta.getSaldo());

            conta.sacar(100); 

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
