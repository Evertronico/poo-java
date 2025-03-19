package modulo4.aula4.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Alexandre");
        Funcionario f2 = new Funcionario("Ana");

        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(f1);
        listaFuncionarios.add(f2);

        Departamento departamento = new Departamento("ADS", listaFuncionarios);

        departamento.exibirInformacoes();
    }
}
