package arrays;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoante = 0;
        int contador = 0;

        do {
            System.out.println("Letra:");
            String letra = scan.next();

            if (letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) {

                consoantes[contador] = letra;
                qtdConsoante++;
            }
            contador++;

        } while (contador < consoantes.length);

        for (String consoante : consoantes) {
            if (consoantes != null)
            System.out.print(consoante + " ");
        }

    }
}
