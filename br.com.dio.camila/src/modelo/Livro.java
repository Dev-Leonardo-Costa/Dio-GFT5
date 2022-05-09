package modelo;

public class Livro {

    private String autor;
    private String biografia;
    private Long numeroPaginas;

    public Livro() {
    }

    public Livro(String autor, String biografia, Long numeroPaginas) {
        this.autor = autor;
        this.biografia = biografia;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", biografia='" + biografia + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
