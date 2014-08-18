/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class20;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Class20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        int x;
        int y;
        Scanner teclado = new Scanner(System.in);
        ListaSimple o = new ListaSimple();


        System.out.println("Digite el numero del ejercicio");
        opcion = Integer.parseInt(teclado.nextLine());

        switch (opcion) {
            case 1:
                do {
                    System.out.println("Lista 1");
                    System.out.println("Digite una serie de numeros");
                    x = teclado.nextInt();
                    if (x != 0) {
                        o.Insertar(x);
                    }

                } while (x != 0);
              
                System.out.println("Cantidad de nodos es :  " + o.Cantidad());
                System.out.println("La sumatoria de los cuadrados de los elementos de la lista es : " + o.SumatoriadeCuadrados());
                
                o.imprimir();
                
                break;
            case 2:
            do {
                    System.out.println("Lista 1");
                    System.out.println("Digite una serie de numeros");
                    x = teclado.nextInt();
                    if (x != 0) {
                        o.Insertar(x);
                    }
                    
                } while (x != 0);
            do{
                     System.out.println("Lista 2");
                    System.out.println("Digite una serie de numeros");
                    y = teclado.nextInt();
                    if (y != 0) {
                        o.Insertar2(y);
                    }
                     } while (y != 0);
                System.out.println("Cantidad de nodos es :  " + o.Cantidad());
                System.out.println("La sumatoria de los cuadrados de los elementos de la lista es : " + o.SumatoriadeCuadrados());
                o.arreglo();
                o.imprimir();
                break;
            case 3:
                do {
                    System.out.println("Lista 1");
                    System.out.println("Digite una serie de numeros");
                    x = teclado.nextInt();
                    if (x != 0) {
                        o.Par_E_Impar(x);
                    }
                    
                } while (x != 0);
                o.imprimir();
                break;
            case 4:
                do {
                    System.out.println("Lista 1");
                    System.out.println("Digite una serie de numeros");
                    x = teclado.nextInt();
                    if (x != 0) {
                        o.Insertar(x);
                    }
                    
                } while (x != 0);
                o.imprimir();
                o.invertir();
                o.imprimir();
                break;


        }
    }
}
