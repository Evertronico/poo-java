package modulo4.aula4.agregacao;

import java.util.List;
import javax.swing.JOptionPane;

public class Departamento {

    // atributos da classe, nome e lista de funcionários
    private String nome;
    private List<Funcionario> funcionarios;

    // método construtor - inicializa os atributos da classe
    public Departamento(
        String nome, List<Funcionario> funcionarios
    ) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void exibirInformacoes() {
        String msg = String.format(
            "Departamento: %s \n", this.nome
        );
        for (Funcionario f: this.funcionarios) {
            msg += String.format("Nome: %s\n", f.getNome());
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
