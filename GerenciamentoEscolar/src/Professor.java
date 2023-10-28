import java.util.ArrayList;

public class Professor {
    private String nomeProfessor;
    private int idadeProfessor;
    private String especialidade;
    private String sexoProfessor;
    private ArrayList <Turma> turmasMinistradas;

    public Professor(String nome, String especializacao, int idade,String sexo){
        this.setNomeProfessor(nome);
        this.setEspecialidade(especializacao);
        this.setIdadeProfessor(idade);
        this.setSexoProfessor(sexo);
        turmasMinistradas = new ArrayList<>(); 
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setIdadeProfessor(int idadeProfessor) {
        this.idadeProfessor = idadeProfessor;
    }
    public int getIdadeProfessor() {
        return idadeProfessor;
    }
    public void setSexoProfessor(String sexoProfessor) {
        this.sexoProfessor = sexoProfessor;
    }
    public String getSexoProfessor() {
        return sexoProfessor;
    }

    public void adicionarTurmasMinistradas(Turma turmas){
        this.turmasMinistradas.add(turmas);
    }
}
