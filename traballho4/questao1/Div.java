package traballho4.questao1;
public class Div implements Expression {
    private final double x;
    private final double y;

    public Div(double x, double y) {
        this.x = x;
        this.y = y;
    }

 
    public double calcular() {
        return x / y;
    }
}