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
public class ejercicio2 {
    private Scanner teclado;
    private int[][] matriz;
    
    public void cargar() {
        teclado=new Scanner(System.in);
      System.out.println("Cuantas filas tiene la matriz");
      int filas = teclado.nextInt();
        System.out.println("Cuantas columnas tiene la matriz");
      int columnas = teclado.nextInt();
      
      matriz=new int [filas][columnas];
        for(int f=0;f<matriz.length;f++) {        
           for(int c=0;c<matriz[f].length;c++) {
               System.out.print("Ingrese componente ");
                matriz[f][c]=teclado.nextInt();
           }
        }
    }
    public void intercambiar()
    {
        for (int c = 0; c < matriz[0].length; c++) {
           int aux = matriz[1][c];
           matriz[1][c]=matriz[2][c];
           matriz[2][c]=aux;
        }
    }
      public void imprimir() {
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }   
    
}
