package dos;

import java.util.Scanner;

public class Cuenta {
    //Atributos
    String nombreCliente;
    String numerocuenta;
    double tipoInteres;
    double saldo;

    //Constructores
    Cuenta(){}

    public Cuenta(String nombreCliente, String numerocuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numerocuenta = numerocuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombreCliente;
    }

    public void setNombre(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numerocuenta;
    }

    public void setNumeroCuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    boolean ingreso(double dinero){
        if(dinero <= 0){
            System.out.println("Ingreso fallido");
            return false;
        }
        saldo += dinero;
        return true;
    }

    boolean reintegro(double dinero){
        if(dinero>=0){
            System.out.println("Ingreso fallido");
            return false;
        }
        saldo -= dinero;
        return true;
    }
    boolean transferencia(Cuenta cuenta, double dinero){
        if(dinero > cuenta.saldo){
            System.out.println("Operación no permitida");
            return false;
        }
        cuenta.saldo -= dinero;
        this.saldo += dinero;
        return true;
    }
}




