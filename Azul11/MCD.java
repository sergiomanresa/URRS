package Azul11;

public class MCD {
    int num1, num2;
    MCD(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    int calcular(){
        int resto = 1;
        while(resto!=0){
            resto = num1%num2;
            num1 = num2;
            num2 = resto;
        }
        return num1;
    }
}
