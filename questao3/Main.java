import java.util.*;
public class Main {

    public static void main(String[] args) {
        CountWords p1 = new CountWords();
        Scanner ler1 = new Scanner(System.in);

        WordFrequency p2 = new WordFrequency();
        Scanner ler2 = new Scanner(System.in);

        String texto1;
        String texto2;
        //LETRA A 
        System.out.println("Informe o texto: ");
        texto1 = ler1.nextLine();

        p1.contardorPalavras(texto1);
        //LETRA B
        System.out.println("Informe um segundo texto: ");
        texto2 = ler1.nextLine();
        p2.contardorPalavrasTotais(texto2);
    
}

}