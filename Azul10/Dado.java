package Azul10;

public class Dado {
    int numero;
    Dado(){
        numero = 1;
    }
    public int lanzarDado(){
        numero = (int) (Math.random()*7);
        System.out.println(numero);
        return numero;
    }
}
