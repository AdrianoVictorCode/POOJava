public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Turma t1 = new Turma(1);

        t1.adicionarTurma("Ingles");
        
        t1.adicionarTurma("Matematica");
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        
        p1.setSexo("Masculino");
        p2.setIdade(18);

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        //System.out.println(p1.toString());
        //System.out.println(p2.toString());
        //System.out.println(p3.toString());

    }
}
