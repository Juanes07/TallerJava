package Exercise9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "La sonrisa sera la mejor arma contra la tristeza";
        String newText = text.replace("a", "e");
        System.out.println("Escribe una frase cualquiera");
        String aditionalText = scanner.nextLine();
        System.out.println(newText + " " + aditionalText);
    }
}
