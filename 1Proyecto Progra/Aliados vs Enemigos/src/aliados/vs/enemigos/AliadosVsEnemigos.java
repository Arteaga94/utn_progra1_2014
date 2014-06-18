/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliados.vs.enemigos;

import java.util.Scanner;

/**
 *
 * @author Dinier
 */
public class AliadosVsEnemigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String j1;
        String j2;
        int opcion;
         char c = 's';
        char ali = 'a'; 
        char ene = 'e';
        int cant;
        int largo, ancho;
        ClsMetodos o = new ClsMetodos();
        Scanner teclado = new Scanner(System.in); 
        
            System.out.println("Digite el nombre del Jugador 1");
            j1=teclado.nextLine();
            System.out.println("Digite el nombre del Jugador 2");
            j2=teclado.nextLine(); 
        do {
            
        do {
         
            
            System.out.println("Digite que jugador quiere ser" + "\n" + "1.Aliados" + "\n" + "2.Enemigos");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:

                   o.EscogerJugadorAliado();
                    break;
                case 2:

                   o.EscogerJugadorEnemigo();
                    
                    break;
            
            }
            
            System.out.println("Digite la cantidad de elementos a participar dentro la de la partida ");
            cant = Integer.parseInt(teclado.nextLine());

                System.out.println("Digite la profundidad del área de juego (Largo y ancho)");
                System.out.print("Largo: ");
                largo = Integer.parseInt(teclado.nextLine());
                System.out.print("Ancho: ");
                ancho = Integer.parseInt(teclado.nextLine());

           o.cargar(cant,largo, ancho);
         
         
           
           break;
            

        } while (opcion == 1 || opcion == 2);
            System.out.println("IniciarNuevaPartida S/N");
        c=teclado.nextLine().charAt(0);
       } while (c == 's' || c == 'S');
        
    }
}
