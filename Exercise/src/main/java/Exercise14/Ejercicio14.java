package Exercise14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /**
         * Instancia objeto scanner de tipo Scanner
         */
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Escribe un numero cualquiera");
        number = scanner.nextInt();
        for (int i = number; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }
}
