public class Main {
    public static void main(String... args) {
        Mult fivePlusTwo = new Mult(5, 2);
        Div fiveMinusTwo = new Div(5, 2);
        Composite sevenPlusThree = new Composite(fivePlusTwo, fiveMinusTwo);
        System.out.println(sevenPlusThree.calcular());
    }
}