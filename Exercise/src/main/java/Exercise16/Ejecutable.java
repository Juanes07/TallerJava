package Exercise16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();
        Preguntas preguntas = new Preguntas();
        String nombre = "";
        int edad;
        char sexo;
        float peso;
        float altura;
        int numeroAleatorio;
        char letra;
        /**
         * Metodos para generar el DNI. No es visible a exterior
         */
        numeroAleatorio = metodos.numeroAleatorio();
        letra = metodos.calcularLetra(numeroAleatorio);

        /**
         * En caso de comprobar el funcionamiento del DNI aleatorio este es el codigo:
         *  System.out.println(numeroAleatorio + "" + letra)
         */

        /**
         * Inicia programa
         */
        try {
            preguntas.pedirNombre();
            nombre = scanner.nextLine();
            preguntas.pedirEdad();
            edad = scanner.nextInt();
            preguntas.pedirSexo();
            sexo = scanner.next().charAt(0);
            preguntas.pedirPeso();
            peso = scanner.nextFloat();
            preguntas.pedirAltura();
            altura = scanner.nextFloat();
            /**
             * Creacion de objetos Persona
             */
            Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
            persona1.setNombre(nombre);
            persona1.setEdad(edad);
            persona1.setSexo(sexo);
            persona1.setAltura(altura);
            persona1.setPeso(peso);

            Persona persona2 = new Persona(nombre,edad,sexo);
            persona2.setNombre(nombre);
            persona2.setEdad(edad);
            persona2.setSexo(sexo);
            /**
             * Creacion
             */
            Persona persona3 = new Persona();

            /**
             * Validar peso en cada objeto
             */
            System.out.println("Persona 1: ");
            metodos.indicarEstadoPeso(persona1.peso, persona1.altura);
            System.out.println("Persona 2: ");
            metodos.indicarEstadoPeso(persona2.peso, persona2.altura);
            System.out.println("Persona 3: ");
            metodos.indicarEstadoPeso(persona3.peso, persona3.altura);
            /**
             * Validar si son mayores de edad
             */
            System.out.println("Persona 1 es mayor de edad? ");
            metodos.esMayorDeEdad(persona1.edad);
            System.out.println("Persona 2 es mayor de edad? ");
            metodos.esMayorDeEdad(persona2.edad);
            System.out.println("Persona 3 es mayor de edad? ");
            metodos.esMayorDeEdad(persona3.edad);
            /**
             * Mostrar Informacion de cada Persona
             */
            System.out.println("Datos persona1: " + persona1.toString());
            System.out.println("Datos persona2: " + persona2.toString());
            System.out.println("Datos persona3: " + persona3.toString());
        } catch (Exception exception){
            System.out.println("Ingreso de datos erroneo. Lee Atentamente las Instrucciones");
        }
    }
}
