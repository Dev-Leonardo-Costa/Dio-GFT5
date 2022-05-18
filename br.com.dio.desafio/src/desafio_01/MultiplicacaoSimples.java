package desafio_01;

import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        System.out.println("Digite o valor de A e B: ");
        A = sc.nextInt();
        B = sc.nextInt();

        PROD =  A * B; //implemente o código que representa a multiplicação.

        System.out.println("PROD = " + PROD);

        sc.close();

    }
}
