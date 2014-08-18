/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Estudiante
 */
public class ejercicio1 {
   private  int cant=1;
      private  int cant2=0;
    
    private int vecs1[]=new int[8];
    
    public void cargar(int vecs) {       
        for(int f=0;f<vecs1.length;f++) {
          
            if(vecs1[f]==0)
            {
                vecs1[f]= vecs;
                break;
            }
        }
    }
    
    public int acumularElementos() {
        int suma=0;
        for(int f=0;f<8;f++) {
            suma=suma+vecs1[f];
           // suma+=vecs[f];
        }
        return suma;
     
    } 
    
    public int acumularMayores36() {
        int suma=0;
        for(int f=0;f<8;f++) {
            if (vecs1[f]>36) {
                suma=suma+vecs1[f];
            }
        }
        return suma;
    }
    
    public int cantidadMayores50() {
        int cant=0;
        for(int f=0;f<8;f++) {
            if (vecs1[f]>50) {
                cant++; 
            }     
        }
        return cant;
}  
}   

