package Azul6;

public class Empleado {
    String nombre;
    long dni;
    String puesto;
    float sueldoBase;
    Empleado(String nombre, long dni, String puesto, float sueldoBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.puesto = puesto;
        this.sueldoBase = sueldoBase;
    }
    void mostrarDatos(){
        System.out.println("URRS.Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Puesto: " + puesto);
        System.out.println("Sueldo base: " + sueldoBase);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }
}
