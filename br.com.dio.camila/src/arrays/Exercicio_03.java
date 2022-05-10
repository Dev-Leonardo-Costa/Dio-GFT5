package arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorio = new int[20];

        for (int i = 0; i < numerosAleatorio.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorio[i] = numero;
        }
        System.out.printf("Os aleatorios ");
        for (int numero : numerosAleatorio) {
            System.out.print(numero + " ");
        }

        System.out.printf("\nSucessores: ");
        for (int numero : numerosAleatorio) {
            System.out.print((numero + 1) + " ");
        }

        System.out.printf("\nAntecessores: ");
        for (int numero : numerosAleatorio) {
            System.out.print((numero - 1) + " ");
        }
    }
}
