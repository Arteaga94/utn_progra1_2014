/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class ejercicio1 {
    
    private int [][] matriz;
    private Scanner teclado;
    public void cargarmatriz()
    {
    teclado=new Scanner(System.in);
    matriz=new int[3][5];
    
        for (int f = 0; f < 3; f++) {
            
        for (int c = 0; c < 5; c++) {
            System.out.println("Ingrese el numero correspondiente");
            matriz[f][c]=teclado.nextInt();
        }
        }
    }
   public void imprimir()
   {
       for (int f = 0; f < 3; f++) {
          for (int c = 0; c < 5; c++) {
          System.out.print(matriz[f][c]+" ");
       } 
          System.out.println();
       }
   }
    
    
    
    
}
