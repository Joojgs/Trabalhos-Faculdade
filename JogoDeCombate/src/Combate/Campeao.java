package Combate;

public class Campeao {
    private String nome;
    private int vida;
    private int ataque;
    private int armadura;

    public Campeao(String nome, int vida, int ataque, int armadura) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    public void takeDamage(int dano) {
        int danoRecebido = Math.max(dano - this.armadura, 1);
        this.vida = Math.max(this.vida - danoRecebido, 0);
    }

    public String status() {
        return this.nome + ": " + this.vida + " de vida" + (this.vida == 0 ? " (morreu)" : "");
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }
}
