/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class19;

/**
 *
 * @author Profe
 */
public class Class19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pila o = new Pila();
        o.Push("Efren");
        o.Push("Joss");
        o.Push("AndreY");
        o.Push("Jose");
        o.imprimir();
        System.out.println("La cantidad de elementos es:  " + o.cantidad());
        if (!o.Vacia()) {
            System.out.println("La pila no esta vacia");
        } else {
            System.out.println("La pila esta vacia");
        }
        o.Pop();
        o.Pop();
        o.imprimir();
        
        
        Cola u = new Cola();
        u.Encolar("Efren");
        u.Encolar("Joss");
        u.Encolar("Andrey");
        u.Encolar("Jose");
        u.imprimir();
        u.Desencolar();
        u.imprimir();
    }
}
