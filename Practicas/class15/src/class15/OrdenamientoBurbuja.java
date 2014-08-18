/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class15;

/**
 *
 * @author profe
 */
public class OrdenamientoBurbuja {

    public int[] ordenamientoburbuja(int[] arreglo, String ordenamiento) {
        int indice = 0;
        int indice2 = 0;
        int aux = 0;
        for (indice = 0; indice < arreglo.length; indice++) {
            for (indice2 = 0; indice2 < arreglo.length - indice - 1; indice2++) {
                if (arreglo[indice2 + 1] < arreglo[indice2]) {
                    aux = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = aux;
                }
            }

        }
        return arreglo;
    }
    public int[] ordenamientoburbujaD(int[] arreglo, String ordenamiento) {
        int indice = 0;
        int indice2 = 0;
        int aux = 0;
        if(ordenamiento.equals("a")){
        for (indice = 0; indice < arreglo.length; indice++) {
            for (indice2 = 0; indice2 < arreglo.length - indice - 1; indice2++) {
                if (arreglo[indice2 + 1] < arreglo[indice2]) {
                    aux = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = aux;
                }
            }
        }
    }
    else
    {
       for (indice = 0; indice < arreglo.length; indice++) {
            for (indice2 = 0; indice2 < arreglo.length - indice - 1; indice2++) {
                if (arreglo[indice2 + 1] > arreglo[indice2]) {
                    aux = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = aux;
                }
            }
        }  
    }
        return arreglo;
    
}
}
