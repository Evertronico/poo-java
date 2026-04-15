package exercicio4;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibir() {
        System.out.println(nome);
        System.out.println("CPF: " + cpf);
    }
}