/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import Listas.ListaGrupo;
import Listas.ListaEquipo;

/**
 *
 * @author Dinier
 */
public class NodoGrupo {
    
  private String nombre;
  private NodoEquipo eq1;
  private NodoEquipo eq2;
  private NodoEquipo eq3;
  private NodoEquipo eq4;
  private NodoGrupo siguienteGrupo;
  private NodoEquipo Equipos;
  private NodoJugador Jugadores;

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
     * @return the eq1
     */
    public NodoEquipo getEq1() {
        return eq1;
    }

    /**
     * @param eq1 the eq1 to set
     */
    public void setEq1(NodoEquipo eq1) {
        this.eq1 = eq1;
    }

    /**
     * @return the eq2
     */
    public NodoEquipo getEq2() {
        return eq2;
    }

    /**
     * @param eq2 the eq2 to set
     */
    public void setEq2(NodoEquipo eq2) {
        this.eq2 = eq2;
    }

    /**
     * @return the eq3
     */
    public NodoEquipo getEq3() {
        return eq3;
    }

    /**
     * @param eq3 the eq3 to set
     */
    public void setEq3(NodoEquipo eq3) {
        this.eq3 = eq3;
    }

    /**
     * @return the eq4
     */
    public NodoEquipo getEq4() {
        return eq4;
    }

    /**
     * @param eq4 the eq4 to set
     */
    public void setEq4(NodoEquipo eq4) {
        this.eq4 = eq4;
    }


    /**
     * @return the siguienteGrupo
     */
    public NodoGrupo getSiguienteGrupo() {
        return siguienteGrupo;
    }

    /**
     * @param siguienteGrupo the siguienteGrupo to set
     */
    public void setSiguienteGrupo(NodoGrupo siguienteGrupo) {
        this.siguienteGrupo = siguienteGrupo;
    }

    /**
     * @return the Equipos
     */
    public NodoEquipo getEquipos() {
        return Equipos;
    }

    /**
     * @param Equipos the Equipos to set
     */
    public void setEquipos(NodoEquipo Equipos) {
        this.Equipos = Equipos;
    }

    /**
     * @return the Jugadores
     */
    public NodoJugador getJugadores() {
        return Jugadores;
    }

    /**
     * @param Jugadores the Jugadores to set
     */
    public void setJugadores(NodoJugador Jugadores) {
        this.Jugadores = Jugadores;
    }

    
    
    
}
