
package traballho4.questao2;
import java.util.*;
import traballho4.questao5.RandomGaussian;

public abstract class Sort implements RandomGaussian {

    public static void main(String...aAStrings) {

        LerArquivo();
        File file = new File("random.txt"); 
        file.delete();

        

    }

    private static String LerArquivo() {
        try (
            BufferedReader bufferLer = new BufferedReader(new FileReader("random.txt"));

        ) {
            String linha = "";
            while (true) {
                
                if (linha != null) {
                    System.out.println(linha);
                }else {
                    break;
                }
                linha = bufferLer.readLine();
                
                
             }
             return linha;
            
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    
     

}