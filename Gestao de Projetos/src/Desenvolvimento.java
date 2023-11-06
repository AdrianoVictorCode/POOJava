import java.util.ArrayList;

public class Desenvolvimento {
    private ArrayList <tarefas> listaDeTarefas;
    private ArrayList <funcionario> listaDeFuncionarios;

    public Desenvolvimento(){
        this.listaDeFuncionarios = new ArrayList<>();
        this.listaDeTarefas = new ArrayList<>();
    }

    public void criarTarefa (tarefas tarefa){
        listaDeTarefas.add(tarefa);
    }

    public void addFuncionario (funcionario funcionario){
        listaDeFuncionarios.add(funcionario);
    }

    public void atribuirTarefa (tarefas tarefa, funcionario funcionario){
        for (tarefas t : listaDeTarefas ){
            if (t.equals(tarefa)) {
                for (funcionario f : listaDeFuncionarios){
                    if (f.equals(funcionario)) {
                        System.out.println("Funcionario: "+funcionario+" foi atribuído a tarefa:"+tarefa);
                    }
                }
            }
        }
       
    }

    public String verificarProgresso (tarefas tarefa, funcionario funcionario){
        if (tarefa.getStatus() == 0){
            return "Em Andamento";
        }
        else if (tarefa.getStatus() == 1 ){
            return "Concluído";
        }
        else{
            return "Em atraso";
        }
    }
}
