/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class19;

/**
 *
 * @author Profe
 */
public class Cola {

    private NodoDeLista raiz;
    private NodoDeLista ultimo;

    public Cola() {
        raiz = null;
    }

    public boolean Vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }

    }

    public void Encolar(String dato) {
        NodoDeLista nuevo;

        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        nuevo.setSiguiente(null);
        if (Vacia()) {
            raiz = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }

    }

    public Object Desencolar() {
        if (!Vacia()) {
            Object dato = raiz.getDato();
            if (raiz == ultimo) {
                raiz = null;
                ultimo = null;
            } else {
                raiz = raiz.getSiguiente();
            }
            return dato;
        }
        return new Object();
    }
    
    public void imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la Cola");
        while (recorrido != null) {
            System.out.println(recorrido.getDato() + "-");
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();

    }
    
}
