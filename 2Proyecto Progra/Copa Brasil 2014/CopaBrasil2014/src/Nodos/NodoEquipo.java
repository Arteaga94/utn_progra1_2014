/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Dinier
 */
public class NodoEquipo {
    private String nombre;
    private NodoJugador jugadores;
    private NodoEquipo siguienteEquipo;
    private int PJ;
    private int PG;
    private int PE;
    private int PP;
    private int GA;
    private int GE;
    private int GDif;
    private int puntos;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the jugadores
     */
    public NodoJugador getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(NodoJugador jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * @return the siguienteEquipo
     */
    public NodoEquipo getSiguienteEquipo() {
        return siguienteEquipo;
    }

    /**
     * @param siguienteEquipo the siguienteEquipo to set
     */
    public void setSiguienteEquipo(NodoEquipo siguienteEquipo) {
        this.siguienteEquipo = siguienteEquipo;
    }

    /**
     * @return the PJ
     */
    public int getPJ() {
        return PJ;
    }

    /**
     * @param PJ the PJ to set
     */
    public void setPJ(int PJ) {
        this.PJ = PJ;
    }

    /**
     * @return the PG
     */
    public int getPG() {
        return PG;
    }

    /**
     * @param PG the PG to set
     */
    public void setPG(int PG) {
        this.PG = PG;
    }

    /**
     * @return the PE
     */
    public int getPE() {
        return PE;
    }

    /**
     * @param PE the PE to set
     */
    public void setPE(int PE) {
        this.PE = PE;
    }

    /**
     * @return the PP
     */
    public int getPP() {
        return PP;
    }

    /**
     * @param PP the PP to set
     */
    public void setPP(int PP) {
        this.PP = PP;
    }

    /**
     * @return the GA
     */
    public int getGA() {
        return GA;
    }

    /**
     * @param GA the GA to set
     */
    public void setGA(int GA) {
        this.GA = GA;
    }

    /**
     * @return the GE
     */
    public int getGE() {
        return GE;
    }

    /**
     * @param GE the GE to set
     */
    public void setGE(int GE) {
        this.GE = GE;
    }

    /**
     * @return the GDif
     */
    public int getGDif() {
        return GDif;
    }

    /**
     * @param GDif the GDif to set
     */
    public void setGDif(int GDif) {
        this.GDif = GDif;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    
}
