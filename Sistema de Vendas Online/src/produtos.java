public class produtos {
    private String nomeProduto;
    private double precoProduto;
    private int estoqueProduto;
    private int idProduto;

    public produtos(String nomeDoProduto, double precoDoProduto, int estoqueDoProduto){
        this.setnomeProduto(nomeDoProduto);
        this.setprecoProduto(precoDoProduto);
        this.setEstoqueProduto(estoqueDoProduto);

    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public int getIdProduto() {
        return idProduto;
    }
    public void setnomeProduto (String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public String getnomeProduto (){
        return this.nomeProduto;
    }

    public void setprecoProduto (double precoProduto){
        this.precoProduto = precoProduto;
    }

    public double getprecoProduto (){
        return this.precoProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public int getEstoqueProduto() {
        return this.estoqueProduto;
    }
}
