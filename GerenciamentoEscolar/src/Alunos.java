import java.util.Objects;
import java.util.ArrayList;

public class Alunos {
    private String nomeAluno;
    private int idadeAluno;
    private int matriculaAluno;
    private String sexoAluno;
    private ArrayList<Turma> turmas;

    public Alunos(String nome, int idade, String sexo) {
        this.setNomeAluno(nome);
        this.setIdadeAluno(idade);
        this.setSexoAluno(sexo);
        this.turmas = new ArrayList<>();
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }
    public int getIdadeAluno() {
        return idadeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }public String getNomeAluno() {
        return nomeAluno;
    }
    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
    public int getMatriculaAluno() {
        return matriculaAluno;
    }
    public void setSexoAluno(String sexoAluno) {
        this.sexoAluno = sexoAluno;
    }
    public String getSexoAluno() {
        return sexoAluno;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }


    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Alunos aluno = (Alunos) o;

    return idadeAluno == aluno.idadeAluno &&
           matriculaAluno == aluno.matriculaAluno &&
           Objects.equals(nomeAluno, aluno.nomeAluno) &&
           Objects.equals(sexoAluno, aluno.sexoAluno);
}
}
