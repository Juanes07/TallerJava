package Exercise17.Methods;

import Exercise17.models.Electrodomestico;

import java.text.SimpleDateFormat;

public class Metodos extends Electrodomestico {
    char[] listaLetras = {'A', 'B', 'C', 'D', 'E', 'F'};
    String[] listaColores = {"blancos", "negro", "rojo", "azul", "gris"};
    protected boolean letraEncontrada = false;
    protected boolean colorEncontrado = false;

    public void comprobarConsumoEnergetico(char letra) {
        if (listaLetras.equals(letra)) {
            letraEncontrada = true;
        } else {
            this.getConsumoEnergetico();
        }
    }

    public void comprobarColor(String color) {
        if (listaColores.equals(color)) {
            colorEncontrado = true;
        } else {
            this.getColor();
        }
    }



}
