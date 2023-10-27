import java.util.ArrayList;

public class Turma {
    private int numeroTurma;
    private Aluno[] alunos;
    private ArrayList <String> turmas;

    public Turma(int numeroTurma){
        this.numeroTurma = numeroTurma;
    }

    public void adicionarTurma (String nomeTurma){
        turmas.add(nomeTurma);
    }

}
