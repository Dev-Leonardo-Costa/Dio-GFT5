package map.exercicio;

import java.util.*;
import java.util.function.Function;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class ExercicioProsposto {
    public static void main(String[] args) {

        System.out.println("HashMap: Ordem aleatoria");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\nLinkedHashMap: Ordem de inserção");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.println("\nTreeMap: Ordem por id");
        Map<Integer, Contato> agenda2 = new TreeMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\nSet/TreeSet: Ordem número telefone");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
        });
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " + entry.getValue().getNome());
        }

        System.out.println("\nSet/TreeSet: Ordem nome telefone");
//        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
//                return c1.getValue().;
//            }
//        });

// substituido por por uma lambda
//        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
//                new Function<Map.Entry<Integer, Contato>, Integer>() {
//                    @Override
//                    public Integer apply(Map.Entry<Integer, Contato> integerContatoEntry) {
//                        return integerContatoEntry.getValue().getNumero();
//                    }
//                }));
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));

        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " + entry.getValue().getNome());
        }
    }
}

// foi subtituifo por uma class anonima
//class CompararTelefone implements Comparator<Map.Entry<Integer, Contato>> {
//
//    @Override
//    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
//        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
//    }
//}

// foi subtituifo por uma class anonima
//class CompararNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
//    @Override
//    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
//        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
//    }
//}
