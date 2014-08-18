/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int x,y;
       double n,m;
       
      Scanner teclado = new Scanner(System.in);
      
      //resultados sin decimales 
      
      System.out.print("Digite un numero en la variable x = "+"\n");
      x=Integer.parseInt(teclado.nextLine());
      
       System.out.print("Digite un numero en la variable y = "+"\n");
      y=Integer.parseInt(teclado.nextLine());
      
      
       System.out.print("La suma de x + y =  "+(x+y) +"\n");
      System.out.print("La resta de x - y =  "+(x-y) +"\n");
      System.out.print("La multiplicacion de x * y =  "+x*y +"\n");
      System.out.print("La division de x / y =  "+x/y +"\n");
      
      
      // resultados con decimales
      System.out.print("Digite un numero en la variable n = "+"\n");
      n=Double.parseDouble(teclado.nextLine());
      
      System.out.print("Digite un numero en la variable m = "+"\n");
      m=Double.parseDouble(teclado.nextLine());
     
      System.out.print("La suma de n + m =  "+(n+m) +"\n");
      System.out.print("La resta de n - m =  "+(n-m) +"\n");
      System.out.print("La multiplicacion de n * m =  "+n*m +"\n");
      System.out.print("La division de n / m =  "+n/m +"\n");
      
      
      
      
      
    }
}
