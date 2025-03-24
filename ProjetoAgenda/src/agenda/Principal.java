package agenda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Verificar compromissos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner

            if (opcao == 0) {
                System.out.println("Saindo da agenda. Até mais!");
                break;
            }
            
            switch (opcao) {
            case 1:
                try {
                    System.out.print("Descrição do compromisso: ");
                    String descricao = sc.nextLine();
                    System.out.print("Data e hora de início (dd/MM/yyyy HH:mm): ");
                    String dataInicioStr = sc.nextLine();
                    System.out.print("Data e hora de fim (dd/MM/yyyy HH:mm): ");
                    String dataFimStr = sc.nextLine();
                    LocalDateTime dataInicio = LocalDateTime.parse(dataInicioStr, formatter);
                    LocalDateTime dataFim = LocalDateTime.parse(dataFimStr, formatter);
                    if (dataFim.isBefore(dataInicio)) {
                        System.out.println("Erro: a data de fim não pode ser anterior à data de início!");
                    } else {
                        Compromisso compromisso = new Compromisso(dataInicio, dataFim, descricao);
                        agenda.adicionarCompromisso(compromisso);
                    }
                } catch (Exception e) {
                    System.out.println("Erro: formato de data/hora inválido!");
                }
                break;
                
            case 2:
                System.out.print("Quantos dias à frente deseja verificar? ");
                int numeroDias = sc.nextInt();
                agenda.verificarCompromissos(numeroDias);
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }

    sc.close();
	}

}
