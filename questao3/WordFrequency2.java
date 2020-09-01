import java.util.*;

public class WordFrequency2 {

    String texto;

    void Frequencia(String texto){ 
        ArrayList<String> palavras = new ArrayList<String>();
        NavigableMap<String, Integer> quantidade = new TreeMap<>();

        String[] aux = texto.split(" ");

        for(int i = 0; i < aux.length ; i++  ){
            palavras.add(aux[i]);
        }

        for(int i = 0; i < aux.length ; i++ ){
            int frequencia = Collections.frequency(palavras,palavras.get(i));
            quantidade.put(palavras.get(i),frequencia);
        }
        for(Map.Entry<String, Integer> entry: quantidade.entrySet()) {
            System.out.println(entry.toString());
        }




    }

}