package Factorialiterativo;

public class Main {
    public static  int factorial(int num){//4
        int resultado=num;//resultado=2;
        do {
            resultado=resultado*(--num);//4*3
        }while (num>1);
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(
                "factorial "+factorial(4)
        );

    }
}
