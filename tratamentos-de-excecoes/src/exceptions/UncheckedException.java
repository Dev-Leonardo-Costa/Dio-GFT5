package exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        Boolean continueLoop = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Dominador: ");

            try {
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.println("Resultado: " + resultado);
                continueLoop = false;

            } catch (NumberFormatException exception) {
                JOptionPane.showInputDialog(null, "Valor invalido, Digite nomeros Inteiro");
//            exception.printStackTrace();
            } catch (ArithmeticException exception) {
                JOptionPane.showInputDialog(null, "impossivel de dividir um numero por 0");
            } finally {
                codigoContinua();
            }
        } while (continueLoop);

    }

    public static double dividir(double a, double b) {
        return a / b;
    }
    static void codigoContinua(){
        System.out.println("Codigo continua...");
    }
}
