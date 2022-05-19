package exceptions.customizadas;

public class NaoExisteDivisaoPorZero extends ArithmeticException{

    private int numerador;
    private int dominador;

    public NaoExisteDivisaoPorZero(int numerador, int dominador) {
        this.numerador = numerador;
        this.dominador = dominador;
    }
}
