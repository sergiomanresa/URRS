package ejeje;

import java.util.Scanner;

public class Main {
     static void menu() {
        System.out.println("MENU");
        System.out.println("********");
        System.out.println("1.Opción 1");
        System.out.println("2.Opción 2");
        System.out.println("0.Salir");
        System.out.println("Elige una opción:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            menu();
            opcion= scanner.nextLine();
        }while (!opcion.equals("0") &&!opcion.equals("salir"));
    }
}
