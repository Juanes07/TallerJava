package Exercise17.models;

public  class Electrodomestico {
    protected int precioBase = 100;
    protected String color = "blanco";
    protected char consumoEnergetico = 'F';
    protected int peso = 5;

    public Electrodomestico() {

    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
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

    public int precioFinal(int precio, char letra, int peso) {
        switch (letra) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
            default:
                System.out.println("no se encontro El consumo adecuado");
        }


        if(peso >=0 && peso <20){
            precio +=10;
        } if (peso >=20 && peso <49){
            precio += 50;
        } if (peso >= 50 && peso <79){
            precio += 80;
        } if (peso >=80){
            precio += 100;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico:" +
                "precioBase=" + precioBase + " $"+
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +" kg";
    }
}
