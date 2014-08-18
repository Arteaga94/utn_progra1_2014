/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class20;

/**
 *
 * @author profe
 */
public class NodoDeLista {
     private int Dato;
    private NodoDeLista siguiente;
    
    public NodoDeLista()
    {
    Dato=0;
    siguiente=null;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    /**
     * @return the siguiente
     */
    public NodoDeLista getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }
}
