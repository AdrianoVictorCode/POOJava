public class quarto {
    private String tipoQuarto;
    private int valorQuarto;
    private boolean disponivel;

    public quarto(String tipoQuarto, int valorQuarto){
        this.setTipoQuarto(tipoQuarto);
        this.setValorQuarto(valorQuarto);
        this.disponivel = true;
    }
    
    public void setTipoQuarto (String tipoQuarto){
        this.tipoQuarto = tipoQuarto;
    }

    public String getTipoQuarto (){
        return this.tipoQuarto;
    }

    public void setValorQuarto(int valorQuarto) {
        this.valorQuarto = valorQuarto;
    }

    public int getValorQuarto() {
        return valorQuarto;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public boolean getDisponivel (){
        return disponivel;
    }

    @Override
    public String toString() {
        
        return "Quartos: \n"+"Tipo: "+tipoQuarto+"\nValor: "+getValorQuarto() ;
    }
}
