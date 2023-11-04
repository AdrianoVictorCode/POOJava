public class autores {
    private String nome;
    private int idade;
    

    public autores(String nome, int idade){
        this.setIdade(idade);
        this.setNome(nome);
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

    
    @Override
    public String toString() {
        return ""+getNome();
    }
}
