import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Escola escola = new Escola();
        Professor professor1 = new Professor("Professor 1", "Matemática", 35, "M");
        Professor professor2 = new Professor("Professor 2", "História", 40, "F");
        Alunos aluno1 = new Alunos("Aluno 1", 15, "M");
        Alunos aluno2 = new Alunos("Aluno 2", 16, "F");
        Alunos aluno3 = new Alunos("Aluno 3", 17, "M");
        Turma turma1 = new Turma("Turma A", professor1);
        Turma turma2 = new Turma("Turma B", professor2);

        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);
        escola.adicionarTurma(turma1);
        escola.adicionarTurma(turma2);

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        System.out.println("Turmas ministradas pelo Professor:");
        ArrayList<Turma> turmasProfessor1 = escola.turmasDoProfessor(professor1);
        for (Turma turma : turmasProfessor1) {
            System.out.println(turma.getNomeTurma());
        }

        System.out.println("\nAlunos na Turma B:");
        ArrayList<Alunos> alunosTurmaB = escola.alunosDaTurma(turma2);
        for (Alunos aluno : alunosTurmaB) {
            System.out.println(aluno.getNomeAluno());
        }
    }
}
