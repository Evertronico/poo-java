public class Aluno {
    private String nome;
    private String matricula;
    private double notaFinal;

    // Construtor com Validação
    public Aluno(String nome, String matricula, double notaFinal) {
        this.nome = nome;

        // Validação da Matrícula (mínimo 5 caracteres)
        if (matricula.length() >= 5) {
            this.matricula = matricula;
        } else {
            this.matricula = "00000"; // Valor padrão de erro
            System.out.println("Erro: Matrícula inválida! Deve ter 5+ caracteres.");
        }

        // Validação da Nota (entre 0 e 10)
        if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        } else {
            this.notaFinal = 0; // Valor padrão de segurança
            System.out.println("Erro: Nota deve ser entre 0 e 10. Definida como 0.");
        }
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("--- Dados do Aluno ---");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Final: " + notaFinal);
    }
}