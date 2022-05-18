package set.ordenacao;

import java.util.Comparator;

public class ComparatorPorTempoEpsodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {

        return Integer.compare(s1.getTempoDeEpsodio(), s2.getTempoDeEpsodio());
    }
}
