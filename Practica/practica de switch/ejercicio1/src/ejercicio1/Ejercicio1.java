/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int mes,rest;
        int cuadrado;
        String res;
        double res2;
        char cs = 's';
        int opcion;
        String Letra;
        int ano;
        int num=0, u, d, c, m;
        int dia,a,m2;
        char dia1;
        Scanner teclado = new Scanner(System.in);
      class1 o = new class1();

        do {
               System.out.println("Digite el numero del ejercicio");
            opcion = Integer.parseInt(teclado.nextLine());
            
            switch (opcion) {
                case 1:
                    
                    System.out.println("Digite un numero del 1 al 12 ");
                    mes = Integer.parseInt(teclado.nextLine());
                    res = o.mes(mes);
                    System.out.println(res);
                    case 2:
                    
                    System.out.println("Digite un numero");
                    cuadrado = Integer.parseInt(teclado.nextLine());
                    res2 = o.Mcuadrado(cuadrado);
                    System.out.println(res2);
                      case 3:
                    
                    System.out.println("Ingresar una letra entre a y e ");
                    Letra =teclado.nextLine();
                    
                    res =o.capacidad(Letra) ;
                    System.out.println(res); 
                      case 4:
                    System.out.println("El mes tiene que ser de 1 al 12");
                    System.out.println("Ingresar el mes");             
                    mes =Integer.parseInt(teclado.nextLine());
                    while(mes>=1&&mes<=12){    
                    System.out.println("Ingresar el año");
                    ano =Integer.parseInt(teclado.nextLine());
                    rest=o.dias(mes, ano);
                    System.out.println("Los dias de este mes son:");
                    System.out.println(rest); 
                    break;
                    }
                    if(mes<1||mes>12){
                     System.out.println("El mes es incorrecto");     
                    }
                      case 5:
                    
                    System.out.println("CONVERSION DE ARABIGOS A ROMANOS");
    Random rnd = new Random();
    for (int i = 0; i < 3000; i++) {
            num = (int)(rnd.nextDouble() * 3000.0);
             num=num%3000+1;
        }
    System.out.println("El numero generado es : "+num);
    u=num%10; 
    num=num/10;
    d=num%10;
    num=num/10;
    c=num%10;
    num=num/10;
    m=num%10;
 
    switch(m)
    {
      case 1: System.out.print("M");  break;
      case 2: System.out.print("MM");  break;
      case 3: System.out.print("MMM");  break;
    }
    switch(c)
    {
      case 1: System.out.print("C");  break;
      case 2: System.out.print("CC");  break;
      case 3: System.out.print("CCC");  break;
      case 4: System.out.print("CD");  break;
      case 5: System.out.print("D");  break;
      case 6: System.out.print("DC");  break;
      case 7: System.out.print("DCC");  break;
      case 8: System.out.print("DCCC");  break;
      case 9: System.out.print("CM");  break;
    }
    switch(d)
    {
      case 1: System.out.print("X");  break;
      case 2: System.out.print("XX");  break;
      case 3: System.out.print("XXX");  break;
      case 4: System.out.print("XL");  break;
      case 5: System.out.print("L");  break;
      case 6: System.out.print("LX");  break;
      case 7: System.out.print("LXX");  break;
      case 8: System.out.print("LXXX");  break;
      case 9: System.out.print("XC");  break;
    }
 
    switch(u)
    {
      case 1: System.out.print("I");  break;
      case 2: System.out.print("II");  break;
      case 3: System.out.print("III");  break;
      case 4: System.out.print("IV");  break;
      case 5: System.out.print("V");  break;
      case 6: System.out.print("VI");  break;
      case 7: System.out.print("VII");  break;
      case 8: System.out.print("VIII");  break;
      case 9: System.out.print("IX");  break;
    }
      System.out.println("\n");

           case 6:
                    
                    System.out.print("Ingrese dia : ");
        dia=Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese mes : ");
        m2=Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese año : ");
        a=Integer.parseInt(teclado.nextLine()); 
         res=o.antdia(dia, m2, a);
        System.out.println("La fecha del dia anterior es: "+res); 
         
               
                  case 7:
                    
                      System.out.print("Ingrese el dia :");
                      dia=Integer.parseInt(teclado.nextLine());
                      res=o.fecha(dia);
                      System.out.println(res);
                      
                         case 8:
                    
                             
                      System.out.print("Ingrese el dia 1 fue (L,M,X,J,V,S,D) :");
                      dia1=teclado.nextLine().charAt(0);
                      System.out.print("Ingrese el dia :");
                      dia=Integer.parseInt(teclado.nextLine());
                      rest=o.fecha2(dia1);
                      res=o.fecha(dia);
                      
                      
                      System.out.println(rest);
                      System.out.println(res);
               
               
            }
System.out.print("Desea continuar con otra operacion S/N ");
            cs = teclado.nextLine().charAt(0);
        } while (cs == 's' || cs == 'S');

    }
}
