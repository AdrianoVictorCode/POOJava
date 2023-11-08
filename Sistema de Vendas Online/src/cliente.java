public class cliente {
    private String nomeCliente;
    private int  idCliente;

    public cliente (String nomeCliente, int idCliente){
        this.setIdCliente(idCliente);
        this.setNomeCliente(nomeCliente);
    }

    public void setNomeCliente (String nomeDoCliente){
        this.nomeCliente = nomeDoCliente;
    }

    public String getNomeCliente (){
        return nomeCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }


}
