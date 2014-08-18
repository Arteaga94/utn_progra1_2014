/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16;

/**
 *
 * @author profe
 */
public class BusquedaLineal {
    public int BuscarNombre (String[] nombres,String busqueda )
    {
        for (int i = 0; i < 10; i++) {
           if(nombres[i].equals(busqueda)) 
           {
           return i;
           }
        }
        return -1;
    }
    
            
    
}
