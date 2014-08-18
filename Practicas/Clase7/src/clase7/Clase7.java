/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion=0;
        Scanner o = new Scanner (System.in);
        
        do 
        {
            System.out.println("Digite la opcion que desea : ");
              System.out.println("1:ejercicio 1");
               System.out.println("2:ejercicio 2");
              opcion = o.nextInt();
              switch(opcion)
              {
              case 1:
                  System.out.println("Digite el correo a evaluar");
                  o = new Scanner (System.in);
                  ejercicio1 u = new ejercicio1(o.nextLine());
                  System.out.println(u.validarcorreo());
                  break;
                  
                  case 2:
                  System.out.println("Digite la cadena de caracteres");
                  o = new Scanner (System.in);
                  ejercicio2 i = new ejercicio2();
                 i.setCadena(o.nextLine());
                  System.out.println(i.mediacadena());
                  System.out.println(i.ultimovalor());
                  System.out.println(i.alrevez());
                  System.out.println(i.guion());
                  System.out.println(i.vocales());
                  System.out.println(i.palindromo());
                  break;
              }
                      
                      
        }while(opcion<=2);
        
        
        
        
    }
}
