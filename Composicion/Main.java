package Composicion;

public class Main {
    public static void main(String[] args) {
        CocheCarreras c1,c2;
        Piloto pi1,pi2;
        pi1=new Piloto("pepe",1.4f,13);
        pi2=new Piloto("manue",1.47f,14);

        c1=new CocheCarreras("bwm",pi1,"500");
        System.out.println(c1.toString());
        c2=new CocheCarreras();
        c2.setConductor(pi2);
        c2.setModelo("Mercedes");
        c2.setCv("1234");
        System.out.println(c2.toString());

        System.out.println("Altura: "+c2.getConductor().getAltura());
    }
}
