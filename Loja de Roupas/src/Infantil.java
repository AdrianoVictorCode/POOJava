public class Infantil {
    private String cor;
    private String tamanho;
    private String modelo;
    private float price;

    public Infantil(String cor, String tamanho, String modelo, float price){
        this.setCor(cor);
        this.setTamanho(tamanho);
        this.setTamanho(tamanho);
        this.setPrice(price);
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice() {
        return price;
    }

    @Override
    public String toString (){
        return "Cor: "+getCor()+"Tamanho: "+getTamanho() +"Modelo: "+getModelo()+"Preco: "+getPrice();
    }
}
