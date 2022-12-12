package Cuenta;

import java.util.Scanner;

public class coche {
    Scanner scanner=new Scanner(System.in);
    String matricula="";
    String marca="";
    String color="";
    int puertas=0;
    String motor="";
    int precio=0;
    boolean nuevo=false;
    boolean revisado=false;
    boolean cambio_aceite=false;
    int anyo=0;

    public coche(String marca, String color, int puertas, String motor, int precio, boolean nuevo, boolean revisado, boolean cambio_aceite, int anyo) {
        this.marca = marca;
        this.color = color;
        this.puertas = puertas;
        this.motor = motor;
        this.precio = precio;
        this.nuevo = nuevo;
        this.revisado = revisado;
        this.cambio_aceite = cambio_aceite;
        this.anyo = anyo;
    }

    public coche() {

    }

    public boolean revisar_coche(){
        String respuesta;
        String respuesta2;
        System.out.println("¿se a cambiado el aceite?(si en minúsculas o no):");
        respuesta= scanner.nextLine();

        System.out.println("¿Tiene mas de 12 años?(responde con si o no):");
        respuesta2= scanner.nextLine();

        return respuesta.equals("si") && respuesta2.equals("no");
    }
    public void informacion(){
        System.out.printf(" marca:%s \n anyo:%d \n puertas:%d \n precio:%d",this.marca,this.anyo,this.puertas,this.precio);

    }


}

