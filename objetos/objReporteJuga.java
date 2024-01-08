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
public class objReporteJuga {
    public static ArrayList<objReporteJuga> reportes = new ArrayList<>();
    private String nombre;
    private int  ganadas =0;
    private int perdidas=0;
    private int empatadas=0;
    private int puntosObt=0;
    private int Tpartidas=0;

    public static ArrayList<objReporteJuga> getReportes() {
        return reportes;
    }

    public static void setReportes(ArrayList<objReporteJuga> reportes) {
        objReporteJuga.reportes = reportes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public int getEmpatadas() {
        return empatadas;
    }

    public void setEmpatadas(int empatadas) {
        this.empatadas = empatadas;
    }

    public int getPuntosObt() {
        return puntosObt;
    }

    public void setPuntosObt(int puntosObt) {
        this.puntosObt = puntosObt;
    }

    public int getTpartidas() {
        return Tpartidas;
    }

    public void setTpartidas(int Tpartidas) {
        this.Tpartidas = Tpartidas;
    }

    public objReporteJuga(String nombre, int ganadas, int perdidas, int empatadas, int puntosObt, int Tpartidas) {
        this.nombre = nombre;
        this.ganadas = ganadas;
        this.perdidas = perdidas;
        this.empatadas = empatadas;
        this.puntosObt = puntosObt;
        this.Tpartidas = Tpartidas;
    }
}
