public class App {
    public static void main(String[] args) throws Exception {
        quarto q1 = new quarto("padrão", 100);
        quarto q2 = new quarto("luxo", 250);
        quarto q3 = new quarto("suíte", 500);
        quarto q4 = new quarto("padrão", 100);
        quarto q5 = new quarto("luxo", 250);
        quarto q6 = new quarto("suíte", 500);

        cliente c1 = new cliente("Alfredo", 30, 001);
        cliente c2 = new cliente("Cristine", 47, 002);
        cliente c3 = new cliente("Roberto", 22, 003);
        hotel h1 = new hotel();

        h1.addQuartoPadrao(q1);
        h1.addQuartoLuxo(q2);
        h1.addQuartoPadrao(q4);
        h1.addQuartoLuxo(q5);
        h1.addQuartoSuite(q6);
        h1.addQuartoSuite(q3);
        h1.addCliente(c1);
        h1.addCliente(c2);
        h1.addCliente(c3);

        h1.reservarQuarto(c3, q6, 5);
        h1.reservarQuarto(c2, q6, 3);
    }
}
