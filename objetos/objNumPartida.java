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
public class objNumPartida {
    public static ArrayList<objNumPartida> partidas = new ArrayList<>();
    public int npar;


    public int getNpar() {
        return npar;
    }

    public void setNpar(int npar) {
        this.npar = npar;
    }

    public static ArrayList<objNumPartida> getPartidas() {
        return partidas;
    }

    public static void setPartidas(ArrayList<objNumPartida> partidas) {
        objNumPartida.partidas = partidas;
    }

    public objNumPartida(int npar) {
        this.npar = npar;
    }
}
