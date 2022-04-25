package Exercise3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingresa el valor del Radio");
            double radio = scanner.nextDouble();

            double circuleArea = Math.PI * Math.pow(radio, 2);

            System.out.println("EL area del circulo es: " + circuleArea);
        } catch (Exception ex) {
            System.out.println("Ingresa solo numeros, en caso de error con decimales intenta con la coma o en caso contrario el punto");
        }

    }
}
