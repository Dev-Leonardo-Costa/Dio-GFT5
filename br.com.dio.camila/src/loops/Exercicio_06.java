package loops;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;


        System.out.print("Digite o numero Fatorial: ");
        fatorial = scan.nextInt();

        int multiplicar = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicar = multiplicar * i;
        }
        System.out.println(multiplicar);
    }
}
