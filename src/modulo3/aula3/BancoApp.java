package modulo3.aula3;

import javax.swing.JOptionPane;

public class BancoApp {
    public static void main(String[] args) {
        ContaBancaria conta = null;
        boolean continuar = true;

        while (continuar) {
            String[] opcoes = {"Cadastrar Conta", "Depositar", "Sacar", "Consultar Saldo", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Banco Digital",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0: // Cadastrar Conta
                    String titular = JOptionPane.showInputDialog("Digite o nome do titular:");
                    double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));
                    try {
                        conta = new ContaBancaria(titular, saldoInicial);
                        JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;
                case 1: // Depositar
                    if (conta == null) {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta cadastrada!");
                        break;
                    }
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                    conta.depositar(valorDeposito);
                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                    break;
                case 2: // Sacar
                    if (conta == null) {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta cadastrada!");
                        break;
                    }
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                    if (conta.sacar(valorSaque)) {
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                    }
                    break;
                case 3: // Consultar Saldo
                    if (conta == null) {
                        JOptionPane.showMessageDialog(null, "Nenhuma conta cadastrada!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + conta.getSaldo());
                    }
                    break;
                case 4: // Sair
                    continuar = false;
                    break;
            }

            if (continuar) {
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (resposta != JOptionPane.YES_OPTION) {
                    continuar = false;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso banco!");
    }
}
