package map;

import java.util.*;

public class EntendendoMap {
    public static void main(String[] args) {

        Map<String, Double> carroPopular = new HashMap<>() {{
            put("Chevet", 2.8);
            put("Corola", 3.8);
            put("Civic", 2.4);
            put("Sw4", 15.4);
        }};
        System.out.println(carroPopular);

        System.out.println("\nSubstitua o consumo do Civic 15.4: ");
        carroPopular.put("Civic", 15.4);
        System.out.println(carroPopular);

        System.out.println("\nVerifique se o carro civic esta adicionado: "
                + carroPopular.containsKey("Civic"));

        System.out.println("\nExiba os modelos dos carros");
        Set<String> modelos = carroPopular.keySet();
        System.out.println(modelos);

        System.out.println("\nConsumos dos carros: ");
        Collection<Double> consumo = carroPopular.values();
        System.out.println(consumo);

        System.out.println("\nExiba o carro mais economico: ");
        Double consumoMaisEficiente = Collections.max(carroPopular.values());
        Set<Map.Entry<String, Double>> entries = carroPopular.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo eficiente " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("\nCarro com menos efiencia no consumo ");
        Double consumoMenosEficiente = Collections.min(carroPopular.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carroPopular.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Carro menos eficiente " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Soma dos consumos dos carro ");
        Iterator<Double> iterator = carroPopular.values().iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma " + soma);

        System.out.println("Exiba a divisão do consumo " + (soma / carroPopular.size()));

//        System.out.println("Remova os carro com menor consumo ");
//        Iterator<Double> iterator1 = carroPopular.values().iterator();
//        while (iterator1.hasNext()) {
//            if (iterator1.hasNext()equals(2.4)) return iterator1.remove();
//        }
//        System.out.println(carroPopular);

        System.out.println("Todos os carro na ordem que foram informados: ");
        Map<String, Double> carroPopulares = new LinkedHashMap<>() {{
            put("Chevet", 2.8);
            put("Corola", 3.8);
            put("Civic", 2.4);
            put("Sw4", 15.4);
        }};
        System.out.println(carroPopulares);

        System.out.println("Imprima os carro na ordem alfabetica: ");
        Map<String, Double> carroPopulares1 = new TreeMap<>(carroPopulares);
        System.out.println(carroPopulares1);

        System.out.println("Apagando o dicionario de carros: ");
        carroPopulares1.clear();

        System.out.println("olhando se foi removido: "+ carroPopulares1.isEmpty());
    }
}
