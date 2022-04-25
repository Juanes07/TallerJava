package Exercise17.Methods;

import Exercise17.models.Electrodomestico;

import java.text.SimpleDateFormat;

public class Metodos extends Electrodomestico {
    char[] listaLetras = {'A', 'B', 'C', 'D', 'E', 'F'};
    String[] listaColores = {"blancos", "negro", "rojo", "azul", "gris"};
    protected boolean letraEncontrada = false;
    protected boolean colorEncontrado = false;

    public char comprobarConsumoEnergetico(char letra) {
        for (char c : listaLetras) {
            if (c == letra) {
                letraEncontrada = true;
            }
        }
        if (!letraEncontrada) {
            letra = getConsumoEnergetico();
        }
        return letra;
    }


    public String comprobarColor(String color) {
        for (String c : listaColores) {
            if (c == color) {
                colorEncontrado = true;
                getColor();
            }
            if (!colorEncontrado) {
                color = getColor();
            }
        }
        return color;
    }
}
