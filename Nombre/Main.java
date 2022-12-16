package URRS.Nombre;

public class Main {
    public static void main(String[] args) {
        Nombre n1,n2;

        n1=new Nombre("Antonio","Palomare","Siusplau","Fulgensio");
        n1.imprimir1();
        n1=new Nombre("Juan","Pedro","Palau","Chusma");
        n1.imprimir1();
        n2=new Nombre("Antonio","Palomare","Siusplau","Fulgensio");
        n2.imprimir2();
        n2=new Nombre("Juan","Pedro","Palau","Chusma");
        n2.imprimir2();
    }
}
