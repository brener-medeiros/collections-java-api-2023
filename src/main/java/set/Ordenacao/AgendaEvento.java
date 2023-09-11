package main.java.set.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEvento {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEvento() {
        this.eventosMap = new HashMap<>();

    }
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento() {
        //Set<LocalDate> dateSet = eventosMap.keySet();
        //Collection<Evento> valuer = eventosMap.values();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento>entry: eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evendo "+ proximoEvento + " acontecerá na data: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        agendaEvento.adicionarEvento(LocalDate.of(2023, Month.JULY, 15), "Evento 1", "atarcao 1");
        agendaEvento.adicionarEvento(LocalDate.of(2024, 7, 9), "Evento 2", "atarcao 2");
        agendaEvento.adicionarEvento(LocalDate.of(2023, Month.JANUARY, 10), "Evento 3", "atarcao 3");

        agendaEvento.exibirAgenda();

        agendaEvento.obterProximoEvento();

    }

}
