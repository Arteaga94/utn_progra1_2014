/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Dinier
 */
public class NodoGoleador {
     private String nombre ;
    private String equipos;
    private int goles;
    private NodoGoleador siguienteGoleador;

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
     * @return the equipos
     */
    public String getEquipos() {
        return equipos;
    }

    /**
     * @param equipos the equipos to set
     */
    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    /**
     * @return the goles
     */
    public int getGoles() {
        return goles;
    }

    /**
     * @param goles the goles to set
     */
    public void setGoles(int goles) {
        this.goles = goles;
    }

    /**
     * @return the siguienteGoleador
     */
    public NodoGoleador getSiguienteGoleador() {
        return siguienteGoleador;
    }

    /**
     * @param siguienteGoleador the siguienteGoleador to set
     */
    public void setSiguienteGoleador(NodoGoleador siguienteGoleador) {
        this.siguienteGoleador = siguienteGoleador;
    }
    
}
