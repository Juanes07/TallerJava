package Exercise17.models;

import Exercise17.Methods.Metodos;

public class Lavadora extends Electrodomestico {
    private int carga = 5;
    Metodos metodos = new Metodos();

    //contrusctor por defecto
    public Lavadora() {
        this.color = getColor();
        this.peso = getPeso();
        this.precioBase = getPrecioBase();
        this.consumoEnergetico = getConsumoEnergetico();
        this.carga = getCarga();
    }

    //constructor con atriubos por defecto de la clase electrodomestico, agregando atributos precio y peso
    public Lavadora(int precio, int peso) {
        this.precioBase = precio;
        this.peso = peso;
        this.consumoEnergetico = getConsumoEnergetico();
        this.color = getColor();
    }

    public Lavadora(int carga) {
        this.carga = carga;
        this.peso = getPeso();
        this.consumoEnergetico = getConsumoEnergetico();
        this.precioBase = getPrecioBase();
        this.color = getColor();
    }


    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal(int precio, char letra, int peso) {
        if (peso > 30) {
            precio += 50;
        } else {
            precio += 0;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Lavadora: " +
                "precioBase=" + precioBase + " $" +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso + " kg" +
                ", carga=" + carga;
    }
}
