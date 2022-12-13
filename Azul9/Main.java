package Azul9;

public class Main {
    public static void main(String[] args) {
        Pajaro hola = new Pajaro("Rojo", "Agaporni", 4);
        Pajaro simon = new Pajaro("Verde", "Canario", 90);
        Pajaro abedul = new Pajaro("Amarillo", "Cigüeña", 57);
        Jaula jaula = new Jaula(hola, simon, abedul);
        jaula.moverJaula();
    }
}
