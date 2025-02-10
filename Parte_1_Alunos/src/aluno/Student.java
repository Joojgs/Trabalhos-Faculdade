package aluno;

public class Student {
	private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Student(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean aprovado() {
        return calcularNotaFinal() >= 60.0;
    }

    public double pontosFaltando() {
        if (aprovado()) {
            return 0.0;
        } else {
            return 60.0 - calcularNotaFinal();
        }
    }

    public String toString() {
        return nome + "\nNOTA FINAL = " + String.format("%.2f", calcularNotaFinal()) + 
               "\n" + (aprovado() ? "PASS" : "FAILED") + 
               (aprovado() ? "" : "\nFALTARAM " + String.format("%.2f", pontosFaltando()) + " PONTOS");
    }
}
