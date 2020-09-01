
import java.util.*;

public class WordFrequency {

    int quantTotal = 0;
    String palavra;

    int getQuantTotal() {
        return this.quantTotal;
    }


    void contardorPalavrasTotais(String palavra) {
        this.palavra = palavra;
      
        ArrayList<String> palavras = new ArrayList<String>();
        Map<String, Integer> cont = new HashMap<>();
        String[] aux = palavra.split(" ");

        for(int i=0; i<aux.length; i++) {
            palavras.add(aux[i]);
            quantTotal++;
        }
        

        for(String key: palavras) {
            if(cont.containsKey(key)) {
                cont.put(key, cont.get(key) + 1);
                
            } else {
                cont.put(key, 1);
            }
        }
        System.out.println("valores: ");
        cont.entrySet().stream().forEach(System.out::println);
        
       

    }
}