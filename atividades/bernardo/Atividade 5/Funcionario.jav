class Funcionario {

    private String nome;
    private double salario;

    private static final double salarioMinimo = 1320.0;

    public Funcionario(String nome, double salario) {
        if (salario < salarioMinimo) {
            throw new IllegalArgumentException("Salário abaixo do mínimo!");
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
        if (percentual < 0) {
            System.out.println("Erro: aumento não pode ser negativo!");
            return;
        }

        salario += salario * (percentual / 100);
    }
}