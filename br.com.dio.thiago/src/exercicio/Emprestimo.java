package exercicio;

import java.util.Scanner;

public class Emprestimo {

//    public static int getDuasParcelas() {
//        return 2;
//    }
//
//    public static int getTresParcelas() {
//        return 3;
//    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular() {
        double valor;
        int parcelas;

        Scanner digito = new Scanner(System.in);
        System.out.println("Digito o valor do emprestimo ");
        valor = digito.nextDouble();
        System.out.println("Opção de parcelas em 2 ou 3 com acrescimo");
        parcelas = digito.nextInt();

        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("valor do emprestimo para 2 parcelas R$" + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("valor do emprestimo para 3 parcelas R$" + valorFinal);
        } else {
            System.out.println("Quantidades de parcelas não permitida");
        }
    }
}
