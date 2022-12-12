package autobus;

public class Main {


    public static void main(String[] args) {
        autobus a1,a2,a3;
        a1=new autobus(true ,"A1" ,1,3,"Alexi");
        a2=new autobus(false,"A2",3,1,"Carmona");
        a3=new autobus(true,"A3",6,400000,"Manu");
        autobus.cambiarprecio(4.0f);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }




}
