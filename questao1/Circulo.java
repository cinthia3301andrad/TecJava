
public class Circulo extends Figura {
        Ponto centro;
        int raio;
        String tipo;

        Circulo (int raio, float x, float y){
            setRaio(raio);
            tipo = "Circulo";
            centro = new Ponto(x, y);
        }   
        public String toString() {
            return tipo;
        }     
        double calcularArea() {
            double area = 3.14*raio*raio;
            System.out.println("Área- Círculo: "+area);
            return area;
            
        }
        void desenhar() {
            System.out.println(toString());
        }
        void mover(float dx, float dy) {
            centro.x = x+dx;
            centro.y = y+dy;
            System.out.println("Nova origem da figura movida: "+centro.x +" "+centro.y);
        }

        void setRaio(int Rraio) {
            raio = Rraio;
        }

        Ponto getCentro() {
            return centro;
        }
        int getRaio() {
            return raio;
        }

        
    }