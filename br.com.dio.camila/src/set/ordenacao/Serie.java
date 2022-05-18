package set.ordenacao;

import java.util.Objects;

public class Serie implements  Comparable<Serie>{

    private String nome;
    private String genero;
    private Integer tempoDeEpsodio;

    public Serie(String nome, String genero, Integer tempoDeEpsodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoDeEpsodio = tempoDeEpsodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoDeEpsodio() {
        return tempoDeEpsodio;
    }

    public void setTempoDeEpsodio(Integer tempoDeEpsodio) {
        this.tempoDeEpsodio = tempoDeEpsodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoDeEpsodio=" + tempoDeEpsodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoDeEpsodio.equals(serie.tempoDeEpsodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoDeEpsodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpsodio = Integer.compare(this.getTempoDeEpsodio(), serie.getTempoDeEpsodio());
        if (tempoEpsodio != 0) return tempoEpsodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}
