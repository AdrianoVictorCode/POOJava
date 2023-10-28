import java.util.ArrayList;

public class Escola {
    private ArrayList<Alunos> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;

    public Escola() {
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void adicionarAluno(Alunos aluno) {
        this.alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public ArrayList<Turma> turmasDoProfessor(Professor professor) {
        ArrayList<Turma> turmasDoProfessor = new ArrayList<>();
        for (Turma turma : turmas) {
            if (turma.getProfessor().equals(professor)) {
                turmasDoProfessor.add(turma);
            }
        }
        return turmasDoProfessor;
    }

    public ArrayList<Alunos> alunosDaTurma(Turma turma) {
        return turma.getAlunos();
    }
}