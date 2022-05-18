package map;

import modelo.Livro;

import java.util.*;

public class DentroDoMap {
    public static void main(String[] args) {

        System.out.println("Ordem aleatoria: ");
        Map<String, Livros> meusLivros = new HashMap<>() {{
            put("Martins", new Livros("Codigo Limpo", 100));
            put("AlgaWorks", new Livros("Orientação a objetos", 200));
            put("Kervin", new Livros("inglẽs", 300));
        }};

        for (Map.Entry<String, Livros> livros : meusLivros.entrySet()) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("\nOrdem de seção: ");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>() {{
            put("Martins", new Livros("Codigo Limpo", 100));
            put("AlgaWorks", new Livros("Orientação a objetos", 200));
            put("Kervin", new Livros("inglẽs", 300));
        }};

        for (Map.Entry<String, Livros> livros : meusLivros1.entrySet()) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("\nOrdem alfabetica autores: ");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livros> livros : meusLivros2.entrySet()) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("\nOrdem por nome dos livros: ");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new CompararNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livros : meusLivros3) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("\nOrdem por paginas: ");
        Set<Map.Entry<String, Livros>> meusLivros4 = new TreeSet<>(new CompararPaginas());
        meusLivros4.addAll(meusLivros3);
        for (Map.Entry<String, Livros> livros1 : meusLivros4){
            System.out.println(livros1.getKey() + " - "+ livros1.getValue().getPaginas());
        }
    }
}

class Livros {
    String nome;
    Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class CompararNome implements Comparator<Map.Entry<String, Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class CompararPaginas implements Comparator<Map.Entry<String, Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> ls1, Map.Entry<String, Livros> ls2) {
        return ls1.getValue().getPaginas().compareTo(ls2.getValue().getPaginas());
    }
}
