package Azul7;

import Azul6.Empleado;

public class Nomina {
    int mes;
    int anyo;
    double retencion;
    Empleado empleado;
    void Calcular(){
        System.out.println("El sueldo limpio es: " + (empleado.getSueldoBase()*retencion/100));
    }
}
