package ExerciseExtra;

import java.util.Scanner;

public class Pagos {

    int basic = 20;
    int extra = 25;
    int hours = 0;
    int paybasic = 0;
    int payExtra = 0;

    void basicPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas horas trabajo la persona exactamente");
        hours = scanner.nextInt();
        paybasic = basic * hours;
        System.out.println("Su pago total por esta semana es: " + paybasic + " $");
    }

    void extraPayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas horas trabajo la persona exactamente");
        hours = scanner.nextInt();
        payExtra = (hours - 40) * extra;
        paybasic = 40 * basic;
        System.out.println("Su pago por esta semana es: " + paybasic + " $"
                + "\n" + " y el pago por sus horas extras es: " + payExtra + " $");
    }
}
