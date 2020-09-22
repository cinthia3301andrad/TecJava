
class Main {
    public static void main (String args[]) {
  
        Quadrado quad1 = new Quadrado(5, 0, 0);
        Quadrado quad2 = new Quadrado(5, 4, 4);
        Circulo circ1 = new Circulo(5, 0, 0);
        Circulo circ2 = new Circulo(2, 1, 1);
        //TESTES PARTE 1
        System.out.println(quad1.origem.x +" "+ quad1.origem.y);
        quad1.mover(2, 2);
        quad1.desenhar("Rosa");
        quad1.calcularArea();

        System.out.println(quad2.origem.x +" "+ quad2.origem.y);
        quad2.mover(3, 3);
        quad2.desenhar();
        quad2.calcularArea();

        System.out.println(circ1.centro.x +" "+ circ1.centro.y);
        circ1.mover(5, 5);
        circ1.desenhar();
        circ1.calcularArea();

        System.out.println(circ2.centro.x +" "+ circ2.centro.y);
        circ2.mover(7, 8);
        circ2.desenhar();
        circ2.calcularArea();
        System.out.println("-------------------------------------");
    }
}