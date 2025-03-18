package modulo2.aula2;

// classe empresa | executável

import javax.swing.JOptionPane;

public class Empresa {

    // método principal
    public static void main(String[] args) {
        // solicita ao usário os dados do funcionário
        String nome = JOptionPane.showInputDialog("Informe o nome");
        float salario = Float.parseFloat(
            JOptionPane.showInputDialog("Informe o salário")
        );
        
        // cria um objeto da classe funcionário
        Funcionario f1 = new Funcionario(nome, salario);
        
        // exibe as informações do funcionário
        f1.exibirInformacoes();
    }
}
