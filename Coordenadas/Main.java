package Coordenadas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Punto p1=new Punto(0,0);
        Punto p2=new Punto(12,12);
        Punto p3=new Punto(0,20);
        Punto p4=new Punto(16,0);
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el punto y sus cordenadas (x)");
        p1.setX(sc.nextFloat());
        System.out.println("Dime el punto y sus cordenadas (y)");
        p1.setY(sc.nextFloat());


    }
}
