package set;

import java.util.*;

public class ConhecendoMetodosSet {
    public static void main(String[] args) {


        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 6d, 8.5d, 10.0, 5.5, 6.3, 7.5));
        System.out.println(notas);

        /*
        Na interface Set não conseguimos trabalhar com posição,
        não temos acessos com get e nem o metodo indexOf(),
        Não podemos fazer subtuição de notas porque não temos acesso com set para fazer uma modificação no valor,

         */

        System.out.println("Confira se a nota 10 esta no conjunto \n" + notas.contains(10d));
        System.out.println("Qual a menor nota " + Collections.min(notas));
        System.out.println("Qual a maior nota " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Qual a media " + soma / notas.size());
        System.out.println("Remova uma nota ");
        notas.remove(10d);
        System.out.println(notas);

        System.out.println("Remova as notas menores da lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            //para remover a menor so mudar a logica
            if (next >= 7) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas conforme que forem informadas ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(10d);
        notas2.add(4d);
        notas2.add(6d);
        notas2.add(7.5d);
        notas2.add(8d);
        notas2.add(9d);
        System.out.println(notas2);

        System.out.println("IMprimir as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        notas.clear();
        notas2.clear();
        notas3.clear();

        System.out.println("O conjunto esta vazio? " + notas.isEmpty());
        System.out.println("O conjunto esta vazio? " + notas2.isEmpty());
        System.out.println("O conjunto esta vazio? " + notas3.isEmpty());
    }
}
