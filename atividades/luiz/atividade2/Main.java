public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- TESTE 1: DADOS VÁLIDOS ---");
        // Criando um aluno que atende aos requisitos (Matrícula >= 5 e Nota entre 0 e 10)
        Aluno aluno1 = new Aluno("Luiz Silva", "123456", 8.5);
        aluno1.exibirDados();

        System.out.println("\n--- TESTE 2: DADOS INVÁLIDOS ---");
        // Criando um aluno com erro: matrícula curta (2 letras) e nota impossível (15)
        // O construtor vai validar e aplicar os valores padrão que definimos
        Aluno aluno2 = new Aluno("João Erro", "AB", 15.0);
        aluno2.exibirDados();
        
    }
}