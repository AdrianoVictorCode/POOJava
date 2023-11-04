import java.util.ArrayList;

public class livros {
    private String titulo;
    private int paginas;
    private ArrayList <String> Categorias;
    private autores autor;
    private int anodePublicacao;

    

    public livros (autores autor, String titulo, int paginas, int anodePublicacao, ArrayList <String> categoria){
        this.setAutor(autor);
        this.setTitulo(titulo);
        this.setPaginas(paginas);
        this.setCategorias(categoria);
        this.setAnodePublicacao(anodePublicacao);

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setAutor(autores autor) {
        this.autor = autor;
    }
    public autores getAutor() {
        return autor;
    }
    public void setCategorias(ArrayList<String> categorias) {
        Categorias = categorias;
    }
    public ArrayList<String> getCategorias() {
        return Categorias;
    }
    public void setAnodePublicacao(int anodePublicacao) {
        this.anodePublicacao = anodePublicacao;
    }
    public int getAnodePublicacao() {
        return anodePublicacao;
    }

    @Override
    public String toString() {
        
        return "\nTitulo: "+getTitulo()+"\nPaginas: "+getPaginas()+"\nPublicado em: "+getAnodePublicacao()+"\nAutor: "+getAutor()+"\nCategoria: "+getCategorias();
    }
}
