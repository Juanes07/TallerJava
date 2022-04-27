package Exercise16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Preguntas preguntas = new Preguntas();
        Persona persona = new Persona();
        String nombre = "";
        Integer edad;
        String sexo;
        Float peso;
        Float altura;
        Integer numeroAleatorio;
        char letra;


        /**
         * Metodo calcular IMC devuelve -1 pedo ideal, 0 debajo del peso y un 1 si esta con sobrepeso
         * comentado debido a que no debe ser visible segundo el ejercicio pero esta para comprobar el
         * funcionamiento del metodo
         */

        // metodos.calcularIMC(65.0, 1.70);

        /**
         * Metodos para generar el DNI. No es visible a exterior
         */


        /**
         * En caso de comprobar el funcionamiento del DNI aleatorio este es el codigo:
         *  System.out.println(numeroAleatorio + "" + letra)
         */

        /**
         * Inicia programa
         */

        preguntas.pedirNombre();
        nombre = scanner.nextLine();
        preguntas.pedirEdad();
        edad = scanner.nextInt();
        preguntas.pedirSexo();
        sexo = scanner.next();
        preguntas.pedirPeso();
        peso = scanner.nextFloat();
        preguntas.pedirAltura();
        altura = scanner.nextFloat();

        /**
         * Creacion de objetos Persona
         */
        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);

        Persona persona2 = new Persona(nombre, edad, sexo);


        /**
         * Creacion de Objeto Persona por defecto
         */

        Persona persona3 = new Persona();
        persona3.setNombre("Alex");
        persona3.setEdad(10);
        persona3.setSexo("H");
        persona3.setPeso(65f);
        persona3.setAltura(1.70f);


        /**
         * Validar peso en cada objeto
         */

        preguntas.persona1();
        persona1.mostrarCondicionPeso();
        preguntas.persona2();
        persona2.mostrarCondicionPeso();
        preguntas.persona3();
        persona3.mostrarCondicionPeso();

        /**
         * Validar si son mayores de edad
         */

        preguntas.esMayor1();
        persona1.esMayorDeEdad(persona1.edad);
        preguntas.esMayor2();
        persona2.esMayorDeEdad(persona2.edad);
        preguntas.esMayor3();
        persona3.esMayorDeEdad(persona3.edad);

        /**
         * Mostrar Informacion de cada Persona
         */

        System.out.println("Datos persona1: " + persona1.toString());
        System.out.println("Datos persona2: " + persona2.toString());
        System.out.println("Datos persona3: " + persona3.toString());
    }
}
