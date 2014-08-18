/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class15;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Class15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 1;
        char c='s';
        int[] arreglo = {55, 4, 85, 85, 42};
        int[] arregloOrdenado;
        String ordenamiento="a";
  OrdenamientoSeleccion o = new OrdenamientoSeleccion();       
OrdenamientoBurbuja u = new OrdenamientoBurbuja();
        
        do {
               Scanner teclado = new Scanner(System.in);
            System.out.println("Digite que ejercicio quiere hacer 1 o 2");
            opcion = Integer.parseInt(teclado.nextLine());
        switch (opcion) {
            case 1:
               System.out.println("Digite a=acendente, d=decendente");
                  ordenamiento=teclado.nextLine();
                arregloOrdenado = o.OrdenS(arreglo, ordenamiento);
                for (int i = 0; i < arregloOrdenado.length; i++) {
                    System.out.println(arregloOrdenado[i]);
                }
                    break;
            case 2: 
                System.out.println("Digite a=acendente, d=decendente");
                  ordenamiento=teclado.nextLine();
                arregloOrdenado = u.ordenamientoburbujaD(arreglo, ordenamiento);
                for (int i = 0; i < arregloOrdenado.length; i++) {
                    System.out.println(arregloOrdenado[i]);
                }
                    break;
               
                } 
        System.out.println("Desea continuar S/N");
            c = teclado.nextLine().charAt(0);
            } while (c == 's' || c =='S');
}
}
