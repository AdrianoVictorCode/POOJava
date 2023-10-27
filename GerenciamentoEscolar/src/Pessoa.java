public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    public void fazerAniversario(){
        this.setIdade(getIdade() + 1);   
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nSexo: "+getSexo();
    }
}
