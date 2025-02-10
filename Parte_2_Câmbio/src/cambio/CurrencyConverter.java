package cambio;

public class CurrencyConverter {
	public static final double IOF = 0.06;

    public static double converterDolarParaReal(double valorDolar, double quantidadeDolares) {
        double valorComIOF = valorDolar * quantidadeDolares * (1.0 + IOF);
        return valorComIOF;
    }
}
