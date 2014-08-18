/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica6;

import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int b;
        
        Scanner teclado = new Scanner(System.in);
      
        
      System.out.print("Digite un numero"+"\n");
      b=Integer.parseInt(teclado.nextLine());
   
      
     if(b>=0)
           System.out.println("Positivo"+"\n");    
        else
            System.out.println("Negativo"+"\n"); 
                
        
        
    }
    
}
