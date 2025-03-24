package agenda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Compromisso {
	 private LocalDateTime dataInicio;
	    private LocalDateTime dataFim;
	    private String descricao;

	    public Compromisso(LocalDateTime dataInicio, LocalDateTime dataFim, String descricao) {
	        this.dataInicio = dataInicio;
	        this.dataFim = dataFim;
	        this.descricao = descricao;
	    }

	    public boolean pertencePeriodo(LocalDateTime inicioPeriodo, int numeroDias) {
	        LocalDateTime fimPeriodo = inicioPeriodo.plusDays(numeroDias);
	        return (dataInicio.isAfter(inicioPeriodo) || dataInicio.isEqual(inicioPeriodo)) &&
	               (dataInicio.isBefore(fimPeriodo) || dataInicio.isEqual(fimPeriodo));
	    }

	    public String toString() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	        return "Descrição: " + descricao +
	               " | Início: " + dataInicio.format(formatter) +
	               " | Fim: " + dataFim.format(formatter);
	    }
}
