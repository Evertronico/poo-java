package modulo3.aula3;

import javax.swing.JOptionPane;

class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        setTitular(titular);
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.length() >= 3) {
            this.titular = titular;
        } else {
            throw new IllegalArgumentException("O nome do titular deve ter pelo menos 3 caracteres.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            JOptionPane.showMessageDialog(null, "O valor do depósito deve ser positivo.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor inválido para saque.");
            return false;
        }
    }
}
