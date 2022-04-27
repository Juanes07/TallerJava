package Exercise17.controller;

import Exercise17.models.Electrodomestico;
import Exercise17.models.Lavadora;
import Exercise17.models.Television;

import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[] args) {

        /**
         * creando array de electrodomesticos
         */
        Electrodomestico[] array;
        array = new Electrodomestico[10];

        /**
         * variables
         */

        int sumaTotalPreciosElectrodomesticos = 0;
        int sumaTotalPreciosTelevision = 0;
        int sumaTotalPreciosLavadora = 0;

        /**
         * Creacion de objetos de tipo Electrodomestico, Television y Lavadora.
         */

        array[0] = new Electrodomestico(100, "blanco", 'A', 100);
        array[1] = new Electrodomestico(150, "amarillo", 'X', 40);
        array[2] = new Television(50f, true);
        array[3] = new Lavadora(200, 35);
        array[4] = new Television(32, true);
        array[5] = new Electrodomestico(200, 20);
        array[6] = new Lavadora(10);
        array[7] = new Television(80, 20);
        array[8] = new Lavadora(100, 45);
        array[9] = new Television(27, false);


        /**
         * recorrer el arreglo y ejecutar metodo precio final;
         */
        for (int i = 0; i < array.length; i++) {
            array[i].precioFinal();
        }

        /**
         *  Suma de los precios totales de los electrodomesticos
         */

        sumaTotalPreciosElectrodomesticos = array[0].getPrecioBase() + array[1].getPrecioBase() + array[5].getPrecioBase();

        System.out.println("Precio Total de electrodomesticos: " + sumaTotalPreciosElectrodomesticos + " $");

        /**
         *  Suma de los precios totales de Television
         */

        sumaTotalPreciosTelevision = array[2].getPrecioBase() + array[4].getPrecioBase() + array[7].getPrecioBase() + array[9].getPrecioBase();

        System.out.println("Precio Total de Television: " + sumaTotalPreciosTelevision + " $");

        /**
         *  Suma de los precios totales de lavdoras
         */

        sumaTotalPreciosLavadora = array[3].getPrecioBase() + array[6].getPrecioBase() + array[8].getPrecioBase();

        System.out.println("Precio Total de lavadoras: " + sumaTotalPreciosLavadora + " $");

    }
}
