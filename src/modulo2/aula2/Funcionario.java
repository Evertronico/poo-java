package modulo2.aula2;

// cria uma classe denominada Funcionario

import javax.swing.JOptionPane;

public class Funcionario {

    // atibutos da classe - caracteristicas
    protected String nome;
    protected float salario;

    // método construtor
    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // método que retorna o valor do salário
    public float calcularSalario() {
        return this.salario;
    }

    // método que exibe os dados do funcionário
    // Nome: José | Salário: R$ 1518,00
    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(
            null, String.format(
                "Nome: %s | Salário: R$ %.2f", this.nome, this.calcularSalario()
            )
        );
    }
}
