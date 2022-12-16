package URRS.Cafetera;

public class Cafetera {

    private int capacidadMaxima=1000;
    private int cantidadActual=0;

    public Cafetera() {}

    public Cafetera(int capacidadMaxima) {
        this.cantidadActual = this.capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        if(cantidadActual > capacidadMaxima)
            cantidadActual = capacidadMaxima;
    }
    void llenarCafetera(){
        cantidadActual =capacidadMaxima;
    }
    void servirTaza(int Cantidad){
        if (Cantidad > cantidadActual){
            cantidadActual = 0;
            System.out.println("Se ha servido toda la taza");
        }
        else{
            cantidadActual -= Cantidad;
        }
    }
    void vaciarCafetera(){
        cantidadActual = 0;
    }
    void agregarCafe(int cafe){
        cafe=12;
        cantidadActual= cantidadActual+cafe;
    }
}

