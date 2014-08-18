/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Dinier
 */
public class NodoEstadio {
    
    private String nombre;
    private NodoEstadio siguienteEstadio;
    private NodoEquipo equipos;
    private NodoJugador jugadores;
    private NodoGrupo grupos;
    private int CantidadPersonas;
    private String Clima;
    private String cuidad;
    private int PartidosJugados;

    public NodoEquipo getEquipos() {
        return equipos;
    }

    public void setEquipos(NodoEquipo equipos) {
        this.equipos = equipos;
    }

    public NodoGrupo getGrupos() {
        return grupos;
    }

    public void setGrupos(NodoGrupo grupos) {
        this.grupos = grupos;
    }

    public NodoJugador getJugadores() {
        return jugadores;
    }

    public void setJugadores(NodoJugador jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoEstadio getSiguienteEstadio() {
        return siguienteEstadio;
    }

    public void setSiguienteEstadio(NodoEstadio siguienteEstadio) {
        this.siguienteEstadio = siguienteEstadio;
    }

    /**
     * @return the CantidadPersonas
     */
    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    /**
     * @param CantidadPersonas the CantidadPersonas to set
     */
    public void setCantidadPersonas(int CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }  
   public String getClima() {
        return Clima;
    }

    public void setClima(String Clima) {
        this.Clima = Clima;
    }

    /**
     * @return the PartidosJugados
     */
    public int getPartidosJugados() {
        return PartidosJugados;
    }

    /**
     * @param PartidosJugados the PartidosJugados to set
     */
    public void setPartidosJugados(int PartidosJugados) {
        this.PartidosJugados = PartidosJugados;
    }
 
}
