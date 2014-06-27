/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;


import java.util.Scanner;

/**
 *
 * @author Dinier
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String mensaje="";
   int opcion;
      String[] lista = {"auto", "pato", "palo", "poto", "amar", "amor",
"loca", "loco", "polo", "poco", "poca", "rota", "roto"};
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Dijite el ejercicio que desea hacer:  ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                
                ClsMetodos o = new ClsMetodos(lista);
                System.out.println("Digite el mensaje por cifrar");
                mensaje=teclado2.nextLine();
                o.cargar();
                o.imprimir();
                o.toUpperCase(mensaje);
                System.out.println();
                
                break;
                
            case 2:

String[] letras = {"escalopa", "automotor", "percatado"};
  ClsMetodos admin = new ClsMetodos(lista);

for(int i = 0; i < letras . length ; i ++) {
int cont = admin.ContarPalabrasPosibles(letras[i]);
    System.out.println(letras [i] + ": " + cont );
    
}
    }
    
}
}
