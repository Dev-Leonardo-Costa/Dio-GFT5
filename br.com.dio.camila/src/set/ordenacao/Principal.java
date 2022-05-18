package set.ordenacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {
    public static void main(String[] args) {

        System.out.println("HashSet > Ordem aleatoria ");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("Homem de Ferro", "Ação", 60));
            add(new Serie("Os Brothers", "comédia", 60));
            add(new Serie("O segredo da Lua", "ficção cientifica", 80));
        }};
        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoDeEpsodio());

        System.out.println("\nLinkedHashSet > Ordem de inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("Homem de Ferro", "Ação", 60));
            add(new Serie("Os Brothers", "comédia", 60));
            add(new Serie("O segredo da Lua", "ficção cientifica", 80));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoDeEpsodio());

        System.out.println("\nTreeSet > Ordem natural ");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoDeEpsodio());


        System.out.println("\n Ordem nome/genero/tempoepsodio  ");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpsodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoDeEpsodio());


        System.out.println("\nOrdem por nome ");
        Set<Serie> minhasSerie4 = new TreeSet<>(new ComparatorPorNome());
        minhasSerie4.addAll(minhasSeries);
        for (Serie serie : minhasSerie4)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoDeEpsodio());

        System.out.println("\nOrdem por tempoEpsodio ");
        Set<Serie> minhasSerie5 = new TreeSet<>(new ComparatorPorTempoEpsodio());
        minhasSerie5.addAll(minhasSeries);
        for (Serie serie : minhasSerie5)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoDeEpsodio());

    }
}
