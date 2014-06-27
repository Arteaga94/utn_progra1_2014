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
public class ClsMetodos {
       private Scanner teclado;
    private String[][] matriz;
    private String mensaje;
       private String[] listaPalabras;

    public ClsMetodos(String[] lista) {
        this.listaPalabras = lista;
    }

   
    
    public void cargar() {
        teclado=new Scanner(System.in);
        matriz=new String[6][6];
        matriz[1][1]="A";
        matriz[1][2]="B";
        matriz[1][3]="C";
        matriz[1][4]="D";
        matriz[1][5]="E";
        matriz[2][1]="F";
        matriz[2][2]="G";
        matriz[2][3]="H";
        matriz[2][4]="I";
        matriz[2][5]="J";
        matriz[3][1]="L";
        matriz[3][2]="M";
        matriz[3][3]="N";
        matriz[3][4]="O";
        matriz[3][5]="P";
        matriz[4][1]="Q";
        matriz[4][2]="R";
        matriz[4][3]="S";
        matriz[4][4]="T";
        matriz[4][5]="U";
        matriz[5][1]="V";
        matriz[5][2]="W";
        matriz[5][3]="X";
        matriz[5][4]="Y";
        matriz[5][5]="Z";
     
    }
    
    public void imprimir() {
       for(int f=1;f<6;f++) {
            for(int c=1;c<6;c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    
    public void sacar(String mensaje) {
        String x;
       for(int f=0;f<mensaje.length();f++) {
           x=mensaje.substring(f, f+1);
           Puntos(x);
       }
    }
    
      public void toUpperCase(String mensaje) {
    String res = "";
    for (int i = 0; i < mensaje.length (); i ++) {
    char aux = mensaje.charAt (i );
    if ('a' <= aux && aux <= 'z')
    res += (char) ( aux + 'A' - 'a');
    else
    res += aux ;
    }
    
     sacar(res);
    }
    public String eliminar(String mensaje, char m) {
        String x="";
       for(int f=0;f<mensaje.length();f++) {
           if(mensaje.charAt(f)==m)
           {
           x=mensaje.substring(0, f)+mensaje.substring(f+1);
           }
       
       }
       return x;
    }
    
    
    public void Puntos(String mensaje)
    {
       
        String puntos=".";
        for(int f=1;f<6;f++) {
            for(int c=1;c<6;c++) {
               if(mensaje.equals(matriz[f][c]))
               {
                   for (int i = 0; i <f ; i++) {
                       System.out.print(puntos);
                   }
                       System.out.print("  ");
                   for (int e = 0; e <c; e++) {
                       System.out.print(puntos);
                   }
               
                    System.out.print("   ");
               }
            
              }
                
        
            }
        
        
    }

  
 public int ContarPalabrasPosibles(String letras)
 {
 // Creamos una variable para ir contando
int contador = 0;
int posible= 0;
String m;
// Recorremos todas las palabras en la lista y para cada una revisamos
// si es posible formarla con las letras recibidas
for (int i = 0; i < listaPalabras.length ; i ++) {
 
      m=listaPalabras[i];
      
for (int j = 0; j < letras.length() ; j ++) {
    if(m.contains(String.valueOf(letras.charAt(j))))
    {
    posible++;
    m=eliminar( m,letras.charAt(j));
    }
 }if(posible==listaPalabras[i].length())
 {
 contador++;
 }
 posible=0;
}   
return contador;
}
 

 
 
}


 
