package modelos;

public class Aluno extends Pessoa {

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String obterTipo() {
        return "Aluno";
    }
}
