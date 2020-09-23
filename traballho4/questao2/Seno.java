
package traballho4.questao2;
import java.util.*;
import traballho4.questao1.Expression;

public class Seno extends Decorator{
    double elementos;
    public Seno(double elementos) {
        this.elementos = elementos;
    }

    public  double calcular() {
        return (double) Math.sin(elementos);
    }
}