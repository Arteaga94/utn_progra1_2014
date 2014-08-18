/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoCalendario;
import java.util.Scanner;
import sun.misc.Cache;


/**
 *
 * @author Dinier
 */
public class ListaCalendario {
    
 private NodoCalendario listaCalendario;

 
 
 public String sacarNombre(String aux,String aux2){
        String N1="";
         for(int p=0; p< aux.length() ; p++){
         if(aux.charAt(p)!=' '){
             N1=N1+aux.charAt(p);
         }else{
             aux=aux.substring(p+4);
             p=aux.length();
         }
         }
         return N1;
 }
 
 
 public  int rc(String nombre,String nombre2,int cont)
 {
     NodoCalendario prueba = listaCalendario;
     
    
    
     for (int i = 0; i < 32; i++) {
         
         String N1 ="";
         String N2 ="";
        
         if(!"".equals(prueba.getFecha()) ){
         N1=sacarNombre(prueba.getFecha(), "");
         N2=sacarNombre(prueba.getFecha().substring(N1.length()+4), "");
   
         if(nombre.equals(N1) && nombre2.equals(N2))
         {
         System.out.println(prueba.getFecha()+"fecha1");
         cont=1;
         }
         }
         
         if(!"".equals(prueba.getFecha2())){
         N1=sacarNombre(prueba.getFecha2(), "");
         N2=sacarNombre(prueba.getFecha2().substring(N1.length()+4), "");
   
         
         if(nombre.equals(N1) && nombre2.equals(N2))
         {
         System.out.println(prueba.getFecha2()+"fecha2");
         cont=1;
         }
         }
         
         if(!"".equals(prueba.getFecha3())){
         N1=sacarNombre(prueba.getFecha3(), "");
         N2=sacarNombre(prueba.getFecha3().substring(N1.length()+4), "");
   
         if(nombre.equals(N1) && nombre2.equals(N2))
         {
         System.out.println(prueba.getFecha3()+"fecha3");
         cont=1;
         }
         }
         
          if(!"".equals(prueba.getFecha4())){
         N1=sacarNombre(prueba.getFecha4(), "");
         N2=sacarNombre(prueba.getFecha4().substring(N1.length()+4), "");
   
         if(nombre.equals(N1) && nombre2.equals(N2))
         {
         System.out.println(prueba.getFecha4()+"fecha4");
         cont=1;
         }
          }
         //prueba=prueba.getSiguienteFecha();
          break;
         
     }
 
     return cont;
     
 }
 
    public void Insertar(String fecha,String fecha2,String fecha3,String fecha4) {
        NodoCalendario nuevo;
        nuevo = new NodoCalendario();
        nuevo.setFecha(fecha);
        nuevo.setFecha2(fecha2);
        nuevo.setFecha3(fecha3);
        nuevo.setFecha4(fecha4);
       

        if (getListaCalendario() == null) {
            nuevo.setSiguienteFecha(null);
            setListaCalendario(nuevo);
        } else {
            NodoCalendario auxiliar = getListaCalendario();
            while (auxiliar.getSiguienteFecha() != null) {
                auxiliar = auxiliar.getSiguienteFecha();
            }
            auxiliar.setSiguienteFecha(nuevo);
        }
    }
    
     public void InsertarClima(String clima,String Fecha_hora) {
        NodoCalendario nuevo;
        nuevo = new NodoCalendario();
        nuevo.setClima(clima);
        nuevo.setFecha_hora(Fecha_hora);
        
            nuevo.setSiguienteClima(null);
            setListaCalendario(nuevo);
       
    }
     
      public void ImprimirClima() {
        NodoCalendario recorridoJugador = getListaCalendario();
        
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getClima()+recorridoJugador.getFecha_hora());
            recorridoJugador = recorridoJugador.getSiguienteClima();
        }

    }
    

    public void Imprimir() {
        NodoCalendario recorridoJugador = getListaCalendario();

        System.out.println("Calendario de los partidos.");
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getFecha()+"\n"+recorridoJugador.getFecha2()
                    +"\n"+recorridoJugador.getFecha3()+"\n"+
                    recorridoJugador.getFecha4());
            recorridoJugador = recorridoJugador.getSiguienteFecha();
            
        }

    }

    public boolean EstaVacia() {
        return getListaCalendario() == null;
    }

    /**
     * @return the listaCalendario
     */
    public NodoCalendario getListaCalendario() {
        return listaCalendario;
    }

    /**
     * @param listaCalendario the listaCalendario to set
     */
    public void setListaCalendario(NodoCalendario listaCalendario) {
        this.listaCalendario = listaCalendario;
    }    
    
}
