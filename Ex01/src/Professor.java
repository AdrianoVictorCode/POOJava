public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(){
        this.salario = salario*1.5;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEspecialidade: "+getEspecialidade();
    }
}
