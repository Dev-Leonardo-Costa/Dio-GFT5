package set.ordenacao;

import java.util.Comparator;

public class ComparatorPorNome implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getNome().compareToIgnoreCase(s2.getNome());
    }
}
