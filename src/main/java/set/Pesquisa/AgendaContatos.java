package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c: contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato (String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos  = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Brener", 151851);
        agendaContatos.adicionarContato("Brener", 189898);
        agendaContatos.adicionarContato("Brener Medeiros", 15515);
        agendaContatos.adicionarContato("Brener Java", 18488);
        agendaContatos.adicionarContato("Carol da Silva", 151851);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Brener"));
        System.out.println(agendaContatos.atualizarNumeroContato("Brener Java", 353535));

    }
}
