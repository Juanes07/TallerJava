package Exercise17.models;


public class Lavadora extends Electrodomestico {
    private int carga;

    //contrusctor por defecto
    public Lavadora() {
        this.color = "blanco";
        this.peso = 5;
        this.precioBase = 100;
        this.consumoEnergetico = 'F';
        this.carga = 5;
    }

    //constructor con atriubos por defecto de la clase electrodomestico, agregando atributos precio y peso
    public Lavadora(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = 'F';
        this.color = "blanco";
        this.carga = 5;
    }

    public Lavadora(int carga) {
        this.carga = carga;
        this.consumoEnergetico = 'F';
        this.peso = 5;
        this.color = "blanco";
        this.precioBase = 100;
    }


    public int getCarga() {
        return carga;
    }


    public int precioFinal() {
        if (this.carga > 30) {
            this.precioBase += 50;
        } else {
            this.precioBase += 0;
        }

        return super.precioFinal();
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
