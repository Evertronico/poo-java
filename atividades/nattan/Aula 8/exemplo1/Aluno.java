package exemplo1;

import javax.swing.JOptionPane;

public class Aluno {
    
    private String nome;
    private Curso curso; // relação tem um
    
    public Aluno(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }
    
    public void imprimaDados() {
        String dados = String.format(
            "Aluno: %s\nCurso: %s", this.nome, this.curso.getNome()
        );
        JOptionPane.showMessageDialog(null, dados);
    }
}