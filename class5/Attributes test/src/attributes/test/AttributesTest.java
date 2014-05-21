/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes.test;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class AttributesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean validar = true;
        int opcion;
        char continuar;
        double monto;
        
        Account oAccount = new Account();
        Scanner teclado = new Scanner(System.in);
        
        while (validar) {
            System.out.print("Digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
            opcion = Integer.parseInt(teclado.nextLine());
            if (opcion == 1) {
                System.out.print("digite el monto a depositar");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Deposito(monto);
                
                
            }
            if(opcion==2){
            System.out.print("digite el monto a Retirar");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Deposito(monto);
                
                if (oAccount.isHayError()) {
                    System.out.print("El monto que usted va a retirar no puede ser retirado");                    
                }
            }
            
            System.out.print("El saldo final es "+oAccount.getSaldoInicial());
            System.out.print("Desea continuar con otra transaccion S/N ");
            continuar=teclado.nextLine().charAt(0);
            if((continuar=='S')||(continuar=='s'))
            {
                validar=true;
            }
            if((continuar=='N')||(continuar=='n'))
            {
                validar=false;
            }
           
            
        }
        
        
        
    }
}
