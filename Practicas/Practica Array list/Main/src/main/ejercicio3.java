/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;



/**
 *
 * @author Dinier
 */
public class ejercicio3 {
    
    private int[] cursoa;
    private int[] cursob;
  
    public void cargar(int vecsa,int vecss) {
       
        cursoa=new int[5];
        cursob=new int[5];
    
        for(int f=0;f<5;f++) {
            
            cursoa[f]=vecss;
        }
  
        for(int f=0;f<5;f++) {
           
            cursob[f]=vecsa;
            
            
        } 
    }
        
        
     public String calcularPromedios() {
        int suma1=0;
        int suma2=0;
        String e;
        for(int f=0;f<5;f++) {
            suma1=suma1+cursoa[f];
            suma2=suma2+cursob[f];            
        }
        int promedioa=suma1/5;
        int promediob=suma2/5;
        if (promedioa>promediob) {
          e= "El curso A tiene un promedio mayor.";
          
        }
        
        else 
        {
            e="El curso B tiene un promedio mayor.";
        }
        return e;
        
    }
    
}
