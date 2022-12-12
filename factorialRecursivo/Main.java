package factorialRecursivo;

public class Main {
    public static int factorialR(int num){//3
        if (num==1) return 1; //caso base
        else return num*factorialR(--num);
    }
    public static void main(String[] args) {

    }
}
