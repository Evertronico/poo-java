package modulo4.aula4.associacao;

import javax.swing.JOptionPane;

public class Aluno {

    // atributos da classe aluno
    private String nome;
    private Curso curso;

    // método construtor - inicializa os atributos
    public Aluno(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    // método para imprimir na tela os dados do aluno
    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(
            null, String.format("Aluno: %s | Curso: %s", 
                this.nome, curso.getNome())
        );
    }
}
