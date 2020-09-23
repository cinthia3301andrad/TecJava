package traballho4.questao2;
import traballho4.questao1.Mult;
import traballho4.questao1.Composite;
public class Main {
    public static void main(String... args) {
        Mult trestres = new Mult(0, 0);
        Mult quatrodois = new Mult(0, 0);

        Composite resultado = new Composite(trestres, quatrodois);
        double result = resultado.calcular();

        //SENO 
        System.out.println(new Seno(result).calcular());
        //COSSENO
        System.out.println(new Cos(result).calcular());

    }
}