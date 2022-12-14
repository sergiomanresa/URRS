package Coordenadas;

public class rectangulo {
    Punto p1,p2,p3,p4;

    public void coordenadas(float x , float y,Punto punto){
        punto.setX(x);
        punto.setY(y);
    }
    public void calcular(){
        float base = p1.getX()+ p4.getX();
        float altura= p1.getY()+ p3.getY();
        float are= base*altura;
    }
}
