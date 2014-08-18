/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class17;

/**
 *
 * @author profe
 */
public class NodoDeLista {
    
    private String Dato;
    private NodoDeLista siguiente;
    
    public NodoDeLista()
    {
    Dato="";
    siguiente=null;
    }

    /**
     * @return the Dato
     */
    public String getDato() {
        return Dato;
    }

    /**
     * @param Dato the Dato to set
     */
    public void setDato(String Dato) {
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
