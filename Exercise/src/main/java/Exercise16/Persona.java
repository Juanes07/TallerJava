package Exercise16;

import java.sql.ResultSet;

public class Persona {
    protected String nombre ;
    protected Integer edad;
    protected String dni;
    protected String sexo;
    protected Float peso;
    protected Float altura;

    public Persona() {
        this.dni = calcularLetra();
    }

    /**
     * constructor por defecto
     * @param dni Integer
     */
    public Persona(String dni){
        this.dni = dni;
        this.peso = 0f;
        this.altura = 0f;
        this.sexo = "H";
        this.edad = 0;
        this.nombre = " ";

    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo();
        this.peso = 0f;
        this.altura = 0f;
        this.dni = calcularLetra();
    }


    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
        this.dni = calcularLetra();
    }


    public int calcularIMC() {
        Integer resulado = -9;
        double pesoIdeal = this.peso / (Math.pow(this.altura, 2));
        if (pesoIdeal < 20) {
            return resulado = -1;
        }
        if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            return resulado = 0;
        }
        if (pesoIdeal > 25) {
            return resulado = 1;
        }
        return resulado;
    }

    public void mostrarCondicionPeso() {
        switch (calcularIMC()) {
            case 1:
                System.out.println("Sobrepeso");
                break;
            case 0:
                System.out.println("Peso ideal");
                break;
            case -1:
                System.out.println("debajo de peso");
                break;
            default:
                System.out.println("Resultado indefinido");
        }
    }

    public boolean esMayorDeEdad(int edad) {
        Boolean esMayor = false;
        if (edad >= 18) {
            esMayor = true;
            System.out.println("Es mayor de edad");
        }
        System.out.println("Es menor de edad");
        return esMayor;

    }

    public void comprobarSexo() {
        if (this.sexo.toUpperCase() != "H" || this.sexo.toUpperCase() != "M") {
            this.sexo = "H";
        }

    }

    public int numeroAleatorio() {
        Integer aleatorio = 0;
        return aleatorio = (int) (Math.random() * 100000000);
    }

    public String calcularLetra() {
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int posicionFinal= numeroAleatorio() % 23;
        return numeroAleatorio() + "" + letras[posicionFinal];
    }


    @Override
    public String toString() {
        return "{" +
                "nombre= " + nombre +
                ", edad= " + edad +
                ", DNI= " + dni +
                ", sexo= " + this.sexo +
                ", peso= " + peso +
                ", altura =" + altura +
                '}';
    }


    /**
     * Setters y Getters de la clase persona
     *
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
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

    public String getSexo() {
        return sexo;
    }

    public Float getPeso() {
        return peso;
    }

    public Float getAltura() {
        return altura;
    }

}
