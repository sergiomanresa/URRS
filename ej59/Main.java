package ej59;

public class Main {
    public static void nuevoArray(int[] array){
        //Nuevo array
        int nuevoArray[] = new int[array.length/2];
        for(int i = 0, j = array.length-1; i<j; i++, j--){
            nuevoArray[i] = array[i] + array[j];
        }
        //In-Range for loop
        for(int x : nuevoArray) System.out.println(x);
    }

    public static void main(String[] args) {
        int elemento[]={1,6,4,87,78,9,2,0};
        nuevoArray(elemento);
    }


}
