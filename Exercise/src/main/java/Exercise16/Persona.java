package Exercise16;

public class Persona {
    protected String nombre = "";
    protected int edad = 0;
    protected int DNI = 0;
    protected String sexo = "H";
    protected float peso = 0;
    protected float altura = 0;

    public Persona() {

    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, int DNI, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
}
