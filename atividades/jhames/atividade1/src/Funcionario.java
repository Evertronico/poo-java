package atividades.jhames.atividade1.src;

public class Funcionario {

    private String nome;
    private double salario;

    // Salário mínimo
    private static final double SALARIO_MINIMO = 1320.00;

    // Construtor
    public Funcionario(String nome, double salario) {

        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }

        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            System.out.println("Salário abaixo do mínimo. Definido como salário mínimo.");
            this.salario = SALARIO_MINIMO;
        }
    }

    // Getter nome
    public String getNome() {
        return nome;
    }

    // Getter salário
    public double getSalario() {
        return salario;
    }

    // Método de aumento percentual
    public void aumentarSalario(double percentual) {

        if (percentual > 0) {
            salario += salario * (percentual / 100);
            System.out.println("Aumento aplicado.");
        } else {
            System.out.println("Aumento inválido.");
        }
    }
}
