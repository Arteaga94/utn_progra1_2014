/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoJugador;


/**
 *
 * @author Dinier
 */
public class ListaJugador {
    
   private NodoJugador listaJugadores;
   
   //Busca el Jugador mas joven de Equipo(X)
   public String jugadorJoven(ListaJugador EqJ  )
   {NodoJugador prueba= EqJ.listaJugadores;
       String resultado="";
       String nombre=prueba.getNombre();
       int edad=prueba.getEdad();
       
       while(prueba != null)
       {
           if(prueba.getEdad() < edad) {
               edad=prueba.getEdad();
               nombre =prueba.getNombre();
           }
           prueba = prueba.getSiguienteJugador();
       }
       resultado= nombre+" " + edad;
       
       return resultado;
   }
   
   
   //Busca el Jugador mas Viejo de Equipo(X)
   public String jugadorViejo(ListaJugador EqJ  )
   {NodoJugador prueba= EqJ.listaJugadores;
       String resultado="";
       String nombre=prueba.getNombre();
       int edad=prueba.getEdad();
       
       while(prueba != null)
       {
           if(prueba.getEdad() > edad) {
               edad=prueba.getEdad();
               nombre =prueba.getNombre();
           }
           prueba = prueba.getSiguienteJugador();
       }
       resultado= nombre+" " + edad;
       
       return resultado;
   }  
   
   //Inserta los Jugadores Con los distintos atributos(nombre,edad,goles) Ordenados por goleo 
    public void Insertar(String nombre, int x,int goles)
    {
        NodoJugador nuevo;
        nuevo = new NodoJugador();
        nuevo.setNombre(nombre);
        nuevo.setEdad(x);
        nuevo.setGoles(goles);
        NodoJugador auxiliar = getListaJugadores();
        
        if (getListaJugadores()==null) {
            auxiliar=nuevo;
            setListaJugadores(auxiliar);
        } else {
            if (x<auxiliar.getEdad()) {
                nuevo.setSiguienteJugador(auxiliar);
                auxiliar=nuevo;
                setListaJugadores(auxiliar);
            } else {
                NodoJugador reco=auxiliar;
                NodoJugador atras=auxiliar;
                while (x>=reco.getEdad() && reco.getSiguienteJugador()!=null) {
                    atras=reco;
                    reco=reco.getSiguienteJugador();
                }
                if (x>=reco.getEdad()) {
                    reco.setSiguienteJugador(nuevo);
                } else {
                    nuevo.setSiguienteJugador(reco);
                    atras.setSiguienteJugador(nuevo);
                }
            }
        }
    }
    
    //imprime los Jugadores
    public void Imprimir() {
        NodoJugador recorridoJugador = getListaJugadores();

        System.out.println("Listado de todos los Jugadores de la lista");
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getNombre() + " " + recorridoJugador.getEdad()+" "+recorridoJugador.getGoles());
            recorridoJugador = recorridoJugador.getSiguienteJugador();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        return getListaJugadores() == null;
    }

    //Elimina los Jugadores de un Equipo(X)   
    public void EliminarJugador(String nombre) {
        NodoJugador siguienteJugador = listaJugadores;
        NodoJugador anterior = siguienteJugador;

        if (siguienteJugador == null) {
            System.out.println("Lista de jugadores vacia");
            return;
        }
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre()))
               
            {
                if (siguienteJugador == listaJugadores) 
                {
                    listaJugadores = siguienteJugador.getSiguienteJugador();
                    return;
                }
                anterior.setSiguienteJugador(siguienteJugador.getSiguienteJugador());
                return;
            }
            anterior = siguienteJugador;
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }
    
    //Busca a un jugador de la lista de jugadores
    public NodoJugador BuscarJugador(String nombre)
    {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                return siguienteJugador;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
        return null;
    }
    
    //Modifica a un jugador de la lista de jugadores
    public void ModificarJugador(String nombre,String nuevoNombre,int edad)
    {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) 
        {
            if (nombre.equals(siguienteJugador.getNombre())) 
            {
                siguienteJugador.setNombre(nuevoNombre);
                siguienteJugador.setEdad(edad);
                return;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }

    
    /**
     * @return the listaJugadores
     */
    public NodoJugador getListaJugadores() {
        return listaJugadores;
    }

    /**
     * @param listaJugadores the listaJugadores to set
     */
    private void setListaJugadores(NodoJugador listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    
}
