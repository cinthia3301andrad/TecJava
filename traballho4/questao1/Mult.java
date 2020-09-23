package traballho4.questao1;
public class Mult implements Expression {
  private final double x;
  private final double y;

  public Mult(double x, double y) {
      this.x = x;
      this.y = y;
  }


  public double calcular() {
      return x * y;
  }
}