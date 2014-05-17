/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n=0;
       double a=0;
       char c = 0;
       
       
     Scanner teclado = new Scanner (System.in);
     
     System.out.print("Digite un numero" +"\n");
     n=Integer.parseInt(teclado.nextLine());
     System.out.print("Digite un numero" +"\n");
      a=Double.parseDouble(teclado.nextLine());
      
      System.out.print("Digite un caracter"+"\n");
      c=teclado.nextLine().charAt(0);
      int numero = (int)c;
       
     System.out.print("La suma de n + a =  "+(n+a) +"\n");
     System.out.print("la diferencia de a - n =  "+(a-n) +"\n");  
     System.out.print("El caracter en decimal es  =  "+ numero +"\n");  
    }
}
