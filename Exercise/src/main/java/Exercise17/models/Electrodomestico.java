package Exercise17.models;

public abstract class  Electrodomestico {
    private int precioBase = 100;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private int peso = 5;

    public Electrodomestico(){

    }

    public Electrodomestico(int precioBase, int peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso  = peso;
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
}
