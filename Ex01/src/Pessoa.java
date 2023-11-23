public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;


    public void fazerAniversaio(){
        this.idade++;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return  "\n\n###- [Dados do Usuario] -###"+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSexo: "+getSexo();

    }
}
