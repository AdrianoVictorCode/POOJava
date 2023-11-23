public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Repetil r = new Repetil();

        m.setCorPelo("Marrom");
        m.locomover();
        m.emitirSom();
        m.alimentar();

        p.alimentar();
        p.emitirSom();
        p.locomover();
    }
}
