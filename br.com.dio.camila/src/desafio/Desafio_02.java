package desafio;

import java.util.Scanner;

public class Desafio_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite ");
        String input = scan.nextLine();

        String[] inputSplit = input.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
        double media = Double.parseDouble(input) / Double.parseDouble(String.valueOf(inputSplit));

        System.out.printf("%.2f",media);
    }
}

