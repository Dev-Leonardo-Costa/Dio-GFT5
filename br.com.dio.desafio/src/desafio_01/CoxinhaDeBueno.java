package desafio_01;

import java.util.Scanner;

public class CoxinhaDeBueno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valores: ");
        String input = scan.nextLine();

        String[] inputSplit = input.split("");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
        double media = Double.parseDouble(input) / Double.parseDouble(input);

        System.out.printf("%.2f",media);
    }
}
