package atividades.jhames.atividade1.src;

public class MainConta {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(1000);

        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.depositar(500);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(300);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        conta.sacar(1500); // tentativa de saque inválido
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
