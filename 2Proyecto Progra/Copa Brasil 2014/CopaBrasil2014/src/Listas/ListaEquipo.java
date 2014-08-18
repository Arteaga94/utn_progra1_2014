/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;



import Nodos.NodoEquipo;
import Nodos.NodoJugador;



/**
 *
 * @author Dinier
 */
public class ListaEquipo {
    
     private NodoEquipo listaEquipo;
     
   private String goleador1 = "";
   private String goleador2 = "";   
   private String goleador3 = "";
   private String goleador4 = "";   
   private String goleador5 = "";
   private int goles1=0;
   private int goles2=0;
   private int goles3=0;
   private int goles4=0;
   private int goles5=0;
     
   //METODO PARA INSERTAR LOS EQUIPOS CON SUS RESPECTIVOS ATRIBUTOS  
 public void InsertarE(String nombre,ListaJugador jugadores,int PJ,int PG,int PE,int PP,int GA,int GE,int GDif ,int puntos)
    {
        NodoEquipo nuevo;
        nuevo=new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        nuevo.setPJ(PJ);
        nuevo.setPG(PG);
        nuevo.setPE(PE);
        nuevo.setPP(PP);
        nuevo.setGA(GA);
        nuevo.setGE(GE);
        nuevo.setGDif(GDif);
        nuevo.setPuntos(puntos);
        if(getlistaEquipo()==null)
        {
            nuevo.setSiguienteEquipo(null);
            setlistaEquipo(nuevo);
        }
        else
        {
            NodoEquipo auxiliar=getlistaEquipo();
            while (auxiliar.getSiguienteEquipo()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEquipo();             
            }
            auxiliar.setSiguienteEquipo(nuevo);
        }        
    }      
       
 //METODO PARA BUSCAR LOS MEJORES 5 GOLEADORES DE TODOS LOS EQUIPOS      
 public void MejoresG() {
       NodoEquipo equipos = getlistaEquipo();
       
       while(equipos!=null){
           NodoJugador jugadores = equipos.getJugadores();
           while (jugadores!=null) {
               
               if (jugadores.getGoles()> getGoles1()) {
                   goleador5=getGoleador4();
                   goles5=getGoles4();
                   goleador4=getGoleador3();
                   goles4=getGoles3();
                   goleador3=getGoleador2();
                   goles3=getGoles2();
                   goleador2=getGoleador1();
                   goles2=getGoles1();
                   goleador1=equipos.getNombre() + " , " + jugadores.getNombre() + " , " + jugadores.getGoles();
                   goles1=jugadores.getGoles();
               }else
               if (jugadores.getGoles()> getGoles2()) {
                   goleador5=getGoleador4();
                   goles5=getGoles4();
                   goleador4=getGoleador3();
                   goles4=getGoles3();
                   goleador3=getGoleador2();
                   goles3=getGoles2();
                   goleador2=equipos.getNombre() + " , " + jugadores.getNombre() + " , " + jugadores.getGoles();
                   goles2=jugadores.getGoles();
               }else
                   if (jugadores.getGoles()> getGoles3()) {
                   goleador5=getGoleador4();
                   goles5=getGoles4();
                   goleador4=getGoleador3();
                   goles4=getGoles3();
                   goleador3=equipos.getNombre() + " , " + jugadores.getNombre() + " , " + jugadores.getGoles();
                   goles3=jugadores.getGoles();
               }else
                       if (jugadores.getGoles()> getGoles4()) {
                   goleador5=getGoleador4();
                   goles5=getGoles4();
                   goleador4=equipos.getNombre() + " , " + jugadores.getNombre() + " , " + jugadores.getGoles();
                   goles4=jugadores.getGoles();
               }else
                            if (jugadores.getGoles()> getGoles5()) {
                   goleador5=getGoleador4();
                   goles5=getGoles4();
                   goleador5=equipos.getNombre() + " , " + jugadores.getNombre() + " , " + jugadores.getGoles();
                   goles5=jugadores.getGoles();
               }
              jugadores=jugadores.getSiguienteJugador();
           }
           equipos=equipos.getSiguienteEquipo();
       }
    }
          
       
   //METODO PARA IMPRIMIR EL EQUIPO(X) CON SUS JUGADORES    
  public  NodoEquipo ImpEQUIPOS_X(String nombre)
 {
     NodoEquipo prueba = listaEquipo;
     
     
     while (prueba!=null) {
         if(prueba.getNombre().contains(nombre))
         {
             System.out.println(prueba.getNombre());
             NodoJugador recorridoJugadores=prueba.getJugadores();
            while(recorridoJugadores!=null)
            {
                System.out.println(recorridoJugadores.getNombre() + " " +recorridoJugadores.getEdad());
                recorridoJugadores=recorridoJugadores.getSiguienteJugador();
           }
            return prueba;
         }else
         {
         prueba=prueba.getSiguienteEquipo();
         }
         
     }
     return prueba;
 }
       
  //METODO PARA BUSCAR EQUIPO(X)     
    public  NodoEquipo BuscarEQ(String nombre)
 {
     NodoEquipo prueba = listaEquipo;
     
     while (prueba!=null) {
         if(prueba.getNombre().contains(nombre))
         {
             //System.out.println(prueba.getNombre());
            
            return prueba;
         }else
         {
         prueba=prueba.getSiguienteEquipo();
         }
         
     }
     return prueba;
 }   
   
