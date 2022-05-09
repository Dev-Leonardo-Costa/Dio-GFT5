import modelo.Animal;
import modelo.Livro;

public class Principal {
    public static void main(String[] args) {
        Animal gato = new Animal("Romerio", "Preto", 3);
        System.out.println(gato);

        Livro chapeuzinho = new Livro("chico jose", "chapeuzinho vermelho", new Long(103));
        System.out.println(chapeuzinho);
    }
}
