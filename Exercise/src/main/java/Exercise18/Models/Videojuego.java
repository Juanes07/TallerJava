package Exercise18.Models;

import Exercise18.Entregable;

public class Videojuego implements Entregable {
    protected String titulo;
    protected Integer horasEstimadas;
    protected Boolean entregado;
    protected String genero;
    protected String compañia;


    public Videojuego() {
        this.compañia = " ";
        this.genero = " ";
        this.horasEstimadas = 10;
        this.titulo = "titulo";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = " ";
        this.compañia = " ";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }


    public int compareTo(Videojuego videojuego) {

        if (this.horasEstimadas > videojuego.horasEstimadas) {
            return 1;
        } else if (this.horasEstimadas < videojuego.horasEstimadas) {
            return -1;
        }
        return 0;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuego: " +
                "titulo= '" + titulo + '\'' +
                ", horasEstimadas= " + horasEstimadas +
                ", entregado= " + entregado +
                ", genero= '" + genero + '\'' +
                ", compañia= '" + compañia + '\'';
    }

    @Override
    public boolean entregar() {
        return entregado = true;
    }

    @Override
    public boolean devolver() {
        return entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }
}
