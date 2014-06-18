/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliados.vs.enemigos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dinier
 */
public class ClsMetodos {
    
    private int cant;
   private Scanner teclado;
    private char[][] matriz;
     private char[][] matriz2;
    private String re;
    private int p1;
    private int p2;
    private int e1;
    private int e2;
    private int a1;
    private int a2;
    private char jug='a';
    private char jug2='a';
    public void cargar(int cant,int largo,int ancho) {
        
        Random random = new Random();
        

        matriz = new char[largo][ancho];
       
                for (int i = cant; i >0; i--) {
                    
                    int x=random.nextInt(largo);
                    int y=random.nextInt(ancho);
                    int p=0;
                    while(p==0){
                        if(matriz[x][y]==0){
                        matriz[x][y] = jug;
                        p++;
                        }
                        else{
                        x=random.nextInt(largo);
                        y=random.nextInt(ancho);
                        }
                    }
                }
         //NAVEGA POR FILAS
        for (int f = 0; f < matriz.length; f++) {
            //NAVEGA POR COLUMNAS
            for (int c = 0; c < matriz[f].length; c++) {
                    System.out.println("[" + f + "][" + c + "]=" + matriz[f][c]);
            }
        }
        System.out.println();
        
        

        matriz2 = new char[largo][ancho];
       
                for (int i = cant; i >0; i--) {
                    
                    int x=random.nextInt(largo);
                    int y=random.nextInt(ancho);
                    int p=0;
                    while(p==0){
                        if(matriz2[x][y]==0){
                        matriz2[x][y] = jug2;
                        p++;
                        }
                        else{
                        x=random.nextInt(largo);
                        y=random.nextInt(ancho);
                        }
                    }
                }
         //NAVEGA POR FILAS
        for (int f = 0; f < matriz2.length; f++) {
            //NAVEGA POR COLUMNAS
            for (int c = 0; c < matriz2[f].length; c++) {
                    System.out.println("[" + f + "][" + c + "]=" + matriz2[f][c]);
            }
        }
        System.out.println();
        
        
        
    }
    
  public void AcertarBlancoAliado()
  {
      System.out.println("Digite la posicion en la que desea atacar");
    p1=Integer.parseInt(teclado.nextLine());
     p2=Integer.parseInt(teclado.nextLine());
      if(matriz[p1][p2]!=0) {
          System.out.println("Ataque acertado");
      matriz[p1][p2]=0;
        for (int f = 0; f < matriz.length; f++) {
            //NAVEGA POR COLUMNAS
            for (int c = 0; c < matriz[f].length; c++) {
                    System.out.println("[" + f + "][" + c + "]=" + matriz[f][c]);
            }
        }
      }
     
  }
 
 public void EscogerCeldaAliado()
 {
 System.out.println("Digite la posicion en la que desea atacar");
    a1=Integer.parseInt(teclado.nextLine());
     a2=Integer.parseInt(teclado.nextLine());
 }
 public void EscogerCeldaEnemigo()
 {
 System.out.println("Digite la posicion en la que desea atacar");
    e1=Integer.parseInt(teclado.nextLine());
     e2=Integer.parseInt(teclado.nextLine());
 }
 
 public void EscogerJugadorAliado()
 {
   jug = 'A';
   jug2='E';
         
 }
public void EscogerJugadorEnemigo()
 {
 jug='E';
 jug2='A';
 } 
    
}
