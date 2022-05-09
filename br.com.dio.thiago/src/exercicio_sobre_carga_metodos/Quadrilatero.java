package exercicio_sobre_carga_metodos;

public class Quadrilatero {

    public static void area(double lados) {
        System.out.println("Area do quadrado: " + lados * lados);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Area do retangulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior,double baseMenor, double altura) {
        System.out.println("Area do trapezio: " +((baseMaior + baseMenor) * altura) / 2 );
    }

    public static void area(float diagonal1, float diagonal2){
        System.out.println("Area  da diagonal "+ (diagonal1 * diagonal2)/2);
    }
}
