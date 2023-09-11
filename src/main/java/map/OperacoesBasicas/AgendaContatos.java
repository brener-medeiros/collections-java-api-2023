package main.java.map.OperacoesBasicas;

import main.java.set.Pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone ) {
        agendaContatoMap.put(nome,telefone);
    }
    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);

        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Brener", 151851);
        agendaContatos.adicionarContato("Brener", 189898);
        agendaContatos.adicionarContato("Brener Medeiros", 15515);
        agendaContatos.adicionarContato("Brener Java", 18488);
        agendaContatos.adicionarContato("Carol da Silva", 151851);

        agendaContatos.removerContato("Brener Java");

        agendaContatos.exibirContatos();

        System.out.println("O telefone do Contato é " + agendaContatos.pesquisarPorNome("Brener"));

    }
}
