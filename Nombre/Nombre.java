package URRS.Nombre;

public class Nombre {

    private String miembro,Primer_Nombre,Segundo_Nombre,Primer_Apellido,Segundo_Apellido;

    Nombre(){}

    public Nombre( String primer_Nombre, String segundo_Nombre, String primer_Apellido, String segundo_Apellido) {
        this.Primer_Nombre = primer_Nombre;
        this.Segundo_Nombre = segundo_Nombre;
        this.Primer_Apellido = primer_Apellido;
        this.Segundo_Apellido = segundo_Apellido;
    }

    public void imprimir1(){
        System.out.println(this.Primer_Nombre+" "+this.Segundo_Nombre+" "+this.Primer_Apellido+" "+this.Segundo_Apellido);
    }
    public void imprimir2(){
        System.out.println(this.Primer_Apellido+" "+this.Segundo_Apellido+" "+this.Primer_Nombre+" "+this.Segundo_Nombre);
    }
}
