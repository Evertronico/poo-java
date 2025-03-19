package modulo4.aula4.associacao;

public class Principal {

    public static void main(String[] args) {
        // cria um objeto de curso
        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas");
        // cria um objeto de aluno
        Aluno aluno = new Aluno("Aldecir de Almeida Fonseca", curso);

        aluno.exibirInformacoes();
    }
}
