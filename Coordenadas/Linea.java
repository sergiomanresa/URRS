package Coordenadas;

public class Linea {

    Punto p1 = new Punto(9.0f, 8.0f);
    Punto p2 = new Punto(11.0f, 10.f);
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public void calcularLongitud(){
        float distancia= (float) Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()- p2.getY(),2));
    }
}
