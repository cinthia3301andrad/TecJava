public class Quadrado extends Figura implements Colorida {
    Ponto origem;
    float lado;
    String tipo;

    Quadrado(float lado, float x, float y) {
        setLado(lado);
        tipo = "Quadrado";
        origem = new Ponto(x, y);
    }
    public String toString() {
        return tipo;
    }
    double calcularArea() {
        double area = lado*lado;
        System.out.println("Área - Retângulo: "+area);
        return area;
    }
    void desenhar() {
        System.out.println(toString());
    }
    public void desenhar(String cor) {
        System.out.println(toString()+" "+cor);
    }
    void mover(float dx, float dy) {
        origem.x = x+dx;
        origem.y = y+dy;
        System.out.println("Nova origem da figura movida: "+origem.x +" "+origem.y);
    }

    void setLado(float Llado) {
        lado = Llado;
    }
    float getLado() {
        return lado;
    }

}