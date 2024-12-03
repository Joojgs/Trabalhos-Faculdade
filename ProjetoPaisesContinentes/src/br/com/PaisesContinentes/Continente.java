package br.com.PaisesContinentes;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    // Construtor que inicializa o nome do continente
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Método que permite adicionar países ao continente
    public void adicionarPais(Pais pais) {
        if (!paises.contains(pais)) {
            paises.add(pais);
        }
    }

    // Método que retorne a dimensão total do continente
    public double dimensaoTotal() {
        double total = 0;
        for (Pais pais : paises) {
            total += pais.getDimensao();
        }
        return total;
    }

    // Método que retorne a população total do continente
    public long populacaoTotal() {
        long total = 0;
        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }
        return total;
    }

    // Método que retorne a densidade populacional do continente
    public double densidadePopulacional() {
        return populacaoTotal() / dimensaoTotal();
    }

    // Método que retorne o país com maior população no continente
    public Pais paisMaiorPopulacao() {
        if (paises.isEmpty()) return null;
        Pais maiorPopulacao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maiorPopulacao.getPopulacao()) {
                maiorPopulacao = pais;
            }
        }
        return maiorPopulacao;
    }

    // Método que retorne o país com menor população no continente
    public Pais paisMenorPopulacao() {
        if (paises.isEmpty()) return null;
        Pais menorPopulacao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() < menorPopulacao.getPopulacao()) {
                menorPopulacao = pais;
            }
        }
        return menorPopulacao;
    }

    // Método que retorne o país de maior dimensão territorial no continente
    public Pais paisMaiorDimensao() {
        if (paises.isEmpty()) return null;
        Pais maiorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() > maiorDimensao.getDimensao()) {
                maiorDimensao = pais;
            }
        }
        return maiorDimensao;
    }

    // Método que retorne o país de menor dimensão territorial no continente
    public Pais paisMenorDimensao() {
        if (paises.isEmpty()) return null;
        Pais menorDimensao = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() < menorDimensao.getDimensao()) {
                menorDimensao = pais;
            }
        }
        return menorDimensao;
    }

    // Método que retorne a razão territorial do maior país em relação ao menor país
    public double razaoTerritorial() {
        Pais maior = paisMaiorDimensao();
        Pais menor = paisMenorDimensao();
        if (maior != null && menor != null) {
            return maior.getDimensao() / menor.getDimensao();
        }
        return 0;
    }
}
