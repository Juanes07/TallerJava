package Exercise17.controller;

import Exercise17.Methods.Metodos;
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
         * iniciando objeto metodos de tipo Metodos
         */

        Metodos metodos = new Metodos();

        /**
         * Creacion de objetos de tipo Electrodomestico, Television y Lavadora.
         */

        array[0] = new Electrodomestico(100, "blanco", metodos.comprobarConsumoEnergetico('Z'), 100);
        array[1] = new Electrodomestico(150, metodos.comprobarColor("amarillo"), 'B', 40);
        array[2] = new Television(22.2f, false);
        array[3] = new Lavadora(200, 35);
        array[4] = new Television(32, true);
        array[5] = new Electrodomestico(200, 20);
        array[6] = new Lavadora(10);
        array[7] = new Television(80, 20);
        array[8] = new Lavadora(100, 45);
        array[9] = new Television(27, false);

        /**
         * Impresion del precio baje de los objetos anteriormente creados
         */

        System.out.println("precio base Electrodomesticos 1: " + array[0].getPrecioBase() + " $" + "\n");
        System.out.println("precio base Electrodomesticos 2: " + array[1].getPrecioBase() + " $" + "\n");
        System.out.println("precio base Television 1: " + array[2].getPrecioBase() + " $" + "\n");
        System.out.println("precio base Lavadora 1: " + array[3].getPrecioBase() + " $" + "\n");
        System.out.println("precio base Television 2: " + array[4].getPrecioBase() + " $" + "\n");
        System.out.println("precio base Electrodomesticos 3: " + array[5].getPrecioBase() + " $" + "\n");
        System.out.println("precio base Lavadora 2: " + array[6].getPrecioBase() + " $" + "\n");
        System.out.println("precio base Television 2: " + array[7].getPrecioBase() + " $" + "\n");
        System.out.println("precio base Lavadora 3: " + array[8].getPrecioBase() + " $" + "\n");
        System.out.println("precio base Television 3: " + array[9].getPrecioBase() + " $" + "\n");

        /**
         *  Suma de los precios totales de los electrodomesticos
         */

        sumaTotalPreciosElectrodomesticos =
                array[0].precioFinal(array[0].getPrecioBase(), array[0].getConsumoEnergetico(), array[0].getPeso()) +
                        array[1].precioFinal(array[1].getPrecioBase(), array[1].getConsumoEnergetico(), array[1].getPeso()) +
                        array[5].precioFinal(array[5].getPrecioBase(), array[5].getConsumoEnergetico(), array[5].getPeso());

        System.out.println("Precio Total de electrodomesticos: " + sumaTotalPreciosElectrodomesticos + " $");

        /**
         *  Suma de los precios totales de Lavadoras
         */

        sumaTotalPreciosLavadora = array[3].precioFinal(array[3].getPrecioBase(), array[3].getConsumoEnergetico(), array[3].getPeso()) +
                array[6].precioFinal(array[6].getPrecioBase(), array[6].getConsumoEnergetico(), array[6].getPeso()) +
                array[8].precioFinal(array[8].getPrecioBase(), array[8].getConsumoEnergetico(), array[8].getPeso());

        /**
         *  Suma de los precios totales de Television
         */

        System.out.println("Precio Total de Lavadoras: " + sumaTotalPreciosLavadora + " $");

        sumaTotalPreciosTelevision = array[4].precioFinal(array[4].getPrecioBase(), array[4].getConsumoEnergetico(), array[4].getPeso()) +
                array[7].precioFinal(array[7].getPrecioBase(), array[7].getConsumoEnergetico(), array[7].getPeso()) +
                array[9].precioFinal(array[9].getPrecioBase(), array[9].getConsumoEnergetico(), array[9].getPeso());

        System.out.println("Precio Total de Television: " + sumaTotalPreciosTelevision + " $");

    }
}
