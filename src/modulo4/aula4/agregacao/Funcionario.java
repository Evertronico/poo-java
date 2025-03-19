package modulo4.aula4.agregacao;

public class Funcionario {

    // atributo de classe - encapsulamento acessível para
    // alteração de valor apenas dentro da própria classe
    private String nome;

    // método construtor - inicializa o atributo
    public Funcionario(String nome) {
        this.nome = nome;
    }

    // retorna o atributo nome
    public String getNome() {
        return this.nome;
    }
}
