package lists;

import java.util.*;

public class List_02 {
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

        System.out.println("----------------------------------------");

        System.out.println("Imprima a segunda nota da list: "+ notas.get(2));
        System.out.println(notas);
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a menor nota: " + Collections.max(notas));

        System.out.println("Exiba a soma da notas:");
        double soma = 0d;
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            soma += next;
        }
        System.out.println("Soma:" + soma);
        System.out.println("Exiba agora a media da nota: "+ (soma/notas.size()));
        System.out.println("Remova uma nota: ");
        notas.remove(9d);
        System.out.println(notas);
        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores da lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()){
            Double next = iterator2.next();
            if (next < 7) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Limpar a lista ");
        notas.clear();
        System.out.println(notas);

        System.out.println("A lista esta Vazia ? "+notas.isEmpty());


    }
}
