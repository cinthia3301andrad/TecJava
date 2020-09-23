package traballho4.questao1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite implements Expression {
  final List<Expression> operations = new ArrayList<>();

  public Composite(Expression... elementos) {
      operations.addAll(Arrays.asList(elementos));
  }


  public double calcular() {
      return operations.stream().mapToDouble(Expression::calcular).sum();
  }

 
  public void addChild(Expression elementos) {
      operations.add(elementos);
  }

 
  public void removeChild(Expression elementos) {
      operations.remove(elementos);
  }
}