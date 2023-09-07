package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTerefa {
    private List<Tarefa> tarefaList;

    public ListaTerefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTerafa(String descricao) {
        List<Tarefa>tarefaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obeterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTerefa listaTerefa = new ListaTerefa();
        System.out.println("O numero total de tarefas é: " + listaTerefa.obterNumeroTotalTarefas());

        listaTerefa.adicionarTarefa("Limpar a casa");
        listaTerefa.adicionarTarefa("Estudar");
        listaTerefa.adicionarTarefa("Dormir");

        System.out.println("O numero total de tarefas é: " + listaTerefa.obterNumeroTotalTarefas());

        listaTerefa.removerTerafa("Dormir");

        System.out.println("O numero total de tarefas é: " + listaTerefa.obterNumeroTotalTarefas());

        listaTerefa.obeterDescricoesTarefas();



    }
}
