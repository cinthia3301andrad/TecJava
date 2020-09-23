
package traballho4.questao2;
import java.util.*;
import traballho4.questao1.Expression;
public abstract class Decorator implements Expression

{
    final List<Expression> operations = new ArrayList<>();

    public Decorator(Expression... elementos) {
        operations.addAll(Arrays.asList(elementos));
    }
}