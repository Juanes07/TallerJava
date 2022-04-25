package Exercise8;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /**
         * Importa libreria scanner para pedir datos por consola
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe dia de la semana");
        String opcion = scanner.next().toUpperCase(Locale.ROOT);
        switch (opcion) {
            case "LUNES":
                System.out.println("dia laboral");
                break;
            case "MARTES":
                System.out.println("dia laboral");
                break;
            case "MIERCOLES":
                System.out.println("dia laboral");
                break;
            case "JUEVES":
                System.out.println("dia laboral");
                break;
            case "VIERNES":
                System.out.println("dia laboral");
                break;
            case "SABADO":
                System.out.println("Dia no laboral, a descansar");
                break;
            case "DOMINGO":
                System.out.println("Dia no laboral, a descansar");
                break;
            default:
                System.out.println("Escribiste: " + opcion + ", No es un dia de la semana");
        }
    }
}
