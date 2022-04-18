package Exercise10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String text = scanner.nextLine().replace(" ","");
        System.out.println("Su frase es: " + text);
    }
}
