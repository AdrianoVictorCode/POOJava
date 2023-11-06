public class funcionario {
    private String nome;
    private int idade;
    private String graduacao;
    
    

    public funcionario(String nome, int idade, int graduacao){
        this.setGraduacao(nome);
        this.setIdade(idade);
        this.setNome(nome);
    }
    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    public String getGraduacao() {
        return graduacao;
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
}
