package modelos;

public class Professor extends Pessoa {

    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String obterTipo() {
        return "Professor";
    }
}
