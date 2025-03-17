package jogo;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
	private Tabuleiro meuTabuleiro;
    private List<Jogador> meusJogadores;
    private Dado meuDado;
    private int jogadorAtual;

    public Jogo(int numeroCasas, int numeroJogadores) {
        meuTabuleiro = new Tabuleiro(numeroCasas);
        meusJogadores = new ArrayList<>();
        meuDado = new Dado();
        jogadorAtual = 0;
        
        for (int i = 1; i <= numeroJogadores; i++) {
            meusJogadores.add(new Jogador(i));
        }
    }

    public void proximaJogada() {
        Jogador jogador = meusJogadores.get(jogadorAtual);
        int valorDado = meuDado.rolar();
        jogador.jogar(valorDado, meuTabuleiro.getNumeroCasas());
        System.out.println("Jogador " + jogador.getMeuNumero() + " jogou o dado: " + valorDado);
        System.out.println("Jogador " + jogador.getMeuNumero() + " está na casa: " + jogador.getCasaAtual());

        jogadorAtual = (jogadorAtual + 1) % meusJogadores.size();
    }

    public void informarPosicoes() {
        for (Jogador jogador : meusJogadores) {
            System.out.println("Jogador " + jogador.getMeuNumero() + " está na casa: " + jogador.getCasaAtual());
        }
    }

}
