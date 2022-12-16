package URRS.Tiempo;

public class Reloj {
    int horas, minutos, segundos;
    //Constructores

    Reloj(){}
    Reloj(int horas, int minutos, int segundos) {
        if(segundos > 59){
            System.out.println("Los segundos no se aceptan, se pondrá por defecto 0");
            segundos = 0;
        }
        if(minutos>59){
            System.out.println("Minutos no aceptados, se pondrán por defecto 0");
            minutos = 0;
        }
        if(horas > 23){
            System.out.println("Horas no aceptadas, se pondrán por defecto 0");
            horas = 0;
        }
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    void imprimirHora(){
        System.out.println(horas+":"+minutos+":"+segundos);
    }
    void pasar_un_minuto(){
        segundos=0;
        do {
            System.out.println(horas+":"+minutos+":"+segundos);
            segundos++;

        }while (!(segundos ==60));
    }
}
