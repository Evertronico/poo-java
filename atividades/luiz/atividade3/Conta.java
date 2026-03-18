public class Conta {
    private String titular;
    private double saldo;

    // Construtor para estado inicial válido
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = (saldoInicial >= 0) ? saldoInicial : 0;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    // Método para transferir (O SEGREDO DA ATIVIDADE 3)
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;            // Tira de mim
            contaDestino.depositar(valor);  // Coloca no outro objeto
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
        } else {
            System.out.println("Erro: Saldo insuficiente para transferir R$ " + valor);
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo Atual: R$ " + saldo);
    }
}