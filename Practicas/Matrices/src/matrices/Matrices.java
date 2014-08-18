/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dijite el ejercicio que desea hacer:  ");
        opcion=Integer.parseInt(teclado.nextLine());
        switch(opcion)
        {
            case 1:
        
        ejercicio1 o = new ejercicio1();
        o.cargar();
        o.imprimir();
                break;
           case 2:
        
        ejercicio2 u = new ejercicio2();
               u.cargar();
              u.intercambiar();
               u.imprimir();
              case 3:
        
        ejercicio3 p = new ejercicio3();
              p.cargar();
              p.imprimirVertices();
                case 4:
        
        ejercicio4 y = new ejercicio4();
                  
              y.cargar();
              y.imprimirMayor();
             
        
        }
        
    }
}
