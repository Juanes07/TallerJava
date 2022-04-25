package Exercise16;

public class Metodos extends Persona {
    Persona persona = new Persona();
    Integer negativo = -1;
    Integer bajoIdeal = 0;
    Integer sobreIdeal = 1;
    Integer aleatorio = 0;
    Boolean esMayor = false;

    public void calcularIMC(double peso, double altura) {
        double pesoIdeal = peso / (altura * altura);
        System.out.println(pesoIdeal);
        if (pesoIdeal < 20) {
            System.out.println(negativo);
        }
        if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            System.out.println(bajoIdeal);
        }
        if (pesoIdeal > 25) {
            System.out.println(sobreIdeal);
        }
    }

    public void indicarEstadoPeso(float peso, float altura) {
        double pesoIdeal = peso / (altura * altura);
        if (pesoIdeal < 20) {
            System.out.println("Peso ideal ");
        }
        if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            System.out.println("Debajo del Peso ideal ");
        }
        if (pesoIdeal > 25) {
            System.out.println("Sobrepeso");
        }
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            esMayor = true;
            System.out.println(esMayor);
        } else {
            esMayor = false;
            System.out.println(esMayor);
        }
        return esMayor;
    }

    public void comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            persona.setSexo('M');
        } else {
            persona.getSexo();
        }
    }

    public int numeroAleatorio() {
        return aleatorio = (int) (Math.random() * 10000000);
    }


    public char calcularLetra(int dni) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni % 23;
        return letras[resto];
    }


}
