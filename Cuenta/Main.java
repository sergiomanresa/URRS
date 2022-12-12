package Cuenta;

public class Main {
    public static void main(String[] args){
        coche coche;

        coche=new coche();

        coche.marca="BMW";
        coche.anyo=2004;
        coche.puertas=4;
        coche.precio=3947;
        coche.revisar_coche();
        coche.informacion();

    }
}
