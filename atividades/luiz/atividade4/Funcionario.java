package luiz.atividade4;

public class Funcionario {
    // Atributos protegidos para que a classe Gerente possa acessar
    protected String nome;
    protected double salario;

    // Construtor: Prepara o objeto com nome e salário
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // O método que o seu Main está "reclamando" que não existe
    public void exibirInformacoes() {
        System.out.println("Funcionário: " + this.nome + " | Salário: R$ " + this.salario);
    }
}