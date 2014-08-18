/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;
import Nodos.NodoGrupo;
import Listas.ListaEquipo;


/**
 *
 * @author Dinier
 */
public class ListaGrupo {
    
     private NodoGrupo listaGrupo;
     
     
    //METODO PARA INSERTAR UN GRUPO CON  LOS EQUIPOS CORRESPONDIENTES.
    public void InsertarGR(String nombre,NodoEquipo eq1,NodoEquipo eq2,NodoEquipo eq3,NodoEquipo eq4) {
         NodoGrupo nuevo;
        nuevo = new NodoGrupo();
        nuevo.setNombre(nombre);
     
        nuevo.setEq1(eq1);
        nuevo.setEq2(eq2);
        nuevo.setEq3(eq3);
        nuevo.setEq4(eq4);
        
        if (getListaGrupo() == null) {
            nuevo.setSiguienteGrupo(null);
            setListaGrupo(nuevo);
        } else {
            NodoGrupo auxiliar = getListaGrupo();
            while (auxiliar.getSiguienteGrupo() != null) {
                auxiliar = auxiliar.getSiguienteGrupo();
            }
            auxiliar.setSiguienteGrupo(nuevo);
        }
    }
  
    //METODO PARA IMPRIMIR LA TABLA DE CADA  GRUPO RESPECTIVAMENTE
 public  void TablaGrupo(String nombre)
 {
     NodoGrupo prueba = listaGrupo;
     do{
         if(prueba.getNombre().contains(nombre))
         {                                                                                                                            
             System.out.println("            GRUPO  "+prueba.getNombre());
                System.out.println(" PJ   PG   PE   PP  GA   GE   +/-  Pts  EQUIPOS");        
                System.out.println(" "+prueba.getEq1().getPJ()+"    "+prueba.getEq1().getPG()+"    "+prueba.getEq1().getPE()+"    "+prueba.getEq1().getPP()+"    "+prueba.getEq1().getGA()+"    "+prueba.getEq1().getGE()+"   "+prueba.getEq1().getGDif()+"    "+prueba.getEq1().getPuntos()+"    "+prueba.getEq1().getNombre());
                System.out.println(" "+prueba.getEq2().getPJ()+"    "+prueba.getEq2().getPG()+"    "+prueba.getEq2().getPE()+"    "+prueba.getEq2().getPP()+"    "+prueba.getEq2().getGA()+"    "+prueba.getEq2().getGE()+"   "+prueba.getEq2().getGDif()+"    "+prueba.getEq2().getPuntos()+"    "+prueba.getEq2().getNombre());
                System.out.println(" "+prueba.getEq3().getPJ()+"    "+prueba.getEq3().getPG()+"    "+prueba.getEq3().getPE()+"    "+prueba.getEq3().getPP()+"    "+prueba.getEq3().getGA()+"    "+prueba.getEq3().getGE()+"   "+prueba.getEq3().getGDif()+"    "+prueba.getEq3().getPuntos()+"    "+prueba.getEq3().getNombre());
                System.out.println(" "+prueba.getEq4().getPJ()+"    "+prueba.getEq4().getPG()+"    "+prueba.getEq4().getPE()+"    "+prueba.getEq4().getPP()+"    "+prueba.getEq4().getGA()+"    "+prueba.getEq4().getGE()+"   "+prueba.getEq4().getGDif()+"    "+prueba.getEq4().getPuntos()+"    "+prueba.getEq4().getNombre());
          break;
         }else
         {
         prueba=prueba.getSiguienteGrupo();
         }
     }while (prueba!=null);
 }
    
    
    
//METODO PARA IMPRIMIR LOS EQUIPO DE CADA GRUPO.
     public void Imprimir()
    {
         NodoGrupo recorridoGrupo=getListaGrupo();
        
        System.out.println("Listado de todos los elementos de la lista");
        while(recorridoGrupo!=null)
        {
            System.out.println(recorridoGrupo.getNombre());
            
            System.out.println(recorridoGrupo.getEq1().getNombre());
            
            NodoJugador recorridoJugador=recorridoGrupo.getEq1().getJugadores();
            while(recorridoJugador!=null)
            {
                System.out.println(recorridoJugador.getNombre() + " " +recorridoJugador.getEdad());
                recorridoJugador=recorridoJugador.getSiguienteJugador();
            }
            
            System.out.println(recorridoGrupo.getEq2().getNombre());
            
            recorridoJugador=recorridoGrupo.getEq2().getJugadores();
            while(recorridoJugador!=null)
            {
                System.out.println(recorridoJugador.getNombre() + " " +recorridoJugador.getEdad());
                recorridoJugador=recorridoJugador.getSiguienteJugador();
            }
            
            System.out.println(recorridoGrupo.getEq3().getNombre());
            
            recorridoJugador=recorridoGrupo.getEq3().getJugadores();
            while(recorridoJugador!=null)
            {
                System.out.println(recorridoJugador.getNombre() + " " +recorridoJugador.getEdad());
                recorridoJugador=recorridoJugador.getSiguienteJugador();
            }
            
            System.out.println(recorridoGrupo.getEq4().getNombre());
            
            recorridoJugador=recorridoGrupo.getEq4().getJugadores();
            while(recorridoJugador!=null)
            {
                System.out.println(recorridoJugador.getNombre() + " " +recorridoJugador.getEdad());
                recorridoJugador=recorridoJugador.getSiguienteJugador();
            }
            
            recorridoGrupo=recorridoGrupo.getSiguienteGrupo();
        }
        System.out.println();
    }
    
    
  //METODO PARA IMPRIMIR GRUPO(X) CN SUS RESPECTIVOS EQUIPOS     
   public  void ImpGrupo_X(String nombre)
 {
     NodoGrupo prueba = listaGrupo;
     while (prueba!=null) {
         if(prueba.getNombre().contains(nombre))
         {
            System.out.println("GRUPO:"+prueba.getNombre());
            System.out.println(prueba.getEq1().getNombre());
            System.out.println(prueba.getEq2().getNombre());
            System.out.println(prueba.getEq3().getNombre());
            System.out.println(prueba.getEq4().getNombre());
            break;
         }else
         {
         prueba=prueba.getSiguienteGrupo();
         }
     }
 }
     

    public boolean EstaVacia() {
        return getListaGrupo() == null;
    }

    /**
     * @return the listaGrupos
     */
    public NodoGrupo getListaGrupo() {
        return listaGrupo;
    }

    /**
     * @param listaGrupos the listaGrupos to set
     */
    public void setListaGrupo(NodoGrupo listaGrupo) {
        this.listaGrupo = listaGrupo;
    }
}
