package autobus;

public class autobus {
    //atributo
   private boolean esElectrico;
    private String linea;
    static float precio;
    private int pasajeros;
    private String constructor;

    //constructores

    public autobus() {

    }

    public autobus(boolean esElectrico, String linea, float precio, int pasajeros, String constructor) {
        this.esElectrico = esElectrico;
        this.linea = linea;
        this.precio = precio;
        this.pasajeros = pasajeros;
        this.constructor = constructor;
    }

    public autobus(boolean esElectrico, String linea, int pasajeros, String constructor) {
        this.esElectrico = esElectrico;
        this.linea = linea;
        this.pasajeros = pasajeros;
        this.constructor = constructor;
    }
    //getter y setter

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public static float getPrecio() {
        return precio;
    }

    public static void setPrecio(float precio) {
        autobus.precio = precio;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    @Override
    public String toString() {
        return "autobus{" +
                "esElectrico=" + esElectrico +
                " linea='" + linea + '\'' +
                " precio=" + precio +
                " pasajeros=" + pasajeros +
                " constructor='" + constructor + '\'' +
                '}';
    }
    public static void cambiarprecio(float valor){
        precio=precio+valor;
    }
}

