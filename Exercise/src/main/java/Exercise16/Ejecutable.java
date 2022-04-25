package Exercise16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();
        Preguntas preguntas = new Preguntas();
        String nombre = "";
        Integer edad;
        char sexo;
        Float peso;
        Float altura;
        Integer numeroAleatorio;
        char letra;


        /**
         * Metodo calcular IMC devuelve -1 pedo ideal, 0 debajo del peso y un 1 si esta con sobrepeso
         */

//        metodos.calcularIMC(65.0,1.70);

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
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        persona1.setNombre(nombre);
        persona1.setEdad(edad);
        persona1.setSexo(sexo);
        persona1.setAltura(altura);
        persona1.setPeso(peso);
        Persona persona2 = new Persona(nombre, edad, sexo);
        persona2.setNombre(nombre);
        persona2.setEdad(edad);
        persona2.setSexo(sexo);
        /**
         * Creacion de Objeto Persona por defecto
         */
        Persona persona3 = new Persona();

        /**
         * Validar peso en cada objeto
         */
        preguntas.persona1();
        metodos.indicarEstadoPeso(persona1.peso, persona1.altura);
        preguntas.persona2();
        metodos.indicarEstadoPeso(persona2.peso, persona2.altura);
        preguntas.persona3();
        metodos.indicarEstadoPeso(persona3.peso, persona3.altura);
        /**
         * Validar si son mayores de edad
         */
        preguntas.esMayor1();
        metodos.esMayorDeEdad(persona1.edad);
        preguntas.esMayor2();
        metodos.esMayorDeEdad(persona2.edad);
        preguntas.esMayor3();
        metodos.esMayorDeEdad(persona3.edad);
        /**
         * Mostrar Informacion de cada Persona
         */
        System.out.println("Datos persona1: " + persona1.toString());
        System.out.println("Datos persona2: " + persona2.toString());
        System.out.println("Datos persona3: " + persona3.toString());
    }
}
