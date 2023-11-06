public class App {
    public static void main(String[] args) throws Exception {
        funcionario f1 = new funcionario("Pedro", 29, 1);

        tarefas t1 = new tarefas("Jogo");

        Desenvolvimento d1 = new Desenvolvimento();
        d1.atribuirTarefa(t1, f1);
    }
}
