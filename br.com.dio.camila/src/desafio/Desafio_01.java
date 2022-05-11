package desafio;

import java.util.Scanner;

public class Desafio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, prod;

        System.out.println("Digite valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite valor de b: ");
        b = sc.nextInt();

        prod =  a * b; //implemente o código que representa a multiplicação.

        System.out.println("PROD = " + prod);
    }
}
