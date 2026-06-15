package modelos;

public class Coordenador extends Pessoa {

    public Coordenador(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String obterTipo() {
        return "Coordenador";
    }
}
