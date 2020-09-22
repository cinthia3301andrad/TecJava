import java.util.*;
public class Main {

    public static void main(String[] args) {
        CountWords p1 = new CountWords();
        Scanner ler1 = new Scanner(System.in);

        WordFrequency p2 = new WordFrequency();
        Scanner ler2 = new Scanner(System.in);

        WordFrequency2 p3 = new WordFrequency2();
        Scanner ler3 = new Scanner(System.in);

        WordFrequency3 p4 = new WordFrequency3();
        Scanner ler4 = new Scanner(System.in);

        WordFrequency4 p5 = new WordFrequency4();
        Scanner ler5 = new Scanner(System.in);
        

        String texto1;
        String texto2;
        String texto3;
        String texto4;
        String texto5;
        //LETRA A 
        System.out.println("Informe o texto: ");
        texto1 = ler1.nextLine();
        p1.contardorPalavras(texto1);

        //LETRA B
        System.out.println("Informe um segundo texto: ");
        texto2 = ler2.nextLine();
        p2.contardorPalavrasTotais(texto2);

        //LETRA C
        System.out.println("Informe um terceiro texto: ");
        texto3 = ler3.nextLine();
        p3.Frequencia(texto3);

        //LETRA D
        System.out.println("Informe um quarto texto: ");
        texto4 = ler4.nextLine();
        p4.FrequenciaInvertida(texto4);

        //LETRA E
        System.out.println("Informe um quinto texto: ");
        texto5 = ler5.nextLine();
        p5.FrequenciaInvertidaDecres(texto5);
    
}

}