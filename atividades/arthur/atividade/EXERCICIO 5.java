class Funcionario {
    private String nome;
    private double salario;

    private static final double SALARIO_MINIMO = 1320.0;

    public Funcionario(String nome, double salario) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        if (salario < SALARIO_MINIMO) {
            throw new IllegalArgumentException("Salário não pode ser menor que o mínimo!");
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

    public void aplicarAumento(double percentual) {
        if (percentual < 0) {
            System.out.println("Aumento não pode ser negativo!");
            return;
        }

        double aumento = salario * (percentual / 100);
        salario += aumento;
        System.out.println("Aumento aplicado com sucesso!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Funcionario f1 = new Funcionario("Carlos", 2000);

            System.out.println("Funcionário: " + f1.getNome());
            System.out.println("Salário inicial: R$ " + f1.getSalario());

            f1.aplicarAumento(10);
            System.out.println("Salário após aumento: R$ " + f1.getSalario());
            
            f1.aplicarAumento(-5);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}