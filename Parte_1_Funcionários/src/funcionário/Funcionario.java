package funcionário;

public class Funcionario {
	   private String nome;
	    private double salarioBruto;
	    private double imposto;

	    public Funcionario(String nome, double salarioBruto, double imposto) {
	        this.nome = nome;
	        this.salarioBruto = salarioBruto;
	        this.imposto = imposto;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getSalarioLiquido() {
	        return salarioBruto - imposto;
	    }

	    public void aumentarSalario(double porcentagem) {
	        salarioBruto += salarioBruto * porcentagem / 100.0;
	    }

	    public String toString() {
	        return nome + ", R$ " + String.format("%.2f", getSalarioLiquido());
	    }

}
