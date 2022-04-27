package Exercise18.Controller;

import Exercise18.Models.Serie;
import Exercise18.Models.Videojuego;

import java.util.ArrayList;
import java.util.Comparator;

public class app {
    public static void main(String[] args) {

        /**
         * variable para contar numero de series y videojuegos entregados
         */
        int contador = 0;

        /**
         * Creacion de objetos Serie
         */
        ArrayList<Serie> mySerie = new ArrayList<>();
        mySerie.add(new Serie("The walking dead", "Robert Kirkman"));
        mySerie.add(new Serie("westworld", "Jonathan Nolan", "ciencia ficcion", 3));
        mySerie.add(new Serie("Arcane", "Riot Games"));
        mySerie.add(new Serie("Vikings", "Michael Hirst ", "aventura", 6));
        mySerie.add(new Serie("The 100", "Jason Rothenberg", "ciencia ficcion", 7));

        /**
         * Creacion objeto Videojuego
         */
        ArrayList<Videojuego> myVideo = new ArrayList<>();
        myVideo.add(new Videojuego("Doom", 30));
        myVideo.add(new Videojuego("Halo 2", 40, "shooter", "Bungie Studios"));
        myVideo.add(new Videojuego("Fallout 3", 50));
        myVideo.add(new Videojuego("God of war", 35, "accion-aventura", "Santa Monica Studios"));
        myVideo.add(new Videojuego("GTA", 20, "Mundo abierto", "RocksStar Games"));

        /**
         * Entrega de videos y series
         */
        mySerie.get(1).entregar();
        mySerie.get(2).entregar();
        mySerie.get(4).entregar();
        myVideo.get(3).entregar();
        myVideo.get(0).entregar();


        /**
         * Se podrian cambiar los 2 siguientes metodos for por un metodo en sus respectivas
         * clases
         */

        //Contar numero de series entregadas y cambiar su estado a devuelto ( entregado = false)
        for (int i = 0; i < mySerie.size(); i++) {
            if (mySerie.get(i).isEntregado() == true) {
                contador++;
                mySerie.get(i).devolver();
                System.out.println(mySerie.get(i));
            }
        }
        //Contar numero de Videojuegos entregadas y cambiar su estado a devuelto ( entregado = false)
        for (int i = 0; i < mySerie.size(); i++) {
            if (myVideo.get(i).isEntregado() == true) {
                contador++;
                myVideo.get(i).devolver();
                System.out.println(myVideo.get(i));
            }
        }

        /**
         * Organizar array myVideo de menor a mayor
         */
        myVideo.sort(Comparator.comparing(Videojuego::getHorasEstimadas));

        /**
         * Imprimir informacion del video juego con mas horas estimadas
         */

        System.out.println("Video juego con mas horas estimadas: " + myVideo.get(4).toString());


        /**
         * Organizar array mySerie de menor a mayor
         */

        mySerie.sort(Comparator.comparing(Serie::getNumberoDeTemporadas));

        /**
         * Imprmir informacion de la serie con mas temporadas
         */

        System.out.println("Serie con mas temporadas: " + mySerie.get(4).toString());

    }

}
