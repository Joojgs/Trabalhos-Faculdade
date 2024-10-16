package br.com.seuprojeto;

import java.util.Scanner;

public class ContaBar {
    private String sexo;
    private int quantidadeCervejas;
    private int quantidadeRefrigerantes;
    private int quantidadeEspetinhos;

    public ContaBar(String sexo, int quantidadeCervejas, int quantidadeRefrigerantes, int quantidadeEspetinhos) {
        this.sexo = sexo;
        this.quantidadeCervejas = quantidadeCervejas;
        this.quantidadeRefrigerantes = quantidadeRefrigerantes;
        this.quantidadeEspetinhos = quantidadeEspetinhos;
    }

    public double calcularIngresso() {
        return sexo.equalsIgnoreCase("M") ? 10.0 : 8.0;
    }

    public double calcularConsumo() {
        return (quantidadeCervejas * 5) + (quantidadeRefrigerantes * 3) + (quantidadeEspetinhos * 7);
    }

    public double calcularConta() {
        double consumo = calcularConsumo();
        double ingresso = calcularIngresso();
        double couvertArtistico = (consumo > 30) ? 0 : 4;
        return consumo + ingresso + couvertArtistico;
    }

    public void imprimirRelatorio() {
        double consumo = calcularConsumo();
        double ingresso = calcularIngresso();
        double couvertArtistico = (consumo > 30) ? 0 : 4;
        double total = calcularConta();
        
    	System.out.printf("\n====================================\n");
        System.out.printf("---------RELATÓRIO DA CONTA---------\n");
        System.out.printf("====================================\n");
        System.out.printf("Consumo = R$ %.2f\n", consumo);
        System.out.printf("Couvert = R$ %.2f\n", couvertArtistico);
        System.out.printf("Ingresso = R$ %.2f\n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f\n", total);
        System.out.printf("====================================\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sexo (F ou M): ");
        String sexo = scanner.next();
        System.out.print("Quantidade de cervejas: ");
        int quantidadeCervejas = scanner.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = scanner.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        int quantidadeEspetinhos = scanner.nextInt();

        ContaBar conta = new ContaBar(sexo, quantidadeCervejas, quantidadeRefrigerantes, quantidadeEspetinhos);
        conta.imprimirRelatorio();
    }
}

