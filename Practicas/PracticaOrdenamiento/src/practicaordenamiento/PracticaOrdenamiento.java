/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaordenamiento;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class PracticaOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       
int n_puntos , i , j , p1 = 0, p2 = 0;
double dist_max = 0;
Scanner teclado = new Scanner(System.in);

clsPuntos [] puntos ;
System.out.print("Cuantos puntos usara para el ejercicio? ");
n_puntos = teclado.nextInt();
puntos = new clsPuntos [ n_puntos ];
for (i = 0; i < n_puntos ; i ++) {
puntos [i] = new clsPuntos ();
}
for (i = 0; i < ( n_puntos - 1); i ++) {
for (j = i + 1; j < n_puntos ; j ++) {
if ( puntos [i ]. distancia ( puntos [j ]) > dist_max ) {
dist_max = puntos [i ]. distancia ( puntos [ j ]);
p1 = i;
p2 = j;
}
}
}
System.out.print("La mayor distancia en el conjunto de puntos es "
+ dist_max + " e involucra al punto " + p1 + ": ("
+ puntos [ p1 ]. getX () + "," + puntos [ p1 ]. getY () + ") y al punto "
+ p2 + ": (" + puntos [ p2 ]. getX () + "," + puntos [ p2 ]. getY ()
+ ")");

    }
}
