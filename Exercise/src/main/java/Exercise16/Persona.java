package Exercise16;

public class Persona {
    protected String nombre = "";
    protected Integer edad = 0;
    protected Integer DNI = 0;
    protected char sexo = 'H';
    protected Float peso = 0f;
    protected Float altura = 0f;

    public Persona() {

    }


    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        if (sexo != 'H' || sexo != 'M') {
            this.sexo = 'H';
        } else {
            this.sexo = sexo;
        }
    }


    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = getNombre();
        this.edad = getEdad();
        this.sexo = getSexo();
        this.peso = getPeso();
        this.altura = getAltura();
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = getPeso();
        this.altura = getAltura();
    }


    @Override
    public String toString() {
        return "{" +
                "nombre= " + nombre +
                ", edad= " + edad +
                ", DNI= " + DNI +
                ", sexo= " + this.sexo +
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

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public Float getPeso() {
        return peso;
    }

    public Float getAltura() {
        return altura;
    }
}
