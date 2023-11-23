public class App {
    public static void main(String[] args) throws Exception {
        Visitante v1 = new Visitante();
        v1.setNome("Alfredo");
        v1.setIdade(23);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Roberto");
        a1.setCurso("Informática");
        a1.setSexo("Masculino");
        a1.setIdade(16);
        a1.setMatricula(001);
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("José");
        b1.setCurso("Agropecuária");
        b1.setSexo("Masculino");
        b1.setBolsa(12.5f);
        b1.setMatricula(002);
        b1.setIdade(15);
        System.out.println(b1.toString());

        Tecnico t1 = new Tecnico();
        t1.setNome("Fernanda");
        t1.setIdade(16);
        t1.setCurso("Informática");
        t1.setMatricula(003);
        t1.setSexo("Feminino");
        t1.setRegistroProfissional(213);
        System.out.println(t1.toString());
        
        Professor p1 = new Professor();
        p1.setNome("Maria");
        p1.setEspecialidade("Sistemas Distribuídos");
        p1.setSexo("Feminino");
        p1.setIdade(35);
        



    }
}
