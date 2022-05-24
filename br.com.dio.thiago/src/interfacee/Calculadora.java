package interfacee;

public class Calculadora implements OperacaoMatematica {

    @Override
    public void somar(double operador1, double operador2) {
        System.out.println("SOMA " + operador1 + operador2);
    }

    @Override
    public void subtrair(double operador1, double operador2) {
        System.out.println("SUBTRAÇAO " + (operador1 - operador2));
    }

    @Override
    public void dividir(double operador1, double operador2) {
        System.out.println("DIVISAO " + operador1 / operador2);
    }

    @Override
    public void multiplicar(double operador1, double operador2) {
        System.out.println("MULTIPLICAÇAO " + operador1 * operador2);
    }
}
