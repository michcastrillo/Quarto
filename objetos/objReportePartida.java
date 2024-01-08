/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author Michelle
 */
public class objReportePartida {
    public static ArrayList<objReportePartida> listaReportes = new ArrayList<>();
    private int numPartida;
    private String nombre;
    private int fichas;
    private String duracion;

    public static ArrayList<objReportePartida> getReportes() {
        return listaReportes;
    }

    public static void setReportes(ArrayList<objReportePartida> reportes) {
        objReportePartida.listaReportes = reportes;
    }

    public int getNumPartida() {
        return numPartida;
    }

    public void setNumPartida(int numPartida) {
        this.numPartida = numPartida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public objReportePartida(int numPartida, String nombre, int fichas, String duracion) {
        this.numPartida = numPartida;
        this.nombre = nombre;
        this.fichas = fichas;
        this.duracion = duracion;
    }
}
