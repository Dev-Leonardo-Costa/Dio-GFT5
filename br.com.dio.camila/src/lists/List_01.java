package lists;

import java.util.ArrayList;
import java.util.List;

public class List_01 {
    public static void main(String[] args) {
        System.out.println("Criando uma lista e adicione as 7 notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.3);
        notas.add(6.0);
        notas.add(8.1);
        notas.add(7.8);
        notas.add(9.0);
        notas.add(8.5);
        notas.add(5.0);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0 da lista:" + notas.indexOf(5d));

        System.out.println("Adicione a nota 8.0 na posição 4:");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substuindo a nota 5.0 por 3.0: ");
        notas.set(notas.indexOf(5d), 3.0);
        System.out.println(notas);

        System.out.println("Verifica se existe a nota");
        System.out.println("vericando se a nota 5.0 esta na lista: " + notas.contains(5.0d));

        System.out.println("Imprimir todas as notas que ta na lista: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
