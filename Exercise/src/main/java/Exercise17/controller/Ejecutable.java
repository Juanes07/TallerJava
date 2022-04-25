package Exercise17.controller;

import Exercise17.models.Electrodomestico;
import Exercise17.models.Lavadora;
import Exercise17.models.Television;

import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[] args) {
        Electrodomestico[] array;
        int sumaTotalPrecios = 0;
        array = new Electrodomestico[10];

        array[0] = new Electrodomestico(100, "blanco", 'A', 100);
        array[1] = new Electrodomestico(150, "negro", 'B', 40);
        array[2] = new Television(22.2f, false);
        array[3] = new Lavadora(500, 35);
        array[4] = new Television(32, true);
        array[5] = new Electrodomestico(200, 20);
        array[6] = new Lavadora(10);
        array[7] = new Television(80, 20);
        array[8] = new Lavadora(50, 45);
        array[9] = new Television(27, false);


        System.out.println("precio Electrodomesticos:" + array[0].getPrecioBase() + " $" + "\n");
        System.out.println("precio Electrodomesticos:" + array[1].getPrecioBase() + " $" + "\n");
        System.out.println("precio Television:" + array[2].getPrecioBase() + " $" + "\n");
        System.out.println("precio Lavadora:" + array[3].getPrecioBase() + " $" + "\n");
        System.out.println("precio Television:" + array[4].getPrecioBase() + " $" + "\n");
        System.out.println("precio Electrodomesticos:" + array[5].getPrecioBase() + " $" + "\n");
        System.out.println("precio Lavadora:" + array[6].getPrecioBase() + " $" + "\n");
        System.out.println("precio Television:" + array[7].getPrecioBase() + " $" + "\n");
        System.out.println("precio Lavadora:" + array[8].getPrecioBase() + " $" + "\n");
        System.out.println("precio Television:" + array[9].getPrecioBase() + " $" + "\n");



        sumaTotalPrecios =
                array[0].precioFinal(100, 'A', 20) +
                array[1].precioFinal(100, 'B', 20) +
                array[5].precioFinal(100, 'C', 30);

        System.out.println("Precio Total de electrodomesticos: " + sumaTotalPrecios + " $");
    }
}
