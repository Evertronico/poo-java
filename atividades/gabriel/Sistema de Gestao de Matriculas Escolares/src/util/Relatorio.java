package util;

import javax.swing.JOptionPane;
import modelos.Pessoa;

public class Relatorio {

    public static void exibir(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Sistema de Matrículas", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exibirErro(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void exibirRelatorioPessoa(Pessoa pessoa) {
        // Exemplo de polimorfismo, pois o método obterTipo() é abstrato em Pessoa 
        // e implementado diferentemente em Aluno, Professor e Coordenador
        String resumo = "=== Relatório de Usuário ===\n" +
                        "Tipo: " + pessoa.obterTipo() + "\n" +
                        "Nome: " + pessoa.getNome() + "\n" +
                        "CPF: " + pessoa.getCpf();
        exibir(resumo);
    }
}
