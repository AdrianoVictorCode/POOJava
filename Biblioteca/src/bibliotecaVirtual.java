import java.util.ArrayList;

public class bibliotecaVirtual {
    private ArrayList <autores> autor = new ArrayList<>();
    private ArrayList <livros> livrosDoAutor = new ArrayList<>();

    public bibliotecaVirtual(){

    }

    public ArrayList<String> pesquisarAutor(String nomeAutor) {
        ArrayList<String> informacoesLivrosDoAutor = new ArrayList<>();
    
        for (livros livro : this.livrosDoAutor) {
            if (livro.getAutor().getNome().contains(nomeAutor)) {
                String informacaoLivro = "Título: " + livro.getTitulo() +
                                         ", Autor: " + livro.getAutor().getNome();
                informacoesLivrosDoAutor.add(informacaoLivro);
            }
        }
    
        return informacoesLivrosDoAutor;
    }

    @Override
    public String toString() {
   
        return "\n"+livrosDoAutor;
    }
   
    
    
    
    
    
    
}
