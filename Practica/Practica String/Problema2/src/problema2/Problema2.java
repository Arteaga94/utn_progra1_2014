/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problema2;

import java.util.Scanner;

/**
 *
 * @author Dinier
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int opcion =0;
char c= 's';
int inicial ;
int Final ;
int p;
       Scanner o = new Scanner (System.in); 
class2 u = new class2();
    System.out.println("Digite la opcion que desea : ");
        System.out.println("1.Metodo substring");
        System.out.println("2.Metodo toUpperCase");
        System.out.println("3.Metodo valueOf");
        System.out.println("4.Metodo indexOf");
opcion = o.nextInt();
switch (opcion)
{
    case 1:
        System.out.println("Un desarrollador está construyendo la clase String de Java");
        System.out.println("Digite la pocision inical del substring");
        o = new Scanner (System.in);
        inicial = o.nextInt();
        System.out.println("Digite la pocision final del substring");
        Final = o.nextInt();
        u.setCadena2("Un desarrollador está construyendo la clase String de Java");
        System.out.println(u.substring(inicial, Final));
        break;
        case 2:
        System.out.println("Digite el texto");
        o = new Scanner (System.in);
        u.setCadena2(o.nextLine());
        System.out.println(u.toUpperCase());
        break;
        case 3:
        System.out.println("Un desarrollador está construyendo la clase String de Java");
        System.out.println("Digite el indice que desea averiguar");
        o = new Scanner (System.in);
        p =(o.nextInt());
        u.setCadena2("Un desarrollador está construyendo la clase String de Java");
        System.out.println(u.valueOf(p));
        break;
        case 4:
        System.out.println("Un desarrollador está construyendo la clase String de Java");
        System.out.println("Digite el caracter que desea encontrar");
        o = new Scanner (System.in);
        String n = o.nextLine();
        u.setCadena2("Un desarrollador está construyendo la clase String de Java");
        System.out.println("Digite la pocision para iniciar a la busqueda");
        Final = o.nextInt();
        System.out.println(u.indexOf(n, Final));
        break;
            
}
    
    


    }
    
    
}
