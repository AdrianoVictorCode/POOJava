public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    public void pagarMensalidade (){
        System.out.println("Pagando mensalidade de aluno");
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }


    @Override
    public String toString() {
        
        return super.toString()+"\nCurso: "+getCurso()+"\nMatricula: "+getMatricula();
    }
}
