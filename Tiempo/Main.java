package URRS.Tiempo;

public class Main {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj(5, 4, 5);
        for(int i = 0; i < 100; i++){
            reloj1.imprimirHora();
            reloj1.pasar_un_minuto();
        }
    }
}
