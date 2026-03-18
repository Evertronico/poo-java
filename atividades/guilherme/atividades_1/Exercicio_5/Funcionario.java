package Exercicio_5;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salarioAtual) {
        this.nome = nome;
        if (salarioAtual >= 1412.0) {
            this.salario = salarioAtual;
        } else {
            this.salario = 1412.0;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aplicarAumento(double percentual) {
        if (percentual > 0) {
            double aumento = (salario * percentual) / 100;
            salario += aumento;
        }
    }
}
