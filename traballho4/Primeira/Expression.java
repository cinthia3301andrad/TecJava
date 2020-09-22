
import java.util.*;

public interface Expression {
  double calcular();
  default void addChild(Expression arithmetic) {}
  default void removeChild(Expression arithmetic) {}
}