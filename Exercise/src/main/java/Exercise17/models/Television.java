package Exercise17.models;

public class Television extends Electrodomestico {
    private Float resolucion = 20f;
    private Boolean sintonizadorTDT = false;

    public Television(){

    }
    public Television(int precio, int peso){
        this.precioBase = precio;
        this.peso = peso;
        this.resolucion = getResolucion();
        this.color = getColor();
        this.sintonizadorTDT = getSintonizadorTDT();
        this.consumoEnergetico = getConsumoEnergetico();
    }

    public Television(float resolucion, boolean sintonizadorTDT){
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        this.precioBase = getPrecioBase();
        this.peso = getPeso();
        this.consumoEnergetico = getConsumoEnergetico();
        this.color = getColor();
    }

    public Float getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Television: " +
                "precioBase=" + precioBase + " $" +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso + "kg" +
                ", resolucion=" + resolucion + " pulgadas" +
                ", sintonizadorTDT=" + sintonizadorTDT;
    }
}
