package Exercise1and2;

import java.util.Scanner;

public class Ejercicio1y2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 20;
        int y = 10;
        try {
            if (x < y) {
                System.out.println("X es menor a Y");
            } else if (x == y) {
                System.out.println("X es igual a Y");
            } else if (x > y) {
                System.out.println("X es mayor a Y");
            }
        } catch (Exception exc) {
            System.out.println("Verifica valores de X y Y");
        }
        try {
            System.out.println("Ingresa el valor de X");
            int entrada1 = scanner.nextInt();
            System.out.println("Ingresa el valor de Y");
            int entrada2 = scanner.nextInt();
            if (entrada1 < entrada2) {
                System.out.println("X es menor a Y");
            } else if (entrada1 == entrada2) {
                System.out.println("X es igual a Y");
            } else if (entrada1 > entrada2) {
                System.out.println("X es mayor a Y");
            }
        } catch (Exception exception) {
            System.out.println("Ingresa solo numeros");
        }
    }
}

