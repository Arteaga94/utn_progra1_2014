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
public class ClsMetodos {
    
   private Scanner teclado;
    private int[][] matriz;
      private int[] arreglo;
    
    public void cargar(int fi,int co) {
        teclado=new Scanner(System.in);
        matriz=new int[fi][co];
        
        for(int f=0;f<fi;f++) {        
           for(int c=0;c<co;c++) {
               System.out.println("Ingrese el valor");
                matriz[f][c]=teclado.nextInt();
                
            }
           
        }
        
    }
    
     public void imprimir(int fi,int co) {
        for(int f=0;f<fi;f++) {
            for(int c=0;c<co;c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
     
     
     public void PromedioDatos(int fi,int co)
     {
      double pro=0;
      int suma=0;
      for(int f=0;f<fi;f++) {        
           for(int c=0;c<co;c++) {
     suma=suma+matriz[f][c]; 
     }
     }pro=fi*co;
      System.out.println("El promedio de los valors de la matriz son:  "+suma/pro);
}
     
     
     public void Porcentajeimp(int fi,int co)
     {
      double pro=0;
      int cont=0;
      for(int f=0;f<fi;f++) {        
           for(int c=0;c<co;c++) {
               if((matriz[f][c]%2)!=0){
               cont++; 
                       } }
           pro=(100*cont)/co;
           cont=0;
           System.out.println("Porcentaje de impares de la fila "+f+" es: "+pro);
           
     }
}
     public void ordenarporfila(int fi,int co)
     {
         
      arreglo= new int[co];
      for(int f=0;f<fi;f++) {        
           for(int c=0;c<co;c++) {
       arreglo[c]=matriz[f][c];
     
     }
           intercambio(arreglo);
     }
                   
             
     }
     
     
     public static void intercambio(int lista[]){
 
        //Usamos un bucle anidado
        for(int i=0;i<(lista.length-1);i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i]>lista[j]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;
 
                }
            }
        }
      
            for(int c=0;c<lista.length;c++) {
                System.out.print(lista[c]+" ");
            }  
                System.out.println();
        
    }
        public void Impares(int fi,int co)
     {
      arreglo= new int[fi*co];
      double pro=0;
      int suma=0;
      int cont=0;
      for(int f=0;f<fi;f++) {        
           for(int c=0;c<co;c++) {
      suma=matriz[f][c];
     if((suma%2)!=0)
     {
         
       arreglo[cont]=matriz[f][c]; 
       cont++;
     }
     }
     }
      suma=0;
         for (int i = 0; i < arreglo.length-1; i++) {
             if(suma<arreglo[i] && arreglo[i]>arreglo[i+1])
             {
             suma=arreglo[i];
             }
             else
             {
                 if(suma<arreglo[i+1]){
                suma=arreglo[i+1];
                 }
             }
         }
      System.out.println("El mayor de los impares es: "+ suma);

     
  
             
}
     
      public void PromedioPares(int fi,int co)
     {
      double pro=0;
      int suma=0;
      for(int f=0;f<fi;f++) {        
           for(int c=0;c<co;c++) {
     suma=suma+matriz[f][c]; 
     }
     }pro=fi*co;
     if(((suma/pro)%2)==0)
     {
      System.out.println("El promedio de los valores de la matriz son:  "+suma/pro);
     }
     else{
     System.out.println("El promedio de los valores de la matriz son impares");
     }
             
}
     
     
     
}
