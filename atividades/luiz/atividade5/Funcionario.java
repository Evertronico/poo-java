public class Funcionario {
    // Atributos privados para garantir o encapsulamento
    private String nome;
    private double salario;
    private final double SALARIO_MINIMO = 1412.00; // Valor de referência

    // Construtor: Já nasce validando o salário mínimo
    public Funcionario(String nome, double salarioInicial) {
        this.nome = nome;
        if (salarioInicial < SALARIO_MINIMO) {
            this.salario = SALARIO_MINIMO;
        } else {
            this.salario = salarioInicial;
        }
    }

    // Método para aumento percentual com trava de segurança
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            double aumento = this.salario * (percentual / 100);
            this.salario += aumento;
            System.out.println("Aumento de " + percentual + "% aplicado com sucesso.");
        } else {
            System.out.println("Erro: Não é permitido aumento negativo ou nulo.");
        }
    }

    // Métodos Getter para acessar os dados privados
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}