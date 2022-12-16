package URRS.arrais;

public class rellenar {

    public static void f(int[]arr){
        for (int i=arr.length-1;i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void a(int[]arr){
        for (int i=arr.length-1;i>=0; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[100];
        for (int i=0; i<100;i++){
            arr[i]=i;
            System.out.println(arr[i]);
        }
        f(arr);
    }
}
