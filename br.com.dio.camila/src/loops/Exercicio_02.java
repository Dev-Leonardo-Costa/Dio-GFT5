package loops;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;

        System.out.println("Digite uma nota ");
        nota = scan.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida: informe novamente a nota do aluno. ");
            nota = scan.nextDouble();
        }

        System.out.println("Nota do aluno válida");
    }
}
