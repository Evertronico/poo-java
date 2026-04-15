package exercicio4;

// Exercício 4 - Classe Cliente
// Nome: Gabriel Pedrosa
// Período: 3º Período

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void exibirDados() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
