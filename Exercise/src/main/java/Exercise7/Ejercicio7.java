package Exercise7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number;
        do {
            System.out.println("Ingrese un numero cualquiera");
            number = scanner.nextFloat();
        } while (number >= 0);
        System.out.println("El numero elegido fue: " + number);
    }
}
