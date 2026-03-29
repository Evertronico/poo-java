package exemplo2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Curso {
    
    private String nome;
    private List<Aluno> alunos;
    
    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    
    public void adicioneAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public void listeAlunos() {
        StringBuilder mensagem = new StringBuilder();
        // percorre a lista de alunos
        for (Aluno a: this.alunos) {
            mensagem.append(String.format("Aluno: %s%n", a.getNome()));
        }
        JOptionPane.showMessageDialog(
                null,
                mensagem,
                "Alunos de " + this.nome,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
