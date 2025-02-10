package retângulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com a largura e altura do retângulo:");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();
        
        Retangulo retangulo = new Retangulo(largura, altura);
        
        System.out.printf("AREA = %.2f%n", retangulo.getArea());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.getPerimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.getDiagonal());
        
        sc.close();
    }

}
