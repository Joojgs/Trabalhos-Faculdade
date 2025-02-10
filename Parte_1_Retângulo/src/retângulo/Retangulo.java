package retângulo;

public class Retangulo {
	 private double largura;
	    private double altura;

	    public Retangulo(double largura, double altura) {
	        this.largura = largura;
	        this.altura = altura;
	    }

	    public double getArea() {
	        return largura * altura;
	    }

	    public double getPerimetro() {
	        return 2 * (largura + altura);
	    }

	    public double getDiagonal() {
	        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	    }
}
