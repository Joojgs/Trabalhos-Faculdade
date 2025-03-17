package jogo;

import java.util.Random;

public class Dado {
	private int numeroAtual;
	
	public int rolar() {
        Random random = new Random();
        numeroAtual = random.nextInt(6) + 1;
        return numeroAtual;
    }

}
