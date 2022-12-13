package Azul8;

public class Fecha {
    int dia, mes, anyo;
    Fecha(int dia, int mes, int anyo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void mostrarFecha(){
        System.out.println(dia+"/"+mes+"/"+anyo);
    }
}