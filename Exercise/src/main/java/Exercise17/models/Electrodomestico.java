package Exercise17.models;

public class Electrodomestico {
    protected int precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
        this.precioBase = 100;
        this.peso = 5;
        this.consumoEnergetico = comprobarConsumoEnergetico();
        this.color = comprobarColor();
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarColor();
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico();
        this.peso = peso;
    }

    public int precioFinal() {
        switch (this.consumoEnergetico) {
            case 'A':
                this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                break;
            case 'C':
                this.precioBase += 60;
                break;
            case 'D':
                this.precioBase += 50;
                break;
            case 'E':
                this.precioBase += 30;
                break;
            case 'F':
                this.precioBase += 10;
                break;
            default:
                System.out.println("no se encontro El consumo adecuado");
        }
        if (this.peso >= 0 && this.peso < 20) {
            precioBase += 10;
        }
        if (this.peso >= 20 && this.peso < 49) {
            precioBase += 50;
        }
        if (this.peso >= 50 && this.peso < 79) {
            precioBase += 80;
        }
        if (this.peso >= 80) {
            precioBase += 100;
        }
        return precioBase;
    }


    public char comprobarConsumoEnergetico() {
        boolean letraEncontrada = false;
        char[] listaLetras = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char c : listaLetras) {
            if (c == this.consumoEnergetico) {
                letraEncontrada = true;
            }
        }
        if (!letraEncontrada) {
            this.consumoEnergetico = 'F';
        }
        return this.consumoEnergetico;
    }

    public String comprobarColor() {
        boolean colorEncontrado = false;
        String[] listaColores = {"blancos", "negro", "rojo", "azul", "gris"};
        for (String c : listaColores) {
            if (c == this.color) {
                colorEncontrado = true;
            }
            if (!colorEncontrado) {
                this.color = "blanco";
            }
        }
        return this.color;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }


    @Override
    public String toString() {
        return "Electrodomestico:" +
                "precioBase=" + precioBase + " $" +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso + " kg";
    }
}
