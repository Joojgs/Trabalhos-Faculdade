package jogo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Jogo jogo = null;

	        while (true) {
	            System.out.println("\nMENU");
	            System.out.println("1 - Iniciar nova partida");
	            System.out.println("2 - Executar jogada");
	            System.out.println("3 - Informar posições");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");

	            int opcao = sc.nextInt();

	            if (opcao == 0) {
	                System.out.println("Saindo do jogo. Até mais!");
	                break;
	            }
	            
	            switch (opcao) {
                case 1:
                    System.out.print("Número de casas no tabuleiro: ");
                    int numeroCasas = sc.nextInt();
                    System.out.print("Número de jogadores: ");
                    int numeroJogadores = sc.nextInt();
                    jogo = new Jogo(numeroCasas, numeroJogadores);
                    System.out.println("Nova partida iniciada!");
                    break;

                case 2:
                    if (jogo == null) {
                        System.out.println("Inicie uma nova partida primeiro!");
                    } else {
                        jogo.proximaJogada();
                    }
                    break;
                    
                case 3:
                    if (jogo == null) {
                        System.out.println("Inicie uma nova partida primeiro!");
                    } else {
                        jogo.informarPosicoes();
                    }
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
	}
}


