/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Class16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
             int opcion = 1;
        char c='s';
        String[] arreglo = {"Mario","Efren","Susana","Cambell","Agustin","Elias"};
            String[] arreglo2 = {"Cambell","Agustin","Susana","Elias","Efren","Mario"};
     
     
  BusquedaBinaria o = new BusquedaBinaria();       
BusquedaLineal u = new BusquedaLineal();
        
        do {
               Scanner teclado = new Scanner(System.in);
            System.out.println("Digite que ejercicio quiere hacer 1.BusquedaLineal o 2.BusquedaBinaria");
            opcion = Integer.parseInt(teclado.nextLine());
        switch (opcion) {
            case 1:
               System.out.println("La busqueda lineal es:"+u.BuscarNombre(arreglo, "Efren"));
                
                    break;
            case 2: 
                System.out.println("La busqueda Binaria es:"+o.BuscarNombre(arreglo2, "Cambell"));
                
                    break;
                } 
        System.out.println("Desea continuar S/N");
            c = teclado.nextLine().charAt(0);
            } while (c == 's' || c =='S');
       System.exit(0);
}
    
}
