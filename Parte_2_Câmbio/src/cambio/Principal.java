package cambio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Qual o valor do dólar? ");
	        double valorDolar = sc.nextDouble();
	        System.out.print("Quantos dólares serão comprados? ");
	        double quantidadeDolares = sc.nextDouble();
	        
	        double valorEmReais = CurrencyConverter.converterDolarParaReal(valorDolar, quantidadeDolares);
	        
	        System.out.printf("Valor a ser pago em reais = %.2f%n", valorEmReais);
	        
	        sc.close();
	    }

	}
