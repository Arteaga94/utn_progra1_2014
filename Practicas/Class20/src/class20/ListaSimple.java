/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class20;

/**
 *
 * @author profe
 */
public class ListaSimple {

    private NodoDeLista raiz;
    private NodoDeLista raiz2;

    public ListaSimple() {
        raiz = null;
    }

    public void imprimir() {

        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la lista");
       
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
       
        NodoDeLista recorrido2 = raiz2;
        while (recorrido2 != null) {
            System.out.println(recorrido2.getDato());
            recorrido2 = recorrido2.getSiguiente();
        }
        System.out.println();

    }

    public void Insertar(int dato) {
        NodoDeLista nuevo;
        NodoDeLista menor;


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

    public void Insertar2(int dato2) {
        NodoDeLista nuevo;
        NodoDeLista menor;


        nuevo = new NodoDeLista();

        nuevo.setDato(dato2);
        if (raiz2 == null) {
            nuevo.setSiguiente(null);
            raiz2 = nuevo;
        } else {
            nuevo.setSiguiente(raiz2);
            raiz2 = nuevo;
        }
    }

    public int Cantidad() {
        int cont = 0;
        NodoDeLista conta = raiz;
        while (conta != null) {
            conta = conta.getSiguiente();
            cont++;
        }

        return cont++;

    }

    public void arreglo() {

        NodoDeLista recorrido = raiz;
        int arreglo[] = new int[Cantidad()];
        int cont = 0;
        while (recorrido != null) {
            arreglo[cont] = recorrido.getDato();
            cont++;
            recorrido = recorrido.getSiguiente();
        }
        arreglo = ordenamientoburbuja(arreglo);
        raiz = null;
        for (int i = 0; i < arreglo.length; i++) {
            Insertar(arreglo[i]);
        }

    }

    public int[] ordenamientoburbuja(int[] arreglo) {
        int indice = 0;
        int indice2 = 0;
        int aux = 0;

        for (indice = 0; indice < arreglo.length; indice++) {
            for (indice2 = 0; indice2 < arreglo.length - indice - 1; indice2++) {
                if (arreglo[indice2 + 1] > arreglo[indice2]) {
                    aux = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = aux;
                }
            }
        }
        return arreglo;
    }

    public double SumatoriadeCuadrados() {

        double sumatoria = 0;
        double cuadrado = 0;
        NodoDeLista reco = raiz;

        while (reco != null) {
            cuadrado = (reco.getDato() * reco.getDato());
            sumatoria += cuadrado;
            reco = reco.getSiguiente();
        }
        return sumatoria;
    }

    public void Par_E_Impar(int dato) {
       

        if (dato % 2 == 0) {
            System.out.println("Par");

            NodoDeLista nuevo = new NodoDeLista();
            nuevo.setDato(dato);

            if (raiz == null) {
                nuevo.setSiguiente(null);

                raiz = nuevo;

            } else {
                nuevo.setSiguiente(raiz);
                raiz = nuevo;

            }
        } else {
            System.out.println("imPar");

            NodoDeLista nuevo = new NodoDeLista();
            nuevo.setDato(dato);

            if (raiz2 == null) {
                nuevo.setSiguiente(null);

                raiz2 = nuevo;

            } else {
                nuevo.setSiguiente(raiz2);
                raiz2 = nuevo;

            }
        }
    }
    
        public void invertir(){
        NodoDeLista siguiente =raiz;
        NodoDeLista anterior = null;
        while (raiz != null) {
            siguiente = raiz.getSiguiente();
            raiz.setSiguiente(anterior);
            anterior = raiz;
            raiz = siguiente;

        }
        raiz = anterior;

    }
    }

