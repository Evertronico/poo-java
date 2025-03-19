package modulo4.aula4.associacao;

public class Curso {

    // atributo nome escapsulado - privado
    private String nome;

    // método construtor - inicializa o atributo
    public Curso(String nome) {
        this.nome = nome;
    }

    // método de leitura do nome do curso
    public String getNome() {
        return this.nome;
    }
}
