package exemplo1;

public class Main {
    public static void main(String[] args) {
    
        // objeto da classe curso
        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas");
        // objeto da classe aluno
        Aluno aluno = new Aluno("Elon", curso);
    
        aluno.imprimaDados();
    }
}