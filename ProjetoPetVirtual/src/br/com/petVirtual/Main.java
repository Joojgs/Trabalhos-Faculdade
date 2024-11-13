package br.com.petVirtual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crie seu novo animal");
        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira a classe: ");
        String classe = scanner.nextLine();
        System.out.print("Insira a família: ");
        String familia = scanner.nextLine();

        Animal animal = new Animal(nome, classe, familia);
        System.out.println("O animal se chama " + animal.getNome() + " é da classe " + animal.getClasse() + " da família " + animal.getFamilia() + ". O animal possui força " + animal.getForca() + ", caloria de " + animal.getCaloria() + " e 0 idade.");

        while (animal.isEstado()) {
            System.out.println("\nO que o " + animal.getNome() + " vai fazer agora?");
            System.out.println("1- Comer");
            System.out.println("2- Correr");
            System.out.println("3- Dormir");
            System.out.println("4- Morrer");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    animal.comer();
                    break;
                case 2:
                    animal.correr();
                    break;
                case 3:
                    animal.dormir();
                    break;
                case 4:
                    animal.morrer();
                    break;
                default:
                    System.out.println("\nOpção inválida\n");
            }
        }

        System.out.println("GAME OVER!");
        scanner.close();
    }
}
