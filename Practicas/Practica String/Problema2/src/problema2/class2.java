/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problema2;

/**
 *
 * @author Dinier
 */
public class class2 {
    
    private String cadena2;
        /* *
    * Retorna el substring que va desde la posicion begin a la posicion end ,
    * inclusive. Devuelve null si existe algun problema con los indices
    * recibido .
    */
    public String substring(int begin , int end) {
        int ci = cadena2.length()-1;
    if ( begin < 0 ||end > ci){
        return null;}
    else{
        String res = "";
        for (int i = begin ; i <= end ; i ++)
            res += cadena2.charAt (i);
        return res ;
    }
    }
    /* *
    * Retorna un string equivalente al actual , pero con todas las letras
    * convertidas a mayuscula. Ignora caracteres que no pertenezcan al alfabeto
    * ingles
    */
    public String toUpperCase() {
    String res = "";
    for (int i = 0; i < cadena2.length (); i ++) {
    char aux = cadena2.charAt (i );
    if ('a' <= aux && aux <= 'z')
    res += (char) ( aux + 'A' - 'a');
    else
    res += aux ;
    }
    return res ;
    }
    /* *
    * Retorna el string que representa al entero i.
    */
    public  String valueOf (int i) {
    if (i == 0){
    return "0";}
    else{
        boolean negative = false;
        if (i < 0) {
            negative = true;
            i = -i;
            }
            String res = "";
            while (i > 0) {
            res = "El string el indice "+i+" es: "+cadena2.charAt(i);
            i /= 10;
        }
        if ( negative )
            res = " -" + res;
        return res ;
    }
    }
    /* *
    * Retorna el indice en que se encuentra el string str en el string actual ,
    * o -1 si es que no se encuentra (o cualquier otro problema ). Solo
    * encuentra str a a partir del indice from .
    */
    public int indexOf (String str , int from ) {
        for (int i = from ; i < cadena2.length (); i ++) {
            for (int j = 0; (i + j < cadena2.length ())
                && cadena2.charAt (i + j) == str.charAt (j ); j ++) {
            if (j == str . length () - 1)
                return i;
            }
        }
        return -1;
    }

    /**
     * @return the cadena2
     */
    public String getCadena2() {
        return cadena2;
    }

    /**
     * @param cadena2 the cadena2 to set
     */
    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }
}
