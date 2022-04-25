package Exercise11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterVocal = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        System.out.println("Escriba una frase: ");
        String text = scanner.nextLine();
        System.out.println("La frase: " + text + " tiene de longitud: " + text.length());
        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == 'a') {
                a++;
            } else if (text.charAt(index) == 'e') {
                e++;
            } else if (text.charAt(index) == 'i') {
                i++;
            } else if (text.charAt(index) == 'o') {
                o++;
            } else if (text.charAt(index) == 'u') {
                u++;
            }
        }
        System.out.println("a:" + a + "\n" + "e:" + e + "\n" + "i:" + i +
                "\n" + "o:" + o + "\n" + "u:" + u + "\n");
    }
}

