package br.com.PaisesContinentes;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de País
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        brasil.setPopulacao(213317639);

        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        argentina.setPopulacao(45195777);

        Pais uruguai = new Pais("URY", "Uruguai", 176215);
        uruguai.setPopulacao(3473727);

        // Adicionando fronteiras
        brasil.adicionarFronteira(argentina);
        brasil.adicionarFronteira(uruguai);
        argentina.adicionarFronteira(brasil);
        uruguai.adicionarFronteira(brasil);

        // Criando instância de Continente
        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(uruguai);

        // Exibindo informações
        System.out.println("Dimensão total do continente: " + americaDoSul.dimensaoTotal() + " km²");
        System.out.println("População total do continente: " + americaDoSul.populacaoTotal());
        System.out.println("Densidade populacional do continente: " + americaDoSul.densidadePopulacional() + " hab/km²");
        System.out.println("País com maior população: " + americaDoSul.paisMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + americaDoSul.paisMenorPopulacao().getNome());
        System.out.println("País de maior dimensão territorial: " + americaDoSul.paisMaiorDimensao().getNome());
        System.out.println("País de menor dimensão territorial: " + americaDoSul.paisMenorDimensao().getNome());
        System.out.println("Razão territorial do maior país em relação ao menor país: " + americaDoSul.razaoTerritorial());
    }
}''