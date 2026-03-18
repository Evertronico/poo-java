package exercicio1;

public class Funcionario {
   private String nome;
    private double salario;

    private static final double SALARIO_MINIMO = 1412;

    public Funcionario(String nome, double salario) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (salario < SALARIO_MINIMO) {
            throw new IllegalArgumentException("Salário abaixo do mínimo");
        }

        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual <= 0) {
            throw new IllegalArgumentException("Percentual inválido");
        }

        salario += salario * (percentual / 100);
    } 
}
