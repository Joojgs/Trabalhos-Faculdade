package jogo;

public class Jogador {
	private int casaAtual;
    private int meuNumero;

    public Jogador(int meuNumero) {
        this.meuNumero = meuNumero;
        this.casaAtual = 0; 
    }

    public void jogar(int valorDado, int numeroCasas) {
        casaAtual += valorDado;
        if (casaAtual >= numeroCasas) {
            casaAtual = numeroCasas; 
        }
    }

    public int getCasaAtual() {
        return casaAtual;
    }

    public int getMeuNumero() {
        return meuNumero;
    }
}
