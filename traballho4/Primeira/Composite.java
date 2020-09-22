import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite implements Expression {
  final List<Expression> operations = new ArrayList<>();

  public Composite(Expression... arithmetics) {
      operations.addAll(Arrays.asList(arithmetics));
  }


  public double calcular() {
      return operations.stream().mapToDouble(Expression::calcular).sum();
  }

 
  public void addChild(Expression arithmetic) {
      operations.add(arithmetic);
  }

 
  public void removeChild(Expression arithmetic) {
      operations.remove(arithmetic);
  }
}