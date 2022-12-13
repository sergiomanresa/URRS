package Azul9;

public class Pajaro {
    //Atributos
    String color;
    String tipo;
    int edad;

    Pajaro(){}

    public Pajaro(String color, String tipo, int edad) {
        this.color = color;
        this.tipo = tipo;
        this.edad = edad;
    }

    public void Piar(){
        System.out.println(tipo+" PIO");
    }

}
