
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz2;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fi;
        int co;
        int opcion;
        Scanner teclado = new Scanner(System.in);
        ClsMetodos o = new ClsMetodos();
        System.out.print("Ingrese cuantas filas quiere:");
        fi = teclado.nextInt();
        System.out.print("Ingrese cuantas columnas quiere:");
        co = teclado.nextInt();
        o.cargar(fi,co); 
        o.imprimir(fi,co);

        System.out.println("Dijite el ejercicio que desea hacer:  ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                o.PromedioDatos(fi, co);
                break;
                case 2:
                o.PromedioPares(fi, co);
                o.Impares(fi, co);
                o.Porcentajeimp(fi, co);
                o.ordenarporfila(fi, co);
                break;
        }
    }
}
