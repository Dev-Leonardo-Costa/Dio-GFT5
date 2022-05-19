package exceptions.customizadas;

import javax.swing.*;

public class CustomizadaException {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denomidor = {1, 4, 0, 2,8};

        for (int i = 0; i < denomidor.length; i++) {
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denomidor[i]);
                int resultado = numerador[i] / denomidor[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Não pode fazer divisão com 0");
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Nao pode fazer esse tipo de divisão");
            }finally {
                continua();
            }
        }
    }

    static void continua() {
        System.out.println("Continua...");
    }
}
