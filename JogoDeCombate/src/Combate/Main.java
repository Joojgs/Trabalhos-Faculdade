package Combate;

import java.util.Scanner;

public class Main {
    public static void combate(Campeao campeao1, Campeao campeao2, int turnos) {
        for (int i = 1; i <= turnos; i++) {
            campeao1.takeDamage(campeao2.getAtaque());
            campeao2.takeDamage(campeao1.getAtaque());

            System.out.println("Resultado do turno " + i + ":");
            System.out.println(campeao1.status());
            System.out.println(campeao2.status());

            if (campeao1.getVida() == 0 || campeao2.getVida() == 0) {
                System.out.println("### FIM DO COMBATE ###");
                return;
            }
        }
        System.out.println("### FIM DO COMBATE ###");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int vida1 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataque1 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armadura1 = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int vida2 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataque2 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armadura2 = scanner.nextInt();

        System.out.print("Quantos turnos você deseja executar? ");
        int turnos = scanner.nextInt();

        Campeao campeao1 = new Campeao(nome1, vida1, ataque1, armadura1);
        Campeao campeao2 = new Campeao(nome2, vida2, ataque2, armadura2);

        combate(campeao1, campeao2, turnos);
    }
}
