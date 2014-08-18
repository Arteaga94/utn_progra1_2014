/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class17;

/**
 *
 * @author profe
 */
public class Lista {

    private NodoDeLista raiz;

    public Lista() {
        raiz = null;
    }

    public void Insertar(String dato) {
        NodoDeLista nuevo;
        NodoDeLista recorrido=raiz;

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

    public void imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();

    }

    public String EliminarInicio() {
        NodoDeLista nuevo;

        nuevo = new NodoDeLista();
        try {
            String dato = raiz.getDato();
            raiz = raiz.getSiguiente();
            if (raiz == null) {
                raiz = nuevo;
            }
            return dato;

        } catch (Exception e) {
            return null;
        }
    }

    public void EliminarUltimo() {

        NodoDeLista pivot = raiz;
        NodoDeLista pivot2 = raiz;

        try {
            if (pivot.getSiguiente() != null) {
                while (pivot.getSiguiente() != null) {
                    pivot2 = pivot;
                    pivot = pivot.getSiguiente();
                }
                pivot = pivot2;
                pivot.setSiguiente(null);

            } else {
                pivot = null;
                raiz = pivot;
            }

        } catch (Exception e) {;
            System.exit(0);
        }

    }

    public void cualquiera(String x) {
        NodoDeLista pivot = raiz;

        if (pivot.getSiguiente() != null) {
            if (pivot.getDato().equals(x)) {
                EliminarInicio();
            } else {
                while (pivot.getSiguiente().getSiguiente() != null) {
                    if (pivot.getSiguiente().getDato().equals(x)) {
                        pivot.setSiguiente(pivot.getSiguiente().getSiguiente());
                    } else {
                        pivot = pivot.getSiguiente();

                    }
                }
                if (pivot.getSiguiente().getDato().equals(x)) {
                    EliminarUltimo();
                }
            }
        } else {
            if (pivot.getDato().equals(x)) {
                pivot = null;
                raiz = pivot;
            }
        }

    }
}
