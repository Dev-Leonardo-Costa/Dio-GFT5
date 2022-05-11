package lists.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenacao_01 {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("jon", "Cinza", 12));
            add(new Gato("jon", "Preto", 18));
            add(new Gato("simba", "Amarelo", 6));
        }};
        System.out.println("Ordem de inserção");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatoria");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordenar por idade");
//        Collections.sort(meusGatos, new CompararIdade());
        meusGatos.sort(new CompararIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem com a cor");
        Collections.sort(meusGatos, new CompararCor());
//        meusGatos.sort(new CompararCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Cor Idade Nome");
        Collections.sort(meusGatos, new ComapararCorIdadeNome());
        System.out.println(meusGatos);
    }
}


class Gato implements Comparable<Gato> {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato() {
    }

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class CompararIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class CompararCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComapararCorIdadeNome implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
