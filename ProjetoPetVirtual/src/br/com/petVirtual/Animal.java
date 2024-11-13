package br.com.petVirtual;

public class Animal {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean estado; // true = vivo, false = morto
    private int caloria;
    private int forca;

    public Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.estado = true;
        this.caloria = 10;
        this.forca = 10;
    }

    public void morrer() {
        this.forca = 0;
        this.estado = false;
        System.out.println("O animal morreu!");
    }

    public void comer() {
        if (this.estado && this.caloria < 100) {
            this.caloria += 10;
            this.forca -= 2;
            System.out.println("O animal comeu e agora sua força é " + this.forca + " e suas calorias valem " + this.caloria + ".");
        } else {
            System.out.println("O animal não pode comer.");
        }
    }

    public void correr() {
        if (this.estado && this.caloria > 0) {
            this.forca -= 5;
            this.caloria -= 5;
            System.out.println("O animal está correndo!! Agora sua força é de " + this.forca + " e suas calorias valem " + this.caloria + ".");
        } else {
            System.out.println("O animal não pode correr.");
        }
    }

    public void dormir() {
        if (this.estado) {
            this.forca += 10;
            this.caloria -= 2;
            System.out.println("O animal está dormindo agora! Sua força aumentou para " + this.forca + " e suas calorias diminuíram para " + this.caloria + ".");
        } else {
            System.out.println("O animal não pode dormir.");
        }
    }

    // Getters para os atributos
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getFamilia() {
        return familia;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getCaloria() {
        return caloria;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", familia='" + familia + '\'' +
                ", idade=" + idade +
                ", estado=" + (estado ? "vivo" : "morto") +
                ", caloria=" + caloria +
                ", forca=" + forca +
                '}';
    }
}
