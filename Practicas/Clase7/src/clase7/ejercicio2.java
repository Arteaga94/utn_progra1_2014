/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Estudiante
 */
public class ejercicio2 {
    
    private String cadena;
    
    public String mediacadena()
    {
    String retorno = "";
        for (int i = 0; i < getCadena().length()/2; i++) {
            retorno+=getCadena().charAt(i);
            
        }
        return retorno;
    }
    
    public String ultimovalor()
    {
    return getCadena().charAt(getCadena().length()-1)+"";
    }
    
    
    public String alrevez()
    {
    String retorno="";
        for (int i = getCadena().length()-1; i >= 0; i--) {
           retorno+=getCadena().charAt(i); 
        }
        return retorno;
    }
    
    
    public String guion()
    {
    String retorno="";
        for (int i = 0; i < getCadena().length(); i++) {
            if(getCadena().length()-1==i)
            {
            retorno+=getCadena().charAt(i);
            }
            else
            {
            retorno+=getCadena().charAt(i)+"-";
            }
            
        }
        return retorno;
            
    }
    
    public int vocales()
            
    {
        int cantidadvocales=0;
        for (int i = 0; i < getCadena().length(); i++) {
            if(
                    (getCadena().charAt(i)=='a')||
                    (getCadena().charAt(i)=='A')||
                    (getCadena().charAt(i)=='e')||
                    (getCadena().charAt(i)=='E')||
                    (getCadena().charAt(i)=='i')||
                    (getCadena().charAt(i)=='I')||
                    (getCadena().charAt(i)=='o')||
                    (getCadena().charAt(i)=='O')||
                    (getCadena().charAt(i)=='u')||
                    (getCadena().charAt(i)=='U'))
            {
            cantidadvocales++;
            }
        }
        return cantidadvocales;
    }
    
    public boolean palindromo()
    {
    String palabraalrevez="";
        for (int i = getCadena().length()-1; i >= 0; i--) {
            palabraalrevez+=getCadena().charAt(i);
        }
        if(getCadena().equals(palabraalrevez))
        {return true;}
        else
        {return false;}
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
