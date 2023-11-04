import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <String> c1= new ArrayList<String>();
        c1.add("Romance");
        c1.add("Ficção");

        ArrayList <String> c2= new ArrayList<String>();
        c2.add("Aventura");
        c2.add("Drama");
        c2.add("Ação");
       
        autores a1 = new autores("Alberto", 33);
        autores a2 = new autores("Fernando", 25);
        autores a3 = new autores("Ester", 60);

        livros l1 = new livros(a1,"Doce saudade", 350, 2023, c1);
        livros l2 = new livros(a3, "Contos de Madagaskar", 160, 1970, c2);
        //System.out.println(l1.toString());
        //System.out.println(l2.toString());

        bibliotecaVirtual b1 = new bibliotecaVirtual();
        b1.pesquisarAutor("Ester");


    }
}
