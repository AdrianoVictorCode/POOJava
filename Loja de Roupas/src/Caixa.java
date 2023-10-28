import java.lang.reflect.Array;
import java.util.ArrayList;

public class Caixa {
    private ArrayList<Masculino> roupasMasculinas;
    private ArrayList<Feminino> roupasFemininas;
    private ArrayList<Infantil> roupasInfantis;
    private float Total;
    private String roupaCarrinho;

    public Caixa(){
        this.roupasMasculinas = new ArrayList<Masculino>();
        this.roupasFemininas = new ArrayList<Feminino>();
        this.roupasInfantis = new ArrayList<Infantil>();
    }

    public void AdicionarRoupa (Masculino rMasculino, Feminino rFeminino, Infantil rInfantil){
        this.roupasMasculinas.add(rMasculino);
        this.roupasFemininas.add(rFeminino);
        this.roupasInfantis.add(rInfantil);
        this.Total += rMasculino.getPrice() +rFeminino.getPrice() +rInfantil.getPrice();
    }
     public void AdicionarRoupa (Masculino rMasculino, Feminino rFeminino){
        this.roupasMasculinas.add(rMasculino);
        this.roupasFemininas.add(rFeminino);
          this.Total += rMasculino.getPrice() +rFeminino.getPrice();
    }
    public void AdicionarRoupa (Feminino rFeminino, Infantil rInfantil){
        this.roupasFemininas.add(rFeminino);
        this.roupasInfantis.add(rInfantil);
        this.Total += rFeminino.getPrice() +rInfantil.getPrice();
    }
    public void AdicionarRoupa (Masculino rMasculino, Infantil rInfantil){
        this.roupasMasculinas.add(rMasculino);
        this.roupasInfantis.add(rInfantil);
          this.Total += rMasculino.getPrice() +rInfantil.getPrice();
    }
    public void AdicionarRoupa (Masculino rMasculino){
        this.roupasMasculinas.add(rMasculino);
        this.Total += rMasculino.getPrice();
    }
    public void AdicionarRoupa ( Feminino rFeminino){
        this.AdicionarRoupa(rFeminino);
        this.Total += rFeminino.getPrice();
    }
    public void AdicionarRoupa (Infantil rInfantil){
        this.roupasInfantis.add(rInfantil);
        this.Total += rInfantil.getPrice();
    }

    public void setRoupasFemininas(ArrayList<Feminino> roupasFemininas) {
        this.roupasFemininas = roupasFemininas;
    }
    public ArrayList<Feminino> getRoupasFemininas() {
        return roupasFemininas;
    }
    public void setRoupasInfantis(ArrayList<Infantil> roupasInfantis) {
        this.roupasInfantis = roupasInfantis;
    }
    public ArrayList<Infantil> getRoupasInfantis() {
        return roupasInfantis;
    }
    public void setRoupasMasculinas(ArrayList<Masculino> roupasMasculinas) {
        this.roupasMasculinas = roupasMasculinas;
    }
    public ArrayList<Masculino> getRoupasMasculinas() {
        return roupasMasculinas;
    }
    public ArrayList<Masculino> verificaCarrinho(Masculino rMasculino) {
        ArrayList<Masculino> itensEncontrados = new ArrayList<Masculino>();
    
        for (Masculino roupaCarrinho : roupasMasculinas) {
            if (roupaCarrinho.equals(rMasculino)) {
                itensEncontrados.add(roupaCarrinho);
            }
        }
    
        return itensEncontrados;
    }
    
    public ArrayList<Feminino> verificaCarrinho(Feminino rFeminino) {
        ArrayList<Feminino> itensEncontrados = new ArrayList<Feminino>();
    
        for (Feminino roupaCarrinho : roupasFemininas) {
            if (roupaCarrinho.equals(rFeminino)) {
                itensEncontrados.add(roupaCarrinho);
            }
        }
    
        return itensEncontrados;
    }
    
    public ArrayList<Infantil> verificaCarrinho(Infantil rInfantil) {
        ArrayList<Infantil> itensEncontrados = new ArrayList<Infantil>();
    
        for (Infantil roupaCarrinho : roupasInfantis) {
            if (roupaCarrinho.equals(rInfantil)) {
                itensEncontrados.add(roupaCarrinho);
            }
        }
    
        return itensEncontrados;
    }

    public float FecharCompra(){
        return Total;
    }






}
