package Coordenadas;

public class triangulo {
    Punto p1,p2,p3;

    public void coordenadas(float x , float y,Punto punto){
        punto.setX(x);
        punto.setY(y);
    }
    public void calcularArea(){
       float base= p1.getX()+ p3.getX();
       float altura= p1.getY()+p2.getY();
       float area=(base*altura)/2;
    }

}
