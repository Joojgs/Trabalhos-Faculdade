package aluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nota do primeiro trimestre: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota do segundo trimestre: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota do terceiro trimestre: ");
        double nota3 = sc.nextDouble();
        
        Student aluno = new Student(nome, nota1, nota2, nota3);
        
        System.out.println(aluno);
        
        sc.close();
    }
}