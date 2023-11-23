public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }


    @Override
    public void pagarMensalidade() {
    System.out.println("O Aluno"+getNome()+ "É Bolsista");
    }

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return super.toString()+"\nValor da bolsa: "+getBolsa();
    }

}
