/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 0, valor2 = 0;
        double resultado;
        char continuar;
        boolean validar = true;
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);
        operaciones o = new operaciones();



        do {

            System.out.print("Digite la operacion a evaluar" + "\n");
            System.out.print("1:Suma" + "\n");
            System.out.print("2:Resta" + "\n");
            System.out.print("3:Multiplicacion" + "\n");
            System.out.print("4:Division" + "\n");
            System.out.print("5:Raiz" + "\n");
            System.out.print("6:Potencia" + "\n");

            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {

                case 1:
                    System.out.println("Digite el valor del primer numero");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo numero");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = o.sumar(valor1, valor2);
                    System.out.println("El resultado es :");
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("Digite el valor del primer numero");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo numero");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = o.resta(valor1, valor2);
                    System.out.println("El resultado es :");
                    System.out.println(resultado);
                    break;
                case 3:
                    System.out.println("Digite el valor del primer numero");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo numero");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = o.multiplicacion(valor1, valor2);
                    System.out.println("El resultado es :");
                    System.out.println(resultado);
                    break;
                case 4:
                    System.out.println("Digite el valor del primer numero");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo numero");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = o.division(valor1, valor2);
                    System.out.println("El resultado es :");
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.println("Digite el valor del primer numero");
                    valor1 = Integer.parseInt(teclado.nextLine());                    
                    resultado = o.raiz(valor1);
                    System.out.println("El resultado es :");
                    System.out.println(resultado);
                    break;
                case 6:
                    System.out.println("Digite el valor del primer numero");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo numero");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = o.potencia(valor1, valor2);
                    System.out.println("El resultado es :");
                    System.out.println(resultado);
                    break;

                default:
                    break;

            }

            System.out.print("Desea continuar con otra operacion S/N ");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            }
            else
            //if ((continuar == 'N') || (continuar == 'n')) {
            {  validar = false;

            }


        } while (validar);







    }
}
