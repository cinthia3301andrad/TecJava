package traballho4.questao1;
import java.util.*;

public interface Expression {
  double calcular();
  default void addChild(Expression elementos) {}
  default void removeChild(Expression elementos) {}
}