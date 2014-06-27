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
        Scanner teclado = new Scanner(System.in);
        ClsMetodos o = new ClsMetodos();
        System.out.println("Digite el nombre del Jugador 1");
        j1 = teclado.nextLine();
        System.out.println("Digite el nombre del Jugador 2");
        j2 = teclado.nextLine();
        o.jugar();

    }
}
