package ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new ArrayList<Tarefa>();
    }
    public void adicionaTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }
    public void removeTarefa(String descricao) {
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for (Tarefa t : listaTarefa) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover.add(t);

            }
        }
        listaTarefa.removeAll(tarefaRemover);
    }
    public  int obterNumeroTarefa() {
        return listaTarefa.size();
    }
    public void obterDescricaoTarefa() {
        System.out.println(listaTarefa);
    }
}
