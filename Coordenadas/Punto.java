package Coordenadas;

import java.util.Scanner;

public class Punto {
   private float x = 0f;
   private float y = 0f;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void Cambio (){
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime una coordenada X:");
        x = sc.nextFloat();
        System.out.println("Dime una coordenada Y:");
        y = sc.nextFloat();
    }

    public void imprimir(){
        System.out.println("Coordenada X="+x);
        System.out.println("Coordenada Y="+y);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
