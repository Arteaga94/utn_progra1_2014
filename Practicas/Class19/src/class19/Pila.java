/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class19;

/**
 *
 * @author Profe
 */
public class Pila {

    private NodoDeLista raiz;

    public Pila() {
        raiz = null;
    }

    public void Push(String dato) {
        NodoDeLista nuevo;

        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }

    }

    public Object Pop() {
        if (raiz != null) {
            Object inf = raiz.getDato();
            raiz = raiz.getSiguiente();
            return inf;
        }
        return new Object();
    }

    public void imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la Pila");
        while (recorrido != null) {
            System.out.println(recorrido.getDato() + "-");
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();

    }

    public boolean Vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }

    }

    public int cantidad() {
        int cantidad = 0;
        NodoDeLista recorrido = raiz;
        while (recorrido != null) {
            cantidad++;
            recorrido = recorrido.getSiguiente();
        }
        return cantidad;
    }
}
