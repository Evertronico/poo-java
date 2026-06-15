package modelos;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private Boletim boletim;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.boletim = new Boletim();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Boletim getBoletim() {
        return boletim;
    }

    public String gerarResumo() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("Matrícula:\n");
        resumo.append("Aluno: ").append(aluno.getNome()).append(" (CPF: ").append(aluno.getCpf()).append(")\n");
        resumo.append("Disciplina: ").append(disciplina.getNome()).append(" - ").append(disciplina.getCargaHoraria()).append("h\n");
        resumo.append("Notas: ").append(boletim.getNotas()).append("\n");
        resumo.append(String.format("Média Final: %.2f", boletim.calcularMedia()));
        return resumo.toString();
    }
}
