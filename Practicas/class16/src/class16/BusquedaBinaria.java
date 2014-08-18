/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16;

/**
 *
 * @author profe
 */
public class BusquedaBinaria {

    public int BuscarNombre(String[] nombres, String busqueda) {
        int inicial = 0;
        int elementoFinal = nombres.length - 1;

        while (inicial < elementoFinal) {
            int central = (inicial + elementoFinal) / 2;
            if (busqueda.compareTo(nombres[central]) > 0) {
                inicial = central + 1;
            } else {
                if (busqueda.compareTo(nombres[central]) < 0) {
                    elementoFinal = central - 1;
                } else {
                    return central;
                }
            }
        }
        return -1;
    }
}
