import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private Professor professor;
    private ArrayList<Alunos> alunos;

    public Turma(String nomeTurma, Professor professor) {
        this.setNomeTurma(nomeTurma);
        this.setProfessor(professor);
        this.alunos = new ArrayList<>();
    }

    public String getNomeTurma() {
        return nomeTurma;
    }
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public void adicionarAluno(Alunos aluno) {
        alunos.add(aluno);
        aluno.adicionarTurma(this);
    }



    public ArrayList<Alunos> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Alunos> alunos) {
        this.alunos = alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Professor getProfessor() {
        return professor;
    }
}

