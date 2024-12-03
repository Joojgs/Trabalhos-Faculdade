package br.com.PaisesContinentes;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private List<Pais> fronteiras;

    // Construtor que inicializa o código ISO, o nome e a dimensão do país
    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    // Métodos de acesso (getter/setter) para as propriedades código ISO, nome, população e dimensão do país
    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    // Método que permite verificar se dois objetos representam o mesmo país (igualdade semântica)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pais pais = (Pais) obj;
        return codigoISO.equals(pais.codigoISO);
    }

    // Método que informa se outro país é limítrofe do país que recebeu a mensagem
    public boolean isLimitrofe(Pais outroPais) {
        return fronteiras.contains(outroPais);
    }

    // Método que retorna a densidade populacional do país
    public double densidadePopulacional() {
        return populacao / dimensao;
    }

    // Método que recebe um país como parâmetro e retorna a lista de vizinhos comuns aos dois países
    public List<Pais> vizinhosComuns(Pais outroPais) {
        List<Pais> comuns = new ArrayList<>();
        for (Pais pais : fronteiras) {
            if (outroPais.getFronteiras().contains(pais)) {
                comuns.add(pais);
            }
        }
        return comuns;
    }

    // Método para adicionar um país à lista de fronteiras
    public void adicionarFronteira(Pais pais) {
        if (fronteiras.size() < 40 && !fronteiras.contains(pais)) {
            fronteiras.add(pais);
        }
    }
}
