public class Tecnico extends Aluno {
    private int registroProfissional;

    public void praticar(){
        System.out.println("O tecnico "+getNome() +"está praticando;");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRegistro Profissional: "+getRegistroProfissional();
    }
}
