/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class17;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Class17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x;
        Scanner teclado = new Scanner(System.in); 
        Lista o = new Lista();
        o.Insertar("Efren");
        o.Insertar("Jose");
        o.Insertar("Navas");
        
        o.Insertar("Efren2");
        o.Insertar("Jose2");
        o.Insertar("Navas2");
        
        o.imprimir();
        System.out.println("Digite el nombre al que quiere eliminar");
        x=teclado.nextLine();
        o.cualquiera(x);
        o.imprimir();
        o.EliminarInicio();
        o.imprimir();
        o.EliminarUltimo();
        o.imprimir();    
        
    }
}
