package encapsulamento;

public class ContaBancaria {

    // atributos privados
    private String titular;
    private double saldo;

    // construtor
    public ContaBancaria(String titular, double saldo) {

        if (titular.isBlank()) {
            throw new IllegalArgumentException("Titular não pode estar vazio");
        }

        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }

        this.titular = titular;
        this.saldo = saldo;
    }

    // método depositar
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para seu depósito");
        }
        saldo += valor;
    }

    // método sacar
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para seu saque");
        }

        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        saldo -= valor;
    }

    // gets
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}