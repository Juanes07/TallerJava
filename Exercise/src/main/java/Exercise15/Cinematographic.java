package Exercise15;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinematographic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        int menuOption;
        do {
            menu.showMenu();
            menuOption = scanner.nextInt();
            switch (menuOption){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("");
            }
        } while (menuOption <8);
        menu.closeMenu();
    }
}
