/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica3;

import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n,i,d,m;
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Digite un numero: "+"\n");
        n=Integer.parseInt(teclado.nextLine());
        System.out.print("El incremento de el numero digitado con 77 es : "+(i=n+77)+"\n");
        System.out.print("El decremento de el numero dado con 3 es : "+(d=i-3)+"\n");
        System.out.print("Y al duplicar el valor del numero dado es : "+(m=d+d)+"\n");
        
    }
    
}
