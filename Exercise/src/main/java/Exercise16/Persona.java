package Exercise16;

public class Persona {
    protected String nombre = "";
    protected int edad = 0;
    protected int DNI = 0;
    protected char sexo = 'H';
    protected float peso = 0;
    protected float altura = 0;

    public Persona() {

    }



    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, int DNI, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre= " + nombre +
                ", edad= " + edad +
                ", DNI= " + DNI +
                ", sexo= " + sexo +
                ", peso= " + peso +
                ", altura =" + altura +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
