package Azul10;

public class Main {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        boolean res = false;
        while(!res){
            res = dado1.lanzarDado() == 6 && dado1.lanzarDado() == 6;
        }
    }
}
