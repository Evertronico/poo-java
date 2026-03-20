package luiz.atividade4;

// Gerente herda tudo de Funcionario
public class Gerente extends Funcionario {

    // Construtor: Recebe os dados e repassa para a classe pai (super)
    public Gerente(String nome, double salario) {
        super(nome, salario); 
    }

    // Sobrescrevemos o método para identificar que é um Gerente
    @Override
    public void exibirInformacoes() {
        System.out.println("Gerente: " + this.nome + " | Salário: R$ " + this.salario);
    }
}