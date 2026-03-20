package luiz.atividade4;

public class Main {
    public static void main(String[] args) {
        // Criando os objetos corretamente
        Funcionario f1 = new Funcionario("Carlos", 3000.0);
        Gerente g1 = new Gerente("Ana (Gerente)", 5000.0);

        System.out.println("--- Dados dos Funcionários ---");
        
        // Agora esses métodos vão funcionar!
        f1.exibirInformacoes();
        g1.exibirInformacoes();
    }
}