
package traballho4.questao2;
import java.util.*;
import traballho4.questao1.Expression;

public class Cos extends Decorator{
    double elementos;
    public Cos(double elementos) {
        this.elementos = elementos;
    }

    public  double calcular() {
        return (double) Math.cos(elementos);
    }
}