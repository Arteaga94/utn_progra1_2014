/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica4;

import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a,b,c,d,q,w,e,r;
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Digite un valor para la letra a:");
        a=Integer.parseInt(teclado.nextLine());
        q=a;
        
        System.out.print("Digite un valor para la letra b:");
        b=Integer.parseInt(teclado.nextLine());
        w=b;
        
        System.out.print("Digite un valor para la letra c:");
        c=Integer.parseInt(teclado.nextLine());
        e=c;
        
        System.out.print("Digite un valor para la letra d:");
        d=Integer.parseInt(teclado.nextLine());
        r=d;
        
        System.out.print("B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B."+"\n");
        System.out.print("b="+(b=e)+"|  c="+(c=q)+"|  a="+(a=r)+"|  d="+(d=w)+"\n");
       
        
        
        
    }
    
}
