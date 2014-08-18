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
public class ejercicio3 {
    
    private int [][] matriz;
    private Scanner teclado;
    public void cargarmatriz()
    {
    teclado=new Scanner(System.in);
    matriz=new int[3][4];
    
        for (int f = 0; f < 3; f++) {
            
        for (int c = 0; c < 4; c++) {
            System.out.println("Ingrese el numero correspondiente");
            matriz[f][c]=teclado.nextInt();
        }
        }
    }
    
    
    public void primerafila()
   {
       System.out.print("Primer fila de matriz");
       for (int c = 0; c < 4; c++) {
           System.out.println(matriz[0][c]);
           
   }
    
   }
    
    public void ultiamfila()
    {
    System.out.print("Primer fila de matriz");
        for (int c = 0; c < 4; c++) {
            System.out.println(matriz[2][c]);
        }
    }
    
    public void primercolumna()
    {
      System.out.print("Primer columna de matriz");
       for (int f = 0; f < 3; f++) {
           System.out.println(matriz[f][0]);
           
   }
    }
     public void ultimacolumna()
    {
      System.out.print("ultima columna de matriz");
       for (int f = 0; f < 3; f++) {
           System.out.println(matriz[f][3]);
           
   }
    }
    
}
