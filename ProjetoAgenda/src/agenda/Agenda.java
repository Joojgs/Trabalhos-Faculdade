package agenda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
	 private List<Compromisso> compromissos;

	    public Agenda() {
	        this.compromissos = new ArrayList<>();
	    }

	    public void adicionarCompromisso(Compromisso novo) {
	        compromissos.add(novo);
	        System.out.println("Compromisso adicionado com sucesso!");
	    }
	 
	    public void verificarCompromissos(int numeroDias) {
	        LocalDateTime hoje = LocalDateTime.now();
	        System.out.println("Compromissos nos próximos " + numeroDias + " dias:");
	        boolean encontrou = false;
	        for (Compromisso compromisso : compromissos) {
	            if (compromisso.pertencePeriodo(hoje, numeroDias)) {
	                System.out.println(compromisso);
	                encontrou = true;
	            }
	        }
	        if (!encontrou) {
	            System.out.println("Nenhum compromisso encontrado nesse período.");
	        }
	    }
}
