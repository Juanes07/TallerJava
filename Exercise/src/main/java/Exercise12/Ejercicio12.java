package Exercise12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase1, phrase2;
        System.out.println("Las frases deben ser de igual longitud. Ejemplo: frente y calcio");
        System.out.println("Escribe la primer frase");
        phrase1 = scanner.nextLine();
        System.out.println("Escribe la segunda frase");
        phrase2 = scanner.nextLine();
        if (phrase1.equalsIgnoreCase(phrase2)) {
            System.out.println("Las frases son iguales");
        } else {
            for (int i = 0; i < phrase1.length(); i++) {
                if (phrase1.charAt(i) == phrase2.charAt(i)) {
                    System.out.println("las letras iguales entre las frases son: " + phrase1.charAt(i));
                }
                if (phrase1.charAt(i) != phrase2.charAt(i)) {
                    System.out.println("las letras diferentes entre las frases son: " + phrase1.charAt(i));
                }
            }
        }
    }
}
