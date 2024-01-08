package datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author yasni
 */
public class BDPartidasGanadas {

    public void InsertarEnArchivoJugador(String datosJugador) {
        try {
            File archivo = new File("Reporte jugadores.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write("Nombre    Ganadas   Perdidas   Empatadas   Puntos Obtenidos    Total de partidas jugadas"+ "\r\n");
            archi.write(datosJugador + "\r\n");
            archi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void InsertarEnArchivoPartida(String datosPartidad) {
        try {
            File archivo = new File("Reporte de partidas.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write("Número de partida    Nombre del ganador  Cantidad de fichas    Duración de la partida"+ "\r\n");
            archi.write(datosPartidad + "\r\n");
            archi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }

//    public ArrayList<objReportePartida> LeerDesdeArchivoObjeto() {
//        try {
//            File archivo = new File("PartidasGanadas.txt");
//            BufferedReader archi = new BufferedReader(new FileReader(archivo));
//            while (archi.ready()) {
//                String[] separar = new String[4];
//                separar = archi.readLine().split(",");
//                //objReportePartida.listaReportes.add(new objReportePartida(separar[0].toString(), separar[1], separar[2].toString(), separar[3]));
//            }
//            archi.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al leer del arhivo", "Mensaje de error",
//                    JOptionPane.ERROR_MESSAGE);
//        }
//        return objReportePartida.listaReportes;
//    }
//
//    public ArrayList<String> LeerDesdeArchivoString() {
//        ArrayList<String> lista = new ArrayList<>();
//        try {
//            File archivo = new File("ListaUsuarios.txt");
//            BufferedReader archi = new BufferedReader(new FileReader(archivo));
//            while (archi.ready()) {
//                lista.add(archi.readLine());
//            }
//            archi.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al leer del arhivo", "Mensaje de error",
//                    JOptionPane.ERROR_MESSAGE);
//        }
//        return lista;
//    }

}
