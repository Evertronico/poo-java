package exemplo2;

public class Main {
    public static void main(String[] args) {
        // objeto curso
        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas");
        
        // objetos da classe alunos diretamente no curso
        curso.adicioneAluno(new Aluno("Ana"));
        curso.adicioneAluno(new Aluno("Pedro"));
        curso.adicioneAluno(new Aluno("João"));
        curso.adicioneAluno(new Aluno("Maria"));
        
        curso.listeAlunos();
    }
}
