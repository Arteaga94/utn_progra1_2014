/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package probrema1;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Probrema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int opcion =0;
char c= 's';
String palabra ;
String textoAUsar;
       Scanner o = new Scanner (System.in); 
class1 u = new class1();
do{
    System.out.println("Digite la opcion que desea : ");
        System.out.println("1.Ejercicio Al revés");
        System.out.println("2.Ejercicio Palindromo");
        System.out.println("3.Ejercicio Buscar Palabra");
        System.out.println("4.Ejercicio Cantidad de ocurrencias");
opcion = o.nextInt();
switch (opcion)
{
    case 1:
        System.out.println("Digite la palabra que desea ver al revés");
        o = new Scanner (System.in);
        u.setCadena(o.nextLine());
        System.out.println(u.Mitadcadena());
        break;
        case 2:
        System.out.println("Digite la palabra para hacer palindromo");
        o = new Scanner (System.in);
        u.setCadena(o.nextLine());
        System.out.println(u.palindromo());
        break;
        case 3:
            System.out.println("Digite la palabra a buscar");
            o = new Scanner (System.in);
            u.setCadena(o.nextLine());
            System.out.println("Digite el texo para buscar");
            textoAUsar=o.nextLine();
            System.out.println(u.buscarPalabra(textoAUsar));
            break;    
        case 4:
        System.out.println("Digite la palabra a buscar");
        o = new Scanner (System.in);
        palabra= o.nextLine();
        System.out.println("Digite el texo para buscar la concurrencia de la palabra");
        textoAUsar=o.nextLine();
        u.setCadena(o.nextLine());
        
        System.out.println(u.buscarCantidad(palabra, textoAUsar));
        break;
}
    
    


    System.out.print("Desea continuar con otra operacion S/N ");
            c = o.nextLine().charAt(0);
    
}while(c=='s'||c=='S'); 
    
}
}