  //Inserta los equipos ya ordenados  
 public void Insertar(NodoEquipo dato) {
 
        if (getlistaEquipo() == null) {
            dato.setSiguienteEquipo(null);
            
            setlistaEquipo(dato);
        } else {
            dato.setSiguienteEquipo(getlistaEquipo());
            setlistaEquipo(dato);
        }
    }
     
 //METODO PARA CONTAR LA CANTIDAD DE QUIPOS INSERTADOS  
 public int Cantidad() {
        int cont = 0;
        NodoEquipo conta = getlistaEquipo();
        while (conta != null) {
            conta = conta.getSiguienteEquipo();
            cont++;
        }
        return cont++;
    }
      
 //ORDENA LOS EQUIPOS POR ORDEN ALFABETICO      
public NodoEquipo[] ordInscNameAlfa(NodoEquipo[] arreglo) {
        int in;
 
        for (int i = 1 ; i < arreglo.length ; i++) {
            NodoEquipo aux = arreglo[i];
            in = i;    //inicia el desplazamiento en i
             
            while (in > 0 && arreglo[in - 1].getNombre().compareTo(aux.getNombre()) > 0) {
                arreglo[in] = arreglo[in - 1];    //desplaza el elemento hacia la derecha
                --in;
            }
 
            arreglo[in] = aux;    //inserta elemento
        }
        return arreglo;
    }
 
//INSERTA LOS EQUIPOS DESORDENADOS EN UN ARREGLO
 public void arreglo() {
        NodoEquipo recorrido = getlistaEquipo();
        NodoEquipo arreglo[] = new NodoEquipo[Cantidad()];
        int cont = 0;
        while (recorrido != null) {
            arreglo[cont] = recorrido;
            cont++;
            recorrido = recorrido.getSiguienteEquipo();
        }
        arreglo = ordInscNameAlfa(arreglo);
                //ordenamientoburbuja(arreglo);
        setlistaEquipo(null);
        for (int i = arreglo.length-1; i >= 0; i--) {
            Insertar(arreglo[i]);
        }

    }
    
 //IMPRIME LOS EQUIPOS CON LOS JUGADORES RESPECTIVOS
    public void Imprimir()
    {
        NodoEquipo recorridoEquipo=getlistaEquipo();
        
        System.out.println("Listado de todos los elementos de la lista");
        while(recorridoEquipo!=null)
        {
            System.out.println(recorridoEquipo.getNombre());
            
            NodoJugador recorridoJugadores=recorridoEquipo.getJugadores();
            while(recorridoJugadores!=null)
            {
                System.out.println(recorridoJugadores.getNombre() + " " +recorridoJugadores.getEdad());
                recorridoJugadores=recorridoJugadores.getSiguienteJugador();
            }
            recorridoEquipo=recorridoEquipo.getSiguienteEquipo();
        }
        System.out.println();
    }
    
    
      public void ImprimirPrueba()
    {
        NodoEquipo recorridoEquipo=getlistaEquipo();
          System.out.print(recorridoEquipo.getNombre());  
    }
    
    
    public boolean EstaVacia()
    {
        return getlistaEquipo()==null;
    }

    /**
     * @return the raiz
     */
    public NodoEquipo getlistaEquipo() {
        return listaEquipo;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setlistaEquipo(NodoEquipo listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    /**
     * @return the goleador2
     */
    public String getGoleador2() {
        return goleador2;
    }

    /**
     * @param goleador2 the goleador2 to set
     */
    public void setGoleador2(String goleador2) {
        this.goleador2 = goleador2;
    }

    /**
     * @return the goleador3
     */
    public String getGoleador3() {
        return goleador3;
    }

    /**
     * @param goleador3 the goleador3 to set
     */
    public void setGoleador3(String goleador3) {
        this.goleador3 = goleador3;
    }

    /**
     * @return the goleador4
     */
    public String getGoleador4() {
        return goleador4;
    }

    /**
     * @param goleador4 the goleador4 to set
     */
    public void setGoleador4(String goleador4) {
        this.goleador4 = goleador4;
    }

    /**
     * @return the goleador5
     */
    public String getGoleador5() {
        return goleador5;
    }

    /**
     * @param goleador5 the goleador5 to set
     */
    public void setGoleador5(String goleador5) {
        this.goleador5 = goleador5;
    }

    /**
     * @return the goles1
     */
    public int getGoles1() {
        return goles1;
    }

    /**
     * @param goles1 the goles1 to set
     */
    public void setGoles1(int goles1) {
        this.goles1 = goles1;
    }

    /**
     * @return the goles2
     */
    public int getGoles2() {
        return goles2;
    }

    /**
     * @param goles2 the goles2 to set
     */
    public void setGoles2(int goles2) {
        this.goles2 = goles2;
    }

    /**
     * @return the goles3
     */
    public int getGoles3() {
        return goles3;
    }

    /**
     * @param goles3 the goles3 to set
     */
    public void setGoles3(int goles3) {
        this.goles3 = goles3;
    }

    /**
     * @return the goles4
     */
    public int getGoles4() {
        return goles4;
    }

    /**
     * @param goles4 the goles4 to set
     */
    public void setGoles4(int goles4) {
        this.goles4 = goles4;
    }

    /**
     * @return the goles5
     */
    public int getGoles5() {
        return goles5;
    }

    /**
     * @param goles5 the goles5 to set
     */
    public void setGoles5(int goles5) {
        this.goles5 = goles5;
    }

    /**
     * @return the goleador1
     */
    public String getGoleador1() {
        return goleador1;
    }

    /**
     * @param goleador1 the goleador1 to set
     */
    public void setGoleador1(String goleador1) {
        this.goleador1 = goleador1;
    }
    
    
    
    
}
