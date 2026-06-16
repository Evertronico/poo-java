package modelos;

import interfaces.Desempenho;
import java.util.ArrayList;
import java.util.List;

public class Boletim implements Desempenho {
    private List<Double> notas;

    public Boletim() {
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    public List<Double> getNotas() {
        return notas;
    }

    @Override
    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}
