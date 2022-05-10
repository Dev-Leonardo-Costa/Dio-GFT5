package loops;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int numero, pares = 0, impares = 0;

        System.out.println("Qauntidades de vezes: ");
        quantNumeros = scan.nextInt();


        int contador = 0;
        do {
            System.out.println("Digite os numeros:");
            numero = scan.nextInt();

            if (pares % 2 == 0) pares++;
            else impares++;

            contador++;
        } while (contador < quantNumeros);

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

    }
}
