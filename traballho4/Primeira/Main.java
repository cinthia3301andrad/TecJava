public class Main {
    public static void main(String... args) {
        Mult trestres = new Mult(3, 3);
        Div quatrodois = new Div(4, 2);
        Div seisdois = new Div(6, 2);
        Composite resultado = new Composite(trestres, quatrodois, seisdois);
        System.out.println(resultado.calcular());
    }
}