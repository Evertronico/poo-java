package atividades.jhames.atividade1.src;

public class ContaBancaria {

    private double saldo;

    // Construtor
    public ContaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        } else {
            saldo = 0;
            System.out.println("Saldo inicial inválido. Definido como 0.");
        }
    }

    // Getter do saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saque inválido. Saldo insuficiente.");
        }
    }
}
