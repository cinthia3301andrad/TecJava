import java.util.*;

public class WordFrequency3 {
    String texto;

    void FrequenciaInvertida(String texto){ 
        ArrayList<String> palavras = new ArrayList<String>();
        Map<String, Integer> quantidade = new HashMap<>();

        String[] aux = texto.split(" ");

        for(int i = 0; i < aux.length ; i++  ){
            palavras.add(aux[i]);
        }

        for(int i = 0; i < aux.length ; i++ ){
            int frequencia = Collections.frequency(palavras,palavras.get(i));
            quantidade.put(palavras.get(i),frequencia);
        }
        quantidade.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed()).forEach(System.out::println);

    }
}