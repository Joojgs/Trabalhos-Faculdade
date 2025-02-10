package funcionário;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();
        
        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);
        
        System.out.println("Funcionário: " + funcionario);
        
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        
        System.out.println("Dados atualizados: " + funcionario);
        
        sc.close();
    }
}
