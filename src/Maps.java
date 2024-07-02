
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Double> carros = new HashMap<>();
        carros.put("Gol", 14.4);
        carros.put("Uno", 15.6);
        carros.put("Mobi", 16.1);
        carros.put("Hb20", 14.5);
        carros.put("Kwid", 15.6);

        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            System.out.println("Modelo do carro: " + entry.getKey() + " ,Consumo por km: " + entry.getValue());
        }

        // PUT É QUANDO DESEJA ADICIONAR UM NOVO PAR CHAVE-VALOR OU ATUALIZAR UM VALOR
        // EXISTENTE, INDEPENDENTEMENTE DA PRESENÇA DA CHAVE
        // REPLACE SUBSTITUI UM VALOR EXISTENTE APENAS SE A CHAVE CORREPONDENTE ESTIVER
        // PRESENTE NO MAPEAMENTO
        carros.replace("Gol", 43.2);
        carros.put("Mobi", 19.2);

        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            System.out.println("Modelo do carro: " + entry.getKey() + " ,Consumo por km: " + entry.getValue());
        }

        System.out.println("Conferir se está no dicionário: " + carros.containsKey("Gol"));

        System.out.println("Consumo de um dos carros: " + carros.get("Gol"));

        System.out.println("Modelos: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Consumos: ");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        System.out.println("Modelo mais economico é: ");

        Double max = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String economico = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(max))
                economico = entry.getKey();
        }

        System.out.println(economico + " - " + max);

        System.out.println("Modelo menos economico é: ");
        Double min = Collections.min(carros.values());
        String gastos = "";
        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            if (entry.getValue().equals(min))
                gastos = entry.getKey();
        }
        System.out.println(gastos + " - " + min);

        System.out.println("Soma dos consumos: ");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();

        }
        System.out.println(soma);

        System.out.println("A média dos carros é de: " + (soma / carros.size()));

        System.out.println("Remoção: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6))
                iterator1.remove();
        }
        System.out.println(carros);

        Map<String, Double> carros1 = new LinkedHashMap<>();

        carros1.put("Gol", 14.4);
        carros1.put("Uno", 15.6);
        carros1.put("Mobi", 16.1);
        carros1.put("Hb20", 14.5);
        carros1.put("Kwid", 15.6);

        System.out.println(carros1.toString());

        System.out.println("Ordenado pelo modelo: ");
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println(carros2.toString());

        System.out.println("Apague tudo");
        carros2.clear();
        System.out.println(carros2);

        System.out.println("Verifique se está apagado: " + carros2.isEmpty());

        // Map<Integer, String> calendario = new HashMap<>();

        // APARENTEMENTE FUNCIONA QUE NEM O SET ONDE NÃO HÁ A DUPLICAÇÃO DE CHAVES MAS
        // DE VALORES SIM
        // calendario.put(1, "Janeiro");
        // calendario.put(2, "Fevereiro");
        // calendario.put(3, "Março");
        // calendario.put(4, "Abril");
        // calendario.put(5, "Maio");
        // calendario.put(6, "Junho");
        // calendario.put(6, "Junho");

        // for (Map.Entry<Integer, String> entry : calendario.entrySet()) {
        // System.out.println("Número do mês: " + entry.getKey() + " Nome do mês: " +
        // entry.getValue());
        // }
    }
}
