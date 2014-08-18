/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;



import Nodos.NodoEquipo;
import Nodos.NodoEstadio;


/**
 *
 * @author Dinier
 */
public class ListaEstadio {
    private NodoEstadio listaEstadios;
    
/*    public void Insertar(String nombre,NodoEstadio Estadios)
    {
        NodoEstadio nuevo;
        nuevo=new NodoEstadio();
        nuevo.setNombre(nombre);
        nuevo.setSiguienteEstadio(Estadios.getSiguienteEstadio());
        if(listaEstadios==null)
        {
            nuevo.setSiguienteEstadio(null);
            listaEstadios=nuevo;
        }
        else
        {
            NodoEstadio auxiliar=listaEstadios;
            while (auxiliar.getSiguienteEstadio()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEstadio();             
            }
            auxiliar.setSiguienteEstadio(nuevo);
        }        
    }*/
    
    //METODO PARA INSERTAR LOS ESTADIOS CON SUS RESPECTIVOS ATRIBUTOS
 public void InsertarEs(String nombre,String Cuidad,int personas,int PartidosJ )
    {
        NodoEstadio nuevo;
        nuevo=new NodoEstadio();
        nuevo.setNombre(nombre);
        nuevo.setCuidad(Cuidad);
        nuevo.setCantidadPersonas(personas);
        nuevo.setPartidosJugados(PartidosJ);
        if(listaEstadios==null)
        {
            nuevo.setSiguienteEstadio(null);
            listaEstadios=nuevo;
            
        }
        else
        {
            NodoEstadio auxiliar=listaEstadios;
            while (auxiliar.getSiguienteEstadio()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEstadio();             
            }
            auxiliar.setSiguienteEstadio(nuevo);
        }        
    }
    
    
  //METODO PARA IMPRIMIR LOS ESTADIOS CUN SUS RESPECTIVOS ATRIBUTOS  
    public void Imprimir()
    {
        NodoEstadio recorridoEstadios=listaEstadios;
        
       System.out.println("Listado de todos los elementos de la lista");
        while(recorridoEstadios!=null)
        {
                System.out.println( "El nombre del estadio es: " +recorridoEstadios.getNombre()
                        + "\n " + "La Cuidad del estadio es: " +recorridoEstadios.getCuidad() 
                        + "\n"+ " La capacidad de expectadores es de: "  +recorridoEstadios.getCantidadPersonas()
                        + "\n"+"La cantidad de partidos jugados es de:" + recorridoEstadios.getPartidosJugados());   
            
            recorridoEstadios=recorridoEstadios.getSiguienteEstadio();
        }
    }
    
   //METODO PARA INPRIMIR LOS CLIMAS DE CADA RESPECTIVO ESTADIO 
   public void ImprimirCl()
    {
        NodoEstadio recorridoEstadios=listaEstadios;
        
       System.out.println("Listado de todos los elementos de la lista");
        while(recorridoEstadios!=null)
        {
                System.out.println( "El nombre del estadio es: " +recorridoEstadios.getNombre()
                        + "\n " + "El clima es: " +recorridoEstadios.getClima() 
                        +"\n"+recorridoEstadios.getEquipos().getNombre()
                        +"\n"+recorridoEstadios.getEquipos().getJugadores().getNombre());   
            
            recorridoEstadios=recorridoEstadios.getSiguienteEstadio();
        }
    }
   
     public void ModificarEstadio(String nuevoNombre, String Cuidad, int CantidadP, int PartidosJ)
    {
        NodoEstadio siguienteEstadio = listaEstadios;
        
                siguienteEstadio.setNombre(nuevoNombre);
                siguienteEstadio.setCuidad(Cuidad);
                siguienteEstadio.setCantidadPersonas(CantidadP);
                siguienteEstadio.setPartidosJugados(PartidosJ);
              
    }
    
    public boolean EstaVacia()
    {
        return listaEstadios==null;
    }

    /**
     * @return the listaEstadios
     */
    public NodoEstadio getListaEstadios() {
        return listaEstadios;
    }

    /**
     * @param listaEstadios the listaEstadios to set
     */
    public void setListaEstadios(NodoEstadio listaEstadios) {
        this.listaEstadios = listaEstadios;
    }
}
    

