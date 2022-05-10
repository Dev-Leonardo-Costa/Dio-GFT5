package loops;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int maior = 0;
        int count = 0;
        double soma = 0;

        do {
            System.out.println("Digite os numeros: ");
            number = scan.nextInt();
            soma = soma + number;
            if (number > maior) maior = number;
            count = count + 1;
        }while (count < 3);

        System.out.println("Maior N" + maior);
        System.out.println(soma);
        System.out.println("Media:"+ (soma/3));

    }
}
