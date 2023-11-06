public class cliente {
    private String nome;
    private int idade;
    private int registroDePessoa;

    public cliente (String nome, int idade, int registroDePessoa){
        this.setIdade(idade);
        this.setNome(nome);
        this.setRegistroDePessoa(registroDePessoa);
    }
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
    public void setRegistroDePessoa(int registroDePessoa) {
        this.registroDePessoa = registroDePessoa;
    }
    public int getRegistroDePessoa() {
        return registroDePessoa;
    }

    @Override
    public String toString(){
        return "\nNome:"+getNome()+"\nRegistro:"+getRegistroDePessoa();
    }
}
