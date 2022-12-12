package ejemplo_mesa;

public class Main {
    public static void main(String[] args) {
        Mesa mesa_rustica,mesa_moderna,mesa_auxiliar;

        //como instanciar
        mesa_rustica=new Mesa();
        mesa_moderna=new Mesa();
        mesa_auxiliar=new Mesa();

        //entre los parentesis un constructor ponen los valores pero asi se hace a mano
        mesa_rustica.color="roble";
        mesa_rustica.tablero=40.0f;
        mesa_rustica.numero_patas=4;
        mesa_rustica.posicion=0;
        mesa_rustica.mover(2);
        mesa_rustica.forma="circulo";

        mesa_rustica.informacion();
        mesa_rustica.mover(7);
        mesa_rustica.informacion();
    }
}
