public class ContaBancaria {

    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular, double saldo) {
        if (titular.isBlank()) {
            throw new IllegalArgumentException("Titular inválida");
        }

        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void deposite(double valor) {
        if (valor <=0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.saldo += valor;
    }
    
    private void saque(double valor) {
        if (valor <= 0 || valor > this.saldo) {
            throw new IllegalArgumentException("Operação inválida");
        }
        this.saldo -= valor;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
}
