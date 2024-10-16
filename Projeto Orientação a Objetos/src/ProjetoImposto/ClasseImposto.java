package ProjetoImposto;

import java.util.Scanner;

public class ImpostoDeRenda {
    private double salarioAnual;
    private double rendaServico;
    private double ganhoCapital;
    private double gastosMedicos;
    private double gastosEducacionais;

    public ImpostoDeRenda(double salarioAnual, double rendaServico, double ganhoCapital, double gastosMedicos, double gastosEducacionais) {
        this.salarioAnual = salarioAnual;
        this.rendaServico = rendaServico;
        this.ganhoCapital = ganhoCapital;
        this.gastosMedicos = gastosMedicos;
        this.gastosEducacionais = gastosEducacionais;
    }

    private double calcularImpostoSalario() {
        double salarioMensal = salarioAnual / 12;
        if (salarioMensal < 3000) return 0;
        else if (salarioMensal < 5000) return salarioAnual * 0.10;
        else return salarioAnual * 0.20;
    }

    private double calcularImpostoServico() {
        return rendaServico * 0.15;
    }

    private double calcularImpostoCapital() {
        return ganhoCapital * 0.20;
    }

    public double calcularImpostoBruto() {
        return calcularImpostoSalario() + calcularImpostoServico() + calcularImpostoCapital();
    }

    public double calcularDeducoes() {
        double deducaoMaxima = calcularImpostoBruto() * 0.30;
        double totalGastos = gastosMedicos + gastosEducacionais;
        return Math.min(deducaoMaxima, totalGastos);
    }

    public double calcularImpostoLiquido() {
        return calcularImpostoBruto() - calcularDeducoes();
    }

    public void imprimirRelatorio() {
        System.out.printf("### RELATÓRIO DE IMPOSTO DE RENDA ###\n");
        System.out.printf("* CONSOLIDADO DE RENDA:\n");
        System.out.printf("Imposto sobre salário: %.2f\n", calcularImpostoSalario());
        System.out.printf("Imposto sobre serviços: %.2f\n", calcularImpostoServico());
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", calcularImpostoCapital());
        System.out.printf("* DEDUÇÕES:\n");
        System.out.printf("Máximo dedutível: %.2f\n", calcularImpostoBruto() * 0.30);
        System.out.printf("Gastos dedutíveis: %.2f\n", gastosMedicos + gastosEducacionais);
        System.out.printf("* RESUMO:\n");
        System.out.printf("Imposto bruto total: %.2f\n", calcularImpostoBruto());
        System.out.printf("Abatimento: %.2f\n", calcularDeducoes());
        System.out.printf("Imposto devido: %.2f\n", calcularImpostoLiquido());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Renda anual com salário: ");
        double salarioAnual = scanner.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double rendaServico = scanner.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double ganhoCapital = scanner.nextDouble();
        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();
        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        ImpostoDeRenda imposto = new ImpostoDeRenda(salarioAnual, rendaServico, ganhoCapital, gastosMedicos, gastosEducacionais);
        imposto.imprimirRelatorio();
    }
}
