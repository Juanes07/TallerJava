package Exercise17.models;

public class Television extends Electrodomestico {
    private Float resolucion;
    private Boolean sintonizadorTDT;

    public Television() {
        this.color = "blanco";
        this.peso = 5;
        this.consumoEnergetico = 'F';
        this.precioBase = 100;
        this.resolucion = 20f;
    }

    public Television(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.resolucion = 20f;
        this.color = "blanco";
        this.sintonizadorTDT = false;
        this.consumoEnergetico = 'F';
    }

    public Television(float resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        this.precioBase = 100;
        this.peso = 5;
        this.consumoEnergetico = 'F';
        this.color = "blanco";
    }

    @Override
    public int precioFinal() {
        if(this.resolucion > 40 && this.sintonizadorTDT == true){
            this.precioBase += (30*this.precioBase)/100 + 50;
        }
        return super.precioFinal();
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
