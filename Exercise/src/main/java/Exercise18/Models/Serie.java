package Exercise18.Models;

import Exercise18.Entregable;

public class Serie implements Entregable {
    String titulo = " ";
    Integer numberoDeTemporadas = 3;
    Boolean entregado = false;
    String genero = " ";
    String creador = " ";
    int resultadoComparacion = 0;


    public Serie() {
        this.creador = getCreador();
        this.genero = getGenero();
        this.numberoDeTemporadas = getNumberoDeTemporadas();
        this.titulo = getTitulo();
    }


    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numberoDeTemporadas = getNumberoDeTemporadas();
        this.genero = getGenero();
    }

    public Serie(String titulo, String creador, String genero, int numberoDeTemporadas) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.numberoDeTemporadas = numberoDeTemporadas;
    }


    public int compareTo(Serie serie) {

        if (this.numberoDeTemporadas > serie.numberoDeTemporadas) {
            return 1;
        } else if (this.numberoDeTemporadas < serie.numberoDeTemporadas) {
            return -1;
        }
        return 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumberoDeTemporadas() {
        return numberoDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumberoDeTemporadas(Integer numberoDeTemporadas) {
        this.numberoDeTemporadas = numberoDeTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie: " +
                "titulo= " + titulo + '\'' +
                ", numberoDeTemporadas= " + numberoDeTemporadas +
                ", entregado= " + entregado +
                ", genero= " + genero + '\'' +
                ", creador= " + creador + '\''
                ;
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
