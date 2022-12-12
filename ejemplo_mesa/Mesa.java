package ejemplo_mesa;

public class Mesa {
    String color;
    Float tablero;
    int numero_patas;
    String forma;
    int posicion;
    Mesa(){

    }
    public Mesa(String color, Float tablero, int numero_patas, String forma, int posicion) {
        this.color = color;
        this.tablero = tablero;
        this.numero_patas = numero_patas;
        this.forma = forma;
        this.posicion = posicion;
    }

    //recibe un valor
    public void mover(int posicion){
        //this indica que hace referencia al atributo de la clase
        this.posicion+=posicion;
    }
    public void informacion(){
        System.out.printf("color:%s\ntablero:%.2f\nnumero_patas:%d\nforma:%s\nposicion:%d\n",this.color,this.tablero,this.numero_patas,this.forma,this.posicion);
    }

}
