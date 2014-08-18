/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] sueldos= new double[5];
        int cantidadTrabajadores=1;
        double sueldo=0;
        
        Scanner teclado=new Scanner(System.in);
       
        do {
            
            
            System.out.println("Digite el sueldo del trabajador #"+ cantidadTrabajadores );
            sueldo=teclado.nextDouble();
            sueldos[cantidadTrabajadores-1]=sueldo;
            cantidadTrabajadores++;
            
        }while(cantidadTrabajadores<6);
        
        for(int i =0;i< sueldos.length;i++){
        
        System.out.println("El sueldo del trabajador#" + (i+1) + "es de " + sueldos[i]);
        System.out.println();
        }
        
        
        
        
        
        
    }
}
