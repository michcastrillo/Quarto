package negocio;
import objetos.*;
/**
 *
 * @author Michelle
 */
public class DesaJuga {
   DesaArchivos desarchi = new DesaArchivos();
    public void empates(String Jugador1,String Jugador2){
        int empatesJ1 = 0;
        int empatesJ2 = 0;
        int npart = objNumPartida.partidas.size();
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador1.equals(objReporteJuga.reportes.get(i).getNombre())){
                empatesJ1 = objReporteJuga.reportes.get(i).getEmpatadas();
            }
            if(Jugador2.equals(objReporteJuga.reportes.get(i).getNombre())){
                empatesJ2 = objReporteJuga.reportes.get(i).getEmpatadas();
            }
        }
        empatesJ1 = empatesJ1 +1;
        empatesJ2= empatesJ2+1;
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador1.equals(objReporteJuga.reportes.get(i).getNombre())){
                objReporteJuga.reportes.get(i).setEmpatadas(empatesJ1);
                objReporteJuga.reportes.get(i).setTpartidas(npart);
            }
            if(Jugador2.equals(objReporteJuga.reportes.get(i).getNombre())){
                objReporteJuga.reportes.get(i).setEmpatadas(empatesJ2);
                objReporteJuga.reportes.get(i).setTpartidas(npart);
            }
        }
        desarchi.guardarJugador();
    }
    public void restarpuntosJ1(String Jugador1, int puntosJ1){
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador1.equals(objReporteJuga.reportes.get(i).getNombre())){
                objReporteJuga.reportes.get(i).setPuntosObt(puntosJ1);
            }
        }
        desarchi.guardarJugador();
    }
    public void restarpuntosJ2(String Jugador2, int puntosJ2){
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador2.equals(objReporteJuga.reportes.get(i).getNombre())){
                objReporteJuga.reportes.get(i).setPuntosObt(puntosJ2);
            }
        }
        desarchi.guardarJugador();
    }
    public int ganadasJ2(String Jugador2){
        int ganadas = 0;
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador2.equals(objReporteJuga.reportes.get(i).getNombre())){
                ganadas = objReporteJuga.reportes.get(i).getGanadas();
            }
        }
        return ganadas;
    }
    public int perdidasJ2(String Jugador2){
        int perdidas = 0;
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador2.equals(objReporteJuga.reportes.get(i).getNombre())){
                perdidas = objReporteJuga.reportes.get(i).getPerdidas();
            }
        }
        return perdidas;
    }
    
    public void ganadorJ2(String Jugador2, int puntosJ2){
        int ganadas = ganadasJ2(Jugador2);
        int npart = objNumPartida.partidas.size();
        ganadas = ganadas +1;
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador2.equals(objReporteJuga.reportes.get(i).getNombre())){
                objReporteJuga.reportes.get(i).setGanadas(ganadas);
                objReporteJuga.reportes.get(i).setPuntosObt(puntosJ2);
                objReporteJuga.reportes.get(i).setTpartidas(npart);
            }
        }
        desarchi.guardarJugador();
    }
    public void perdedorJ2(String Jugador2, int puntosJ2){
        int perdidas = perdidasJ2(Jugador2);
        int npart = objNumPartida.partidas.size();
        perdidas = perdidas +1;
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador2.equals(objReporteJuga.reportes.get(i).getNombre())){
                objReporteJuga.reportes.get(i).setPerdidas(perdidas);
                objReporteJuga.reportes.get(i).setPuntosObt(puntosJ2);
                objReporteJuga.reportes.get(i).setTpartidas(npart);
            }
        }
        desarchi.guardarJugador();
    }
    public int ganadasJ1(String Jugador1){
        int ganadas = 0;
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador1.equals(objReporteJuga.reportes.get(i).getNombre())){
                ganadas = objReporteJuga.reportes.get(i).getGanadas();
            }
        }
        return ganadas;
    }
    public int perdidasJ1(String Jugador1){
        int perdidas = 0;
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador1.equals(objReporteJuga.reportes.get(i).getNombre())){
                perdidas = objReporteJuga.reportes.get(i).getPerdidas();
            }
        }
        return perdidas;
    }
    public void ganadorJ1(String Jugador1, int puntosJ1){
        int ganadas = ganadasJ1(Jugador1);
        int npart = objNumPartida.partidas.size();
        ganadas = ganadas +1;
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador1.equals(objReporteJuga.reportes.get(i).getNombre())){
                objReporteJuga.reportes.get(i).setGanadas(ganadas);
                objReporteJuga.reportes.get(i).setPuntosObt(puntosJ1);
                objReporteJuga.reportes.get(i).setTpartidas(npart);
            }
        }
        desarchi.guardarJugador();
    }
    public void perdedorJ1(String Jugador1, int puntosJ1){
        int perdidas = perdidasJ1(Jugador1);
        int npart = objNumPartida.partidas.size();
        perdidas = perdidas +1;
        for(int i=0;i<objReporteJuga.reportes.size();i++){
            if(Jugador1.equals(objReporteJuga.reportes.get(i).getNombre())){
                objReporteJuga.reportes.get(i).setPerdidas(perdidas);
                objReporteJuga.reportes.get(i).setPuntosObt(puntosJ1);
                objReporteJuga.reportes.get(i).setTpartidas(npart);
            }
        }
        desarchi.guardarJugador();
    }
}
