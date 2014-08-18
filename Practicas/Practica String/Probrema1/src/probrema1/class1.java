/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package probrema1;

/**
 *
 * @author Estudiante
 */
public class class1 {
    private String cadena;
    
    
    public String Mitadcadena()
            
    {
        String retornar="";
        for (int i = getCadena().length()-1; i >=0 ; i--) {
            retornar += getCadena().charAt(i);
        }
        return retornar;
    }
    
    public String hacerpalindromo(String a){
        for (int i = getCadena().length()-2; i >=0 ; i--) {
            a += getCadena().charAt(i);
        }
        return a;
    }
     public String palindromo()
    {
    String palrevez="";
        for (int i = getCadena().length()-1; i >= 0; i--) {
            palrevez+=getCadena().charAt(i);
        }
        if(getCadena().equals(palrevez))
        {return palrevez;}
        else
        {return hacerpalindromo(cadena);}
    }
     
    public String buscarPalabra(String textoAUsar)
{
    // Busca la palabra
    int pos = textoAUsar.indexOf(cadena);
    if(pos != -1)
    {
    // Agregamos "_"
    String textoAMostrar=textoAUsar.substring(0,pos)+"_"
    +textoAUsar.substring(pos);
    return textoAMostrar;
    }
    else
    {
    return ("No fue encontrado el string " + cadena + " en el texto ");
    }
} 
     
     
     public static int buscarCantidad(String palabra , String textoAUsar) {
// Contamos cuantas veces esta la palabra
int veces = 0;
int pos = 0;
while ( pos != -1) {
// Buscamos string y contamos , buscamos desde pos +1 para no volver a
// leer la misma palabra
pos = textoAUsar.indexOf ( palabra , pos + 1);
// si pos es distinta de -1 contamos una vez mas
if ( pos != -1) {
veces ++;
}
}
return veces ;
}   
     
     
     
     

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
}
