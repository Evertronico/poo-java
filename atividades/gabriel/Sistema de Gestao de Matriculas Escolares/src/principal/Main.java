package principal;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import modelos.Aluno;
import modelos.Professor;
import modelos.Coordenador;
import modelos.Disciplina;
import modelos.Matricula;
import modelos.Pessoa;
import util.Relatorio;

public class Main {
    private static List<Pessoa> pessoas = new ArrayList<>();
    private static List<Disciplina> disciplinas = new ArrayList<>();
    private static List<Matricula> matriculas = new ArrayList<>();

    public static void main(String[] args) {
        boolean rodando = true;

        while (rodando) {
            String menu = "=== Sistema de Gestão de Matrículas ===\n"
                    + "1. Cadastrar Pessoa\n"
                    + "2. Cadastrar Disciplina\n"
                    + "3. Realizar Matrícula\n"
                    + "4. Registrar Notas\n"
                    + "5. Exibir Relatório de Usuário (Polimorfismo)\n"
                    + "6. Exibir Relatório Geral do Aluno\n"
                    + "0. Sair\n\n"
                    + "Escolha uma opção:";

            String opcaoStr = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);
            
            if (opcaoStr == null) {
                break; // Usuário cancelou
            }

            int opcao = -1;
            try {
                opcao = Integer.parseInt(opcaoStr);
            } catch (NumberFormatException e) {
                Relatorio.exibirErro("Opção inválida!");
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    cadastrarDisciplina();
                    break;
                case 3:
                    realizarMatricula();
                    break;
                case 4:
                    registrarNotas();
                    break;
                case 5:
                    exibirRelatorioUsuario();
                    break;
                case 6:
                    exibirRelatorioGeral();
                    break;
                case 0:
                    rodando = false;
                    break;
                default:
                    Relatorio.exibirErro("Opção inválida!");
            }
        }
    }

    private static void cadastrarPessoa() {
        Object[] tipos = {"Aluno", "Professor", "Coordenador"};
        String tipoSelecionado = (String) JOptionPane.showInputDialog(null, 
                "Selecione o tipo de pessoa:", 
                "Cadastro de Pessoa", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                tipos, 
                tipos[0]);

        if (tipoSelecionado == null) return;

        String nome = JOptionPane.showInputDialog("Informe o nome:");
        if (nome == null || nome.trim().isEmpty()) return;

        String cpf = JOptionPane.showInputDialog("Informe o CPF:");
        if (cpf == null || cpf.trim().isEmpty()) return;

        Pessoa novaPessoa = null;
        if (tipoSelecionado.equals("Aluno")) {
            novaPessoa = new Aluno(nome, cpf);
        } else if (tipoSelecionado.equals("Professor")) {
            novaPessoa = new Professor(nome, cpf);
        } else if (tipoSelecionado.equals("Coordenador")) {
            novaPessoa = new Coordenador(nome, cpf);
        }

        if (novaPessoa != null) {
            pessoas.add(novaPessoa);
            Relatorio.exibir("Pessoa cadastrada com sucesso!");
        }
    }

    private static void cadastrarDisciplina() {
        String nome = JOptionPane.showInputDialog("Informe o nome da disciplina:");
        if (nome == null || nome.trim().isEmpty()) return;

        String cargaStr = JOptionPane.showInputDialog("Informe a carga horária:");
        if (cargaStr == null || cargaStr.trim().isEmpty()) return;

        try {
            int cargaHoraria = Integer.parseInt(cargaStr);
            Disciplina disciplina = new Disciplina(nome, cargaHoraria);
            disciplinas.add(disciplina);
            Relatorio.exibir("Disciplina cadastrada com sucesso!");
        } catch (NumberFormatException e) {
            Relatorio.exibirErro("Carga horária inválida!");
        }
    }

    private static void realizarMatricula() {
        if (pessoas.isEmpty() || disciplinas.isEmpty()) {
            Relatorio.exibirErro("É necessário ter pelo menos um aluno e uma disciplina cadastrados.");
            return;
        }

        // Filtrar apenas alunos
        List<Aluno> alunos = new ArrayList<>();
        for (Pessoa p : pessoas) {
            if (p instanceof Aluno) {
                alunos.add((Aluno) p);
            }
        }

        if (alunos.isEmpty()) {
            Relatorio.exibirErro("Nenhum aluno cadastrado.");
            return;
        }

        Aluno alunoSelecionado = (Aluno) JOptionPane.showInputDialog(null, 
                "Selecione o Aluno:", 
                "Matrícula", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                alunos.toArray(), 
                alunos.get(0));

        if (alunoSelecionado == null) return;

        Disciplina discSelecionada = (Disciplina) JOptionPane.showInputDialog(null, 
                "Selecione a Disciplina:", 
                "Matrícula", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                disciplinas.toArray(), 
                disciplinas.get(0));

        if (discSelecionada == null) return;

        Matricula matricula = new Matricula(alunoSelecionado, discSelecionada);
        matriculas.add(matricula);
        Relatorio.exibir("Matrícula realizada com sucesso!");
    }

    private static void registrarNotas() {
        if (matriculas.isEmpty()) {
            Relatorio.exibirErro("Nenhuma matrícula encontrada.");
            return;
        }

        // Cria array de strings para facilitar a seleção
        String[] opcoesMatriculas = new String[matriculas.size()];
        for (int i = 0; i < matriculas.size(); i++) {
            Matricula m = matriculas.get(i);
            opcoesMatriculas[i] = m.getAluno().getNome() + " - " + m.getDisciplina().getNome();
        }

        String selecionada = (String) JOptionPane.showInputDialog(null, 
                "Selecione a Matrícula:", 
                "Registrar Nota", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoesMatriculas, 
                opcoesMatriculas[0]);

        if (selecionada == null) return;

        Matricula matriculaEncontrada = null;
        for (int i = 0; i < opcoesMatriculas.length; i++) {
            if (opcoesMatriculas[i].equals(selecionada)) {
                matriculaEncontrada = matriculas.get(i);
                break;
            }
        }

        if (matriculaEncontrada != null) {
            String notaStr = JOptionPane.showInputDialog("Informe a nota:");
            if (notaStr == null || notaStr.trim().isEmpty()) return;

            try {
                double nota = Double.parseDouble(notaStr);
                matriculaEncontrada.getBoletim().adicionarNota(nota);
                Relatorio.exibir("Nota registrada com sucesso!");
            } catch (NumberFormatException e) {
                Relatorio.exibirErro("Nota inválida!");
            }
        }
    }

    private static void exibirRelatorioUsuario() {
        if (pessoas.isEmpty()) {
            Relatorio.exibirErro("Nenhuma pessoa cadastrada.");
            return;
        }

        Pessoa pessoaSelecionada = (Pessoa) JOptionPane.showInputDialog(null, 
                "Selecione o usuário:", 
                "Relatório de Usuário", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                pessoas.toArray(), 
                pessoas.get(0));

        if (pessoaSelecionada != null) {
            Relatorio.exibirRelatorioPessoa(pessoaSelecionada);
        }
    }

    private static void exibirRelatorioGeral() {
        if (matriculas.isEmpty()) {
            Relatorio.exibirErro("Nenhuma matrícula encontrada para gerar relatório.");
            return;
        }

        StringBuilder relatorioGeral = new StringBuilder();
        relatorioGeral.append("=== Relatório Geral de Matrículas ===\n\n");

        for (Matricula m : matriculas) {
            relatorioGeral.append(m.gerarResumo()).append("\n-------------------------\n");
        }

        Relatorio.exibir(relatorioGeral.toString());
    }
}
