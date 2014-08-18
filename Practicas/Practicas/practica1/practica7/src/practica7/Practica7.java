/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica7;

import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int c;
        
        Scanner teclado = new Scanner(System.in);
      
        
      System.out.print("Digite un numero"+"\n");
      c=Integer.parseInt(teclado.nextLine());
   
      
     if(c>=0)
           System.out.println("Positivo"+"\n");    
        else
            System.out.println("Negativo"+"\n"); 
     
      if(c%2==0)
           System.out.println("Es par"+"\n");    
        else
            System.out.println("Es impar"+"\n"); 
                
       if(c%5==0)
           System.out.println("Es multiplo de 5"+"\n");    
        else
            System.out.println("No es multiplo de 5"+"\n"); 
       
       if(c%10==0)
           System.out.println("Es multiplo de 10"+"\n");    
        else
            System.out.println("No es multiplo de 10"+"\n"); 
       
       if(c>100)
           System.out.println("Es Mayor de 100"+"\n");    
        else
            System.out.println("Es Menor de 100"+"\n"); 
       
       
       
                 
        
        
        
        
        
        
    }
    
}
