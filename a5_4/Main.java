package URRS.a5_4;

public class Main {
    public void elemento() {
        int elemento[]={1,6,4,87,78,9,2,0};
        System.out.println("Ultimo elemento: "+elemento[elemento.length-1]);
        System.out.println("Primer elemento: "+elemento[elemento.length- elemento.length]);
    }
    public void numeros(){
        int numero[]={1,32,65,87,23,87,123,34,768};
        for (int i=0;i< numero.length;i++){
            System.out.print(numero[i]+",");
        }
    }
    public void mayor_que(){
        int a1[]={1,4,3,7,10,9,40};
        int a2[]={20,2,30,34,0,-10,4};
        int aresultado[]=new int[7];
        for (int i=0;i<7;i++){
            aresultado[i] = a1[i] > a2[i] ? a1[i] : a2[i];
        }
    }
    public void palabras(){
        String p1="viva";
        String p2="españa";
        char palabra[]=new char[p1.length()+p2.length()+1];
        int sec1=p1.length();
        for (int i= 0; i < p1.length();i++){
            palabra[i] = p1.charAt(i);
        }
        for (int i=p1.length();i<p2.length();i++){
            palabra[sec1]=p1.charAt(i);
        }

    }

    public void separadas(){
        String[] frase ={" esto es un ejemplo"};
        int espacio=0;
        for (int i = 0; i>= frase.length; i++){
           // if (frase.(i) == ' ') espacio++;
            //penen nenenenen
        }
    }

    public static void main(String[] args) {

    }
}