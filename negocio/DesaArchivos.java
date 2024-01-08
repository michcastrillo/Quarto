/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.*;
import java.io.File;
import javax.swing.JOptionPane;
import objetos.*;

/**
 *
 * @author Michelle
 */
public class DesaArchivos {
    public void limpiarArchivoJugador() {
        try {
            File archivo = new File("Reporte jugadores.txt");
            archivo.delete();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el archivo reporte de jugadores",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void guardarJugador() {
        limpiarArchivoJugador();
        BDPartidasGanadas guardar = new BDPartidasGanadas();
        String datos = "";
        for (int i = 0; i <= objReporteJuga.reportes.size() - 1; i++) {
            String nombre = objReporteJuga.reportes.get(i).getNombre();
            int  ganadas =objReporteJuga.reportes.get(i).getGanadas();
            int perdidas=objReporteJuga.reportes.get(i).getPerdidas();
            int empatadas=objReporteJuga.reportes.get(i).getEmpatadas();
            int puntosObt=objReporteJuga.reportes.get(i).getPuntosObt();
            int Tpartidas=objReporteJuga.reportes.get(i).getTpartidas();
            datos = nombre + "           " + ganadas + "         "+perdidas+"          "+empatadas+"               "+puntosObt+"                        "+Tpartidas;
            guardar.InsertarEnArchivoJugador(datos);
        }
        
    }
    public void limpiarArchivoPartida() {
        try {
            File archivo = new File("Reporte de partidas.txt");
            archivo.delete();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el archivo reporte de partidas",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void guardarPartida() {
        limpiarArchivoPartida();
        BDPartidasGanadas guardarp = new BDPartidasGanadas();
        String datos = "";
        for (int i = 0; i <= objReportePartida.listaReportes.size() - 1; i++) {
            int numPartida = objReportePartida.listaReportes.get(i).getNumPartida();
            String nombre = objReportePartida.listaReportes.get(i).getNombre();
            int fichas = objReportePartida.listaReportes.get(i).getFichas();
            String duracion = objReportePartida.listaReportes.get(i).getDuracion();
            datos = numPartida+"                        "+nombre + "                  " + fichas+ "                  "+duracion;
            guardarp.InsertarEnArchivoPartida(datos);
        }
        
    }
}
