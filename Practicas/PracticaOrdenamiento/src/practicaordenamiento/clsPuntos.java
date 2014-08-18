/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaordenamiento;

import java.util.Random;

/**
 *
 * @author profe
 */
public class clsPuntos {
   private double x;
private double y;

public void Punto (double x , double y) {
this.x = x;
this.y = y;
}
public void Punto () {
double r;
r = Random.real (0 , 1000);
this.x = r;
r = Random. real (0 , 1000);
this.y = r;

}
public double getX () {
return x;
}
public double getY () {
return y;
}
public double distancia (Punto p) {
return ( Math . sqrt ((this. x - p. getX ()) * (this. x - p. getX ())
+ (this.y - p. getY ()) * (this.y - p. getY ())));
}


   
    
}
