public class tarefas {
    private String nomeProjeto;
    private int andamento;
    private int concluída;
    private int atrasada;
    private int status;

    public tarefas (String nome){
        this.setNomeProjeto(nome);
        this.setAndamento(0);
        this.setConcluída(1);
        this.setAtrasada(-1);
        this.setStatus(0);
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }
    public String getNomeProjeto() {
        return nomeProjeto;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
    public void setAndamento(int andamento) {
        this.andamento = andamento;
    }
    public int getAndamento() {
        return andamento;
    }
    public void setAtrasada(int atrasada) {
        this.atrasada = atrasada;
    }
    public int getAtrasada() {
        return atrasada;
    }
    public void setConcluída(int concluída) {
        this.concluída = concluída;
    }
    public int getConcluída() {
        return concluída;
    }

    public void mudarStatusDaTarefaParaAndamento(){
        this.setStatus(getAndamento());
    }
    public void mudarStatusDaTarefaParaConcluido(){
        this.setStatus(getConcluída());
    }
    public void mudarStatusDaTarefaParaAtrasada(){
        this.setStatus(getAtrasada());
    }


    @Override
    public String toString() {
        return ""+getNomeProjeto()+" |Status: "+getStatus();
    }
}
