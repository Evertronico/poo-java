package Exercicio_3;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo - valor >= 0) {
            saldo -= valor;
        }
    }
}
