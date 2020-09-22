abstract class Figura extends Ponto {

    abstract double calcularArea();

    abstract void desenhar();

    abstract void mover(float dx, float dy);
}
 
   class Ponto {
        float x, y;

        Ponto (float dx, float dy) {
            this.x = dx;
            this.y = dy;
        }
        Ponto () {
            
        }

}
