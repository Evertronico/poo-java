class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(1000);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        conta.sacar(300);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        conta.sacar(800);
        conta.depositar(-50);
        conta.sacar(-10);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}